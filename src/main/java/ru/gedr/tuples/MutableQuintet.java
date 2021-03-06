package ru.gedr.tuples;

public class MutableQuintet<Ta, Tb, Tc, Td, Te> extends ImmutableQuintet<Ta, Tb, Tc, Td, Te> {
	// =================================================================================================================
	// Constants
	// =================================================================================================================
	private static final long serialVersionUID = 1L;

	// =================================================================================================================
	// Fields
	// =================================================================================================================

	// =================================================================================================================
	// Constructors
	// =================================================================================================================
	public MutableQuintet() {
		super(null, null, null, null, null);
	}

	public MutableQuintet(Ta first, Tb second, Tc third, Td fourth, Te fifth) {
		super(first, second, third, fourth, fifth);
	}

	// =================================================================================================================
	// Methods for/from SuperClass/Interface
	// =================================================================================================================

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public static <A, B, C, D, E> MutableQuintet<A, B, C, D, E> of(A first, B second, C third, D fourth, E fifth) {
		return new MutableQuintet<A, B, C, D, E>(first, second, third, fourth, fifth);
	}

	public void setFirst(Ta first) {
		this.first = first;
	}

	public void setSecond(Tb second) {
		this.second = second;
	}

	public void setThird(Tc third) {
		this.third = third;
	}

	public void setFourth(Td fourth) {
		this.fourth = fourth;
	}

	public void setFifth(Te fifth) {
		this.fifth = fifth;
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================

}
