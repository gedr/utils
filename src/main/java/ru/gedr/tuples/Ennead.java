package ru.gedr.tuples;

public abstract class Ennead<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti>  extends Tuple {

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
		return 9;
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

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}