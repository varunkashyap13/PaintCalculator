package edu.jhupte.cs605201.part4;

/**
 *
 * @author Varun Kashyap
 */
public class Door extends edu.jhupte.cs605201.part3.Surface
		implements
			RoomFeatures.Doors {

	public Door() {
		super();
	}

	public Door(double l, double w) {
		super(l, w);
	}

	@Override
	public Door setLength(double l) {
		super.setLength(l);
		return this;
	}

	@Override
	public Door setWidth(double w) {
		super.setWidth(w);
		return this;
	}

}
