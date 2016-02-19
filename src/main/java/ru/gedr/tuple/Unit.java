package ru.gedr.tuple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class Unit<T> implements Tuple {
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
		return 1;
	}

	public <TT> TT getBy(int index) {
		if (index == 1) {
			@SuppressWarnings("unchecked")
			TT tt = (TT) getFirst();
			return tt;
		}
		throw new IndexOutOfBoundsException("Tuple Unit haven't index=" + index);
	}

	public List<Object> toList() {
		List<Object> lst = new ArrayList<Object>(getDimension());
		lst.add(getValue());
		return lst;
	}

	public Object[] toArray() {
		return  new Object[] { getFirst() };
	}

	@Override
	public String toString() {
		return "(" + getFirst() + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getValue());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Unit<?>) {
			Unit<?> that = (Unit<?>) obj;
			return (this.getDimension() == that.getDimension())
					&& Objects.equals(this.getFirst(), that.getFirst());
		}
		return false;
	}

	public Iterator<Object> iterator() {
		return new TupleIterator(this);
	}

	public int compareTo(Object o) {
		@SuppressWarnings("unchecked")
		T thatValue = (T) ((Unit<?>) o).getFirst();

		if ( Objects.equals(this.getFirst(), thatValue) ) {
			return 0;
		}
		if ((this.getFirst() != null) && (this.getFirst() instanceof Comparable<?>)) {
			@SuppressWarnings("unchecked")
			Comparable<? super T> cmpr = (Comparable<? super T>) this.getFirst();
			return thatValue == null ? -1 : cmpr.compareTo(thatValue);

		}
		if ((thatValue != null) && (thatValue instanceof Comparable<?>)) {
			@SuppressWarnings("unchecked")
			Comparable<? super T> cmpr = (Comparable<? super T>) thatValue;
			return this.getFirst() == null ? +1 : cmpr.compareTo(this.getFirst());

		}
		throw new UnsupportedOperationException("not found Comparable interface");
	}


	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public abstract T getValue();
	public abstract T getFirst();

    public String toString(String format) {
        return String.format(format, getFirst());
    }

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================

}
