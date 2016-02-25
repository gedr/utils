package ru.gedr.tuples;

public class ImmutableEnnead<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti> extends Ennead<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti> {
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
	protected Th eighth;
	protected Ti ninth;

	// =================================================================================================================
	// Constructors
	// =================================================================================================================
	public ImmutableEnnead(Ta first, Tb second, Tc third, Td fourth, Te fifth, Tf sixth, Tg seventh, Th eighth, Ti ninth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth;
		this.sixth = sixth;
		this.seventh = seventh;
		this.eighth = eighth;
		this.ninth = ninth;
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

	@Override
	public Th getEighth() {
		return eighth;
	}

	@Override
	public Ti getNinth() {
		return ninth;
	}

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public static <A, B, C, D, E, F, G, H, I> ImmutableEnnead<A, B, C, D, E, F, G, H, I> of(A first, B second, C third, D fourth, E fifth
			, F sixth, G seventh, H eighth, I ninth) {
		return new ImmutableEnnead<A, B, C, D, E, F, G, H, I>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth);
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
