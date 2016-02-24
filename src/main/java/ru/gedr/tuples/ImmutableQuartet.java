package ru.gedr.tuples;

public class ImmutableQuartet<Ta, Tb, Tc, Td> extends Quartet<Ta, Tb, Tc, Td> {
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
	protected Td fourth;

	// =================================================================================================================
	// Constructors
	// =================================================================================================================
	public ImmutableQuartet(Ta first, Tb second, Tc third, Td fourth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
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
	public Td getFourth() {
		return fourth;
	}

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public static <A, B, C, D> ImmutableQuartet<A, B, C, D> of(A first, B second, C third, D fourth) {
		return new ImmutableQuartet<A, B, C, D>(first, second, third, fourth);
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}