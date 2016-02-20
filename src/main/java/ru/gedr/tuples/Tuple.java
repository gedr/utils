package ru.gedr.tuples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class Tuple implements Serializable, Iterable<Object>, Comparable<Object> {
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
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		for (int i = 1; i <= getDimension(); i++) {
			sb.append(getBy(i)).append(i != getDimension() ? ", " : "");
		}
		return sb.append(")").toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(toArray());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Tuple) {
			return Arrays.equals(toArray(), ((Tuple) obj).toArray());
		}
		return false;
	}

	public Iterator<Object> iterator() {
		return new TupleIterator(this);
	}

	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public abstract String toString(String format);
	public abstract int getDimension();
	public abstract <TT> TT getBy(int index);

	public List<Object> toList() {
		List<Object> lst = new ArrayList<Object>(getDimension());
		for (int i = 1; i <= getDimension(); i++) {
			lst.add(getBy(i));
		}
		return lst;
	}

	public Object[] toArray() {
		Object[] res = new Object[getDimension()];
		for (int i = 1; i <= getDimension(); i++) {
			res[i-1] = getBy(i);
		}
		return res;
	}

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
