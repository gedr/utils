package ru.gedr.tuple;

import java.io.Serializable;
import java.util.List;

public interface Tuple extends Serializable {
	int getDimension();
	<TT> TT getBy(int index);
	List<Object> toList();
	Object[] toArray();
}
