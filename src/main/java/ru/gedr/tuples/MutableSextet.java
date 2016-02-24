package ru.gedr.tuples;

public class MutableSextet<Ta, Tb, Tc, Td, Te, Tf> extends ImmutableSextet<Ta, Tb, Tc, Td, Te, Tf> {
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
	public MutableSextet() {
		super(null, null, null, null, null, null);
	}

	public MutableSextet(Ta first, Tb second, Tc third, Td fourth, Te fifth, Tf sixth) {
		super(first, second, third, fourth, fifth, sixth);
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
	public static <A, B, C, D, E, F> MutableSextet<A, B, C, D, E, F> of(A first, B second, C third, D fourth, E fifth, F sixth) {
		return new MutableSextet<A, B, C, D, E, F>(first, second, third, fourth, fifth, sixth);
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

	public void setSixth(Tf sixth) {
		this.sixth = sixth;
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================

}
