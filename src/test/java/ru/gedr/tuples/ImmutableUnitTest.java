package ru.gedr.tuples;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ImmutableUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetValue() {
		Unit<Integer> ui = new ImmutableUnit<Integer>(10);
		assertThat(ui.getValue(), equalTo(10));
	}

	@Test
	public void testGetFirst() {
		Unit<Boolean> ui = new ImmutableUnit<Boolean>(Boolean.FALSE);
		assertThat(ui.getValue(), not(equalTo(Boolean.TRUE)));
	}

	@Test
	public void testOf() {
		ImmutableUnit<Double> iu = ImmutableUnit.of(3.14);
		assertThat(iu.getValue(), equalTo(3.14));
	}

	@Test
	public void testEquals() {
		ImmutableUnit<String> ius1 = ImmutableUnit.of("hello");
		ImmutableUnit<Integer> iui = ImmutableUnit.of(100);
		ImmutableUnit<String> ius2 = ImmutableUnit.of("world");
		ImmutableUnit<String> ius3 = ImmutableUnit.of("hello");
		ImmutableUnit<String> ius4 = ImmutableUnit.of("HELLO");

		assertThat(ius1, equalTo(ius1));
		assertFalse(ius1.equals(iui));
		assertThat(ius1, not(equalTo(ius2)));
		assertThat(ius1, equalTo(ius3));
		assertThat(ius1, not(equalTo(ius4)));
	}

	@Test
	public void testToString() {
		ImmutableUnit<String> ius = ImmutableUnit.of("hello");
		assertTrue("(hello)".equals(ius.toString()));
		assertTrue("Unit ( hello )".equals(ius.toString("Unit ( %s )")));
	}

}
