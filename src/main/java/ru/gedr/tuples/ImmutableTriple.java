package ru.gedr.tuples;

public class ImmutableTriple<Ta, Tb, Tc> extends Triple<Ta, Tb, Tc> {
	// =================================================================================================================
	// Constants
	// =================================================================================================================
	private static final long serialVersionUID = 1L;

	// =================================================================================================================
	// Fields
	// =================================================================================================================
	protected Ta first;
	protected Tb second;
	protected Tc third;

	// =================================================================================================================
	// Constructors
	// =================================================================================================================
	public ImmutableTriple(Ta first, Tb second, Tc third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	// =================================================================================================================
	// Methods for/from SuperClass/Interface
	// =================================================================================================================
	@Override
	public Ta getFirst() {
		return first;
	}

	@Override
	public Tb getSecond() {
		return second;
	}

	@Override
	public Tc getThird() {
		return third;
	}

	@Override
	public Ta getLeft() {
		return first;
	}

	@Override
	public Tb getMiddle() {
		return second;
	}

	@Override
	public Tc getRight() {
		return third;
	}

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public static <A, B, C> ImmutableTriple<A, B, C> of(A first, B second, C third) {
		return new ImmutableTriple<A, B, C>(first, second, third);
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}