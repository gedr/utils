package ru.gedr.tuples;

import ru.gedr.comparators.GenericComparator;

public abstract class Quartet<Ta, Tb, Tc, Td> extends Tuple {
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

	// =================================================================================================================
	// Methods for/from SuperClass/Interface
	// =================================================================================================================
	@Override
	public int getDimension() {
		return 4;
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

			default :
				throw new IndexOutOfBoundsException("Tuple Quartet haven't index=" + index);
		}
	}

	@Override
	public String toString(String format) {
		return String.format(format, getFirst(), getSecond(), getThird(), getFourth());
	}

	@SuppressWarnings("unchecked")
	public int compareTo(Object o) {
		try {
			Quartet<?, ?, ?, ?> t = (Quartet<?, ?, ?, ?>) o;

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

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
