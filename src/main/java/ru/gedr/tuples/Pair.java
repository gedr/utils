package ru.gedr.tuples;

import java.util.Map;

import ru.gedr.comparators.GenericComparator;

public abstract class Pair<Ta, Tb> extends Tuple implements Map.Entry<Ta, Tb> {
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
		return 2;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TT> TT getBy(int index) {
		switch (index) {
			case 1 :
				return (TT) getFirst();
			case 2 :
				return (TT) getSecond();

			default :
				throw new IndexOutOfBoundsException("Tuple Pair haven't index=" + index);
		}
	}

	@Override
    public String toString(String format) {
        return String.format(format, getFirst(), getSecond());
    }

	@SuppressWarnings("unchecked")
	public int compareTo(Object o) {
		try {
			Pair<?, ?> p = (Pair<?, ?>) o;

			int res = GenericComparator.compare(this.getFirst(), (Ta) p.getFirst());
			if (res == 0) {
				res = GenericComparator.compare(this.getSecond(), (Tb) p.getSecond());
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

	public abstract Ta getLeft();
	public abstract Tb getRight();

	public abstract Ta getKey();
	public abstract Tb getValue();

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
