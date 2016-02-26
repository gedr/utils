package ru.gedr.tuples;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ImmutableUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetDimension() {
		Unit<String> us = ImmutableUnit.of("hello");
		assertThat(1, equalTo(us.getDimension()));
	}

	@Test
	public void testGetValue() {
		Unit<TestA> uo = new ImmutableUnit<TestA>(new TestA(1, "Test"));
		Unit<Integer> ui = new ImmutableUnit<Integer>(10);
		assertThat(ui.getValue(), equalTo(10));
		assertThat(uo.getValue(), equalTo(new TestA(1, "test")));
	}

	@Test
	public void testGetFirst() {
		Unit<Boolean> ui = new ImmutableUnit<Boolean>(Boolean.FALSE);
		assertThat(ui.getValue(), equalTo(false));
	}

	@Test
	public void testOf() {
		Unit<Double> ud = ImmutableUnit.of(3.14);
		assertThat(ud.getValue(), equalTo(3.14));
	}

	@Test
	public void testEquals() {
		Unit<String> ius1 = ImmutableUnit.of("hello");
		Unit<Integer> iui = ImmutableUnit.of(100);
		Unit<String> ius2 = ImmutableUnit.of("world");
		Unit<String> ius3 = ImmutableUnit.of("hello");
		Unit<String> ius4 = ImmutableUnit.of("HELLO");

		assertThat(ius1, equalTo(ius1));
		assertFalse(ius1.equals(iui));
		assertThat(ius1, not(equalTo(ius2)));
		assertThat(ius1, equalTo(ius3));
		assertThat(ius1, not(equalTo(ius4)));

		Unit<TestA> uo0 = ImmutableUnit.of(new TestA());
		Unit<TestA> uo1 = ImmutableUnit.of(new TestA(1, "test"));
		Unit<TestA> uo2 = ImmutableUnit.of(new TestA(1, "TesT"));

		assertThat(uo0, equalTo(uo0));
		assertThat(uo1, equalTo(uo1));
		assertThat(uo1, equalTo(uo2));
		assertThat(uo2, equalTo(uo2));
		assertThat(uo1, not(equalTo(uo0)));
		assertThat(uo2, not(equalTo(uo0)));
	}

	@Test
	public void testToString() {
		ImmutableUnit<String> ius = ImmutableUnit.of("hello");
		assertTrue("(hello)".equals(ius.toString()));
		assertTrue("Unit ( hello )".equals(ius.toString("Unit ( %s )")));
	}

	@Test
	public void testIterator() {
		ImmutableUnit<String> ius = ImmutableUnit.of("hello");
		String res = null;
		int cnt = 0;
		for (Object it : ius) {
			cnt++;
			res = (String) it;
		}
		assertThat(res, equalTo("hello"));
		assertThat(cnt, equalTo(1));
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testCompareTo1() {
		Unit<TestA> uo1 = ImmutableUnit.of(new TestA(1, "one"));
		Unit<TestA> uo2 = ImmutableUnit.of(new TestA(2, "two"));
		uo1.compareTo(uo2);
	}

	@Test()
	public void testCompareTo2() {
		Unit<TestAA> uo1 = ImmutableUnit.of(new TestAA(1, "one"));
		Unit<TestAA> uo2 = ImmutableUnit.of(new TestAA(2, "two"));
		Unit<TestAA> uo3 = ImmutableUnit.of(new TestAA(3, "three"));
		assertThat(uo1.compareTo(uo1), equalTo(0));
		assertThat(uo1.compareTo(uo2), lessThan(0));
		assertThat(uo3.compareTo(uo2), greaterThan(0));
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testCompareTo3() {
		Unit<TestAA> uo1 = ImmutableUnit.of(new TestAA(1, "one"));
		Unit<TestB> uo2 = ImmutableUnit.of(new TestB());
		assertThat(uo1.compareTo(uo2), equalTo(1));
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetBy1() {
		Unit<TestAA> uo = ImmutableUnit.of(new TestAA(1, "one"));
		uo.getBy(2);
	}

	@Test()
	public void testGetBy2() {
		Unit<TestAA> uo = ImmutableUnit.of(new TestAA(1, "one"));
		TestA a = uo.getBy(1);
		assertThat(a, notNullValue());
	}

	@Test(expected=ClassCastException.class)
	public void testGetBy3() {
		Unit<TestAA> uo = ImmutableUnit.of(new TestAA(1, "one"));
		@SuppressWarnings("unused")
		TestB b = uo.getBy(1);
		fail("unworkable code");
	}

	@Test()
	public void testToList() {
		List<Object> lst = ImmutableUnit.of(new TestAA(1, "one")).toList();
		assertThat(lst, notNullValue());
		assertThat(lst.size(), equalTo(1));
		assertThat(lst.get(0), instanceOf(TestA.class));
	}

	@Test()
	public void testToArray() {
		Object[] arr = ImmutableUnit.of(new TestAA(1, "one")).toArray();
		assertThat(arr, notNullValue());
		assertThat(arr.length, equalTo(1));
		assertThat(arr[0], instanceOf(TestAA.class));
	}

}
