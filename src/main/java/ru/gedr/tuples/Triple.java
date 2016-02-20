package ru.gedr.tuples;

import ru.gedr.comparators.GenericComparator;


public abstract class Triple<Ta, Tb, Tc> extends Tuple {
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
	public String toString(String format) {
		return String.format(format, getFirst(), getSecond(), getThird());
	}

	@Override
	public int getDimension() {
		return 3;
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

			default :
				throw new IndexOutOfBoundsException("Tuple Triple haven't index=" + index);
		}
	}

	@SuppressWarnings("unchecked")
	public int compareTo(Object o) {
		try {
			Triple<?, ?, ?> t = (Triple<?, ?, ?>) o;

			int res = GenericComparator.compare(this.getFirst(), (Ta) t.getFirst());
			if (res == 0) {
				res = GenericComparator.compare(this.getSecond(), (Tb) t.getSecond());
			}
			if (res == 0) {
				res = GenericComparator.compare(this.getThird(), (Tc) t.getThird());
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

	public abstract Ta getLeft();
	public abstract Tb getMiddle();
	public abstract Tc getRight();

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
