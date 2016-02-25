package ru.gedr.tuples;

public class MutableSeptet<Ta, Tb, Tc, Td, Te, Tf, Tg> extends ImmutableSeptet<Ta, Tb, Tc, Td, Te, Tf, Tg> {
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
	public MutableSeptet() {
		super(null, null, null, null, null, null, null);
	}

	public MutableSeptet(Ta first, Tb second, Tc third, Td fourth, Te fifth, Tf sixth, Tg seventh) {
		super(first, second, third, fourth, fifth, sixth, seventh);
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
	public static <A, B, C, D, E, F, G> MutableSeptet<A, B, C, D, E, F, G> of(A first, B second, C third, D fourth, E fifth
			, F sixth, G seventh) {
		return new MutableSeptet<A, B, C, D, E, F, G>(first, second, third, fourth, fifth, sixth, seventh);
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

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
