package ru.gedr.tuples;

public class ImmutableSeptet<Ta, Tb, Tc, Td, Te, Tf, Tg> extends Septet<Ta, Tb, Tc, Td, Te, Tf, Tg> {
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
	protected Tg seventh;

	// =================================================================================================================
	// Constructors
	// =================================================================================================================
	public ImmutableSeptet(Ta first, Tb second, Tc third, Td fourth, Te fifth, Tf sixth, Tg seventh) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth;
		this.sixth = sixth;
		this.seventh = seventh;
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

	@Override
	public Tg getSeventh() {
		return seventh;
	}

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public static <A, B, C, D, E, F, G> ImmutableSeptet<A, B, C, D, E, F, G> of(A first, B second, C third, D fourth, E fifth
			, F sixth, G seventh) {
		return new ImmutableSeptet<A, B, C, D, E, F, G>(first, second, third, fourth, fifth, sixth, seventh);
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
