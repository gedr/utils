package ru.gedr.tuples;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TupleIterator implements Iterator<Object> {
	private Tuple tuple;
	private int pos = 0;

	public TupleIterator(Tuple tuple) {
		this.tuple = tuple;
	}

	public boolean hasNext() {
		return pos < tuple.getDimension();
	}

	public Object next() {
		if (pos < tuple.getDimension()) {
			return tuple.getBy(++pos);
		}
		throw new NoSuchElementException();
	}
}
