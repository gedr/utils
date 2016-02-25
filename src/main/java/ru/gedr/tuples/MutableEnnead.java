package ru.gedr.tuples;

public class MutableEnnead<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti> extends ImmutableEnnead<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti> {
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
	public MutableEnnead() {
		super(null, null, null, null, null, null, null, null, null);
	}

	public MutableEnnead(Ta first, Tb second, Tc third, Td fourth, Te fifth, Tf sixth, Tg seventh, Th eighth, Ti ninth) {
		super(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth);
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
	public static <A, B, C, D, E, F, G, H, I> MutableEnnead<A, B, C, D, E, F, G, H, I> of(A first, B second, C third, D fourth
			, E fifth, F sixth, G seventh, H eighth, I ninth) {
		return new MutableEnnead<A, B, C, D, E, F, G, H, I>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth);
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

	public void setSeventh(Tg seventh) {
		this.seventh = seventh;
	}

	public void setEighth(Th eighth) {
		this.eighth = eighth;
	}

	public void getNinth(Ti ninth) {
		this.ninth = ninth;
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
