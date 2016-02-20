package ru.gedr.tuples;

import ru.gedr.comparators.GenericComparator;

public abstract class Septet<Ta, Tb, Tc, Td, Te, Tf, Tg> extends Tuple {

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
	@Override
	public int getDimension() {
		return 7;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TT> TT getBy(int index) {
		switch (index) {
			case 1 :
				return (TT) getFirst();
			case 2 :
				return (TT) getSecond();
			case 3 :
				return (TT) getThird();
			case 4 :
				return (TT) getFourth();
			case 5 :
				return (TT) getFifth();
			case 6 :
				return (TT) getSixth();

			default :
				throw new IndexOutOfBoundsException("Tuple Sextet haven't index=" + index);
		}
	}

	@Override
	public String toString(String format) {
		return String.format(format, getFirst(), getSecond(), getThird(), getFourth(), getFifth(), getSixth());
	}

	@SuppressWarnings("unchecked")
	public int compareTo(Object o) {
		try {
			Sextet<?, ?, ?, ?, ?, ?> t = (Sextet<?, ?, ?, ?, ?, ?>) o;

			int res = GenericComparator.compare(this.getFirst(), (Ta) t.getFirst());
			if (res == 0) {
				res = GenericComparator.compare(this.getSecond(), (Tb) t.getSecond());
			}
			if (res == 0) {
				res = GenericComparator.compare(this.getThird(), (Tc) t.getThird());
			}
			if (res == 0) {
				res = GenericComparator.compare(this.getFourth(), (Td) t.getFourth());
			}
			if (res == 0) {
				res = GenericComparator.compare(this.getFifth(), (Te) t.getFifth());
			}
			if (res == 0) {
				res = GenericComparator.compare(this.getSixth(), (Tf) t.getSixth());
			}

			return res;
		} catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

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

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
