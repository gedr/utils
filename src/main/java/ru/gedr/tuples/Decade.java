package ru.gedr.tuples;

public abstract class Decade<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti, Tj> extends Tuple {

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString(String format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDimension() {
		return 10;
	}

	@Override
	public <TT> TT getBy(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	// =================================================================================================================
	// Constants
	// =================================================================================================================

	// =================================================================================================================
	// Fields
	// =================================================================================================================

	// =================================================================================================================
	// Constructors
	// =================================================================================================================

	// =================================================================================================================
	// Methods for/from SuperClass/Interface
	// =================================================================================================================

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public abstract Ta getFirst();
	public abstract Tb getSecond();
	public abstract Tc getThird();
	public abstract Td getFourth();
	public abstract Te getFifth();
	public abstract Tf getSixth();
	public abstract Tg getSeventh();
	public abstract Th getEighth();
	public abstract Ti getNinth();
	public abstract Tj getTenth();

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}