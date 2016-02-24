package ru.gedr.tuples;

import ru.gedr.comparators.GenericComparator;

public abstract class Decade<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti, Tj> extends Ennead<Ta, Tb, Tc, Td, Te, Tf, Tg, Th, Ti> {
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
		return 10;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TT> TT getBy(int index) {
		if (index == 10) {
			return (TT) getTenth();
		}
		return super.getBy(index);
	}

	@Override
	public String toString(String format) {
		return String.format(format, getFirst(), getSecond(), getThird(), getFourth(), getFifth(), getSixth(),
				getSeventh(), getEighth(), getNinth(), getTenth());
	}

	@SuppressWarnings("unchecked")
	public int compareTo(Object o) {
		int res = super.compareTo(o);
		if (res == 0) {
			try {
				Decade<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> t = (Decade<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
				res = GenericComparator.compare(this.getTenth(), (Tj) t.getTenth());
			} catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
		return res;
	}
	// =================================================================================================================
	// Getter & Setter
	// =================================================================================================================

	// =================================================================================================================
	// Methods
	// =================================================================================================================
	public abstract Tj getTenth();

	// =================================================================================================================
	// Inner and Anonymous Classes
	// =================================================================================================================
}
