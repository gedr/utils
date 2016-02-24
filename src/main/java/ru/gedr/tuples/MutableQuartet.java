package ru.gedr.tuples;

public class MutableQuartet<Ta, Tb, Tc, Td> extends ImmutableQuartet<Ta, Tb, Tc, Td> {
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
	public MutableQuartet() {
		super(null, null, null, null);
	}

	public MutableQuartet(Ta first, Tb second, Tc third, Td fourth) {
		super(first, second, third, fourth);
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
	public static <A, B, C, D> MutableQuartet<A, B, C, D> of(A first, B second, C third, D fourth) {
		return new MutableQuartet<A, B, C, D>(first, second, third, fourth);
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

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================

}
