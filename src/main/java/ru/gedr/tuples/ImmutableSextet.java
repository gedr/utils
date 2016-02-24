package ru.gedr.tuples;

public class ImmutableSextet<Ta, Tb, Tc, Td, Te, Tf> extends Sextet<Ta, Tb, Tc, Td, Te, Tf> {
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
	protected Te fifth;
	protected Tf sixth;

	// =================================================================================================================
	// Constructors
	// =================================================================================================================
	public ImmutableSextet(Ta first, Tb second, Tc third, Td fourth, Te fifth, Tf sixth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth;
		this.sixth = sixth;
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

	@Override
	public Te getFifth() {
		return fifth;
	}

	@Override
	public Tf getSixth() {
		return sixth;
	}

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public static <A, B, C, D, E, F> ImmutableSextet<A, B, C, D, E, F> of(A first, B second, C third, D fourth, E fifth, F sixth) {
		return new ImmutableSextet<A, B, C, D, E, F>(first, second, third, fourth, fifth, sixth);
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}