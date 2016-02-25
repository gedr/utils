package ru.gedr.tuples;

public class MutableOctet<Ta, Tb, Tc, Td, Te, Tf, Tg, Th> extends ImmutableOctet<Ta, Tb, Tc, Td, Te, Tf, Tg, Th> {
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
	public MutableOctet() {
		super(null, null, null, null, null, null, null, null);
	}

	public MutableOctet(Ta first, Tb second, Tc third, Td fourth, Te fifth, Tf sixth, Tg seventh, Th eighth) {
		super(first, second, third, fourth, fifth, sixth, seventh, eighth);
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
	public static <A, B, C, D, E, F, G, H> MutableOctet<A, B, C, D, E, F, G, H> of(A first, B second, C third, D fourth, E fifth
			, F sixth, G seventh, H eighth) {
		return new MutableOctet<A, B, C, D, E, F, G, H>(first, second, third, fourth, fifth, sixth, seventh, eighth);
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

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
