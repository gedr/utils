package ru.gedr.tuples;


public class ImmutablePair<Ta, Tb> extends Pair<Ta, Tb> {
	// =================================================================================================================
	// Constants
	// =================================================================================================================
	private static final long serialVersionUID = 1L;

	// =================================================================================================================
	// Fields
	// =================================================================================================================
	protected Ta first;
	protected Tb second;

	// =================================================================================================================
	// Constructors
	// =================================================================================================================
	public ImmutablePair(Ta first, Tb second) {
		this.first = first;
		this.second = second;
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
	public Ta getLeft() {
		return first;
	}

	@Override
	public Tb getRight() {
		return second;
	}

	@Override
	public Ta getKey() {
		return first;
	}

	@Override
	public Tb getValue() {
		return second;
	}

	public Tb setValue(Tb value) {
		throw new UnsupportedOperationException();
	}

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public static <A, B> ImmutablePair<A, B> of(A first, B second) {
		return new ImmutablePair<A, B>(first, second);
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}