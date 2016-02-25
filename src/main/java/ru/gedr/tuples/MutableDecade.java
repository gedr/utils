package ru.gedr.tuples;

public class MutableDecade<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti, Tj> extends
		ImmutableDecade<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti, Tj> {
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
	public MutableDecade() {
		super(null, null, null, null, null, null, null, null, null, null);
	}

	public MutableDecade(Ta first, Tb second, Tc third, Td fourth, Te fifth, Tf sixth, Tg seventh, Th eighth, Ti ninth, Tj tenth) {
		super(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth);
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
	public static <A, B, C, D, E, F, G, H, I, J> MutableDecade<A, B, C, D, E, F, G, H, I, J> of(A first, B second, C third
			, D fourth, E fifth, F sixth, G seventh, H eighth, I ninth, J tenth) {
		return new MutableDecade<A, B, C, D, E, F, G, H, I, J>(first, second, third, fourth, fifth, sixth, seventh, eighth
				, ninth, tenth);
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

	public void getTenth(Tj tenth) {
		this.tenth = tenth;
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
