package ru.gedr.comparators;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import ru.gedr.tuples.TestA;
import ru.gedr.tuples.TestAA;
import ru.gedr.tuples.TestB;

public class GenericComparatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCompare() {
		assertThat(GenericComparator.compare(10, 2), equalTo(1));
		assertThat(GenericComparator.compare(3, 4), equalTo(-1));
		System.out.println(Integer.compare(10, 2) == 1);
		System.out.println(Integer.compare(3, 4) == -1);
	}

	@Test
	public void testCompare2() {
		assertThat(GenericComparator.compare(new TestAA(10, "10"), new TestAA(20, "20")), equalTo(-1));
	}

	@Test(expected=ClassCastException.class)
	public void testCompare3() {
		assertThat(GenericComparator.compare(new TestAA(10, "10"), new TestA(20, "20")), equalTo(-1));
	}

	@Test(expected=ClassCastException.class)
	public void testCompare4() {
		assertThat(GenericComparator.compare(new TestAA(10, "10"), new TestB()), equalTo(-1));
	}


}
