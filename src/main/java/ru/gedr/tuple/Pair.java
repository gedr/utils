package ru.gedr.tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class Pair<Ta, Tb> implements Map.Entry<Ta, Tb>, Tuple {
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
	public int getDimension() {
		return 2;
	}

	public <TT> TT getBy(int index) {
		if (index == 1) {
			@SuppressWarnings("unchecked")
			TT tt = (TT) getFirst();
			return tt;
		}
		if (index == 2) {
			@SuppressWarnings("unchecked")
			TT tt = (TT) getSecond();
			return tt;
		}
		throw new IndexOutOfBoundsException("Tuple Pair haven't index=" + index);
	}

	public List<Object> toList() {
		List<Object> lst = new ArrayList<Object>(getDimension());
		lst.add(getFirst());
		lst.add(getSecond());
		return lst;
	}

	public Object[] toArray() {
		return  new Object[] { getFirst(), getSecond() };
	}

	@Override
	public String toString() {
		return "(" + getFirst() + ", " + getSecond() + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(getFirst(), getSecond());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Pair<?, ?>) {
			Pair<?, ?> that = (Pair<?, ?>) obj;
			return (this.getDimension() == that.getDimension())
					&& Objects.equals(this.getFirst(), that.getFirst())
					&& Objects.equals(this.getSecond(), that.getSecond()) ;
		}
		return false;
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

    public String toString(String format) {
        return String.format(format, getFirst(), getSecond());
    }

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
