package edu.jhupte.cs605201.part4;

/**
 *
 * @author Varun Kashyap
 */
public class Window extends edu.jhupte.cs605201.part3.Surface
		implements
			RoomFeatures.Windows {

	public Window() {
		super();
	}

	public Window(double l, double w) {
		super(l, w);
	}

	@Override
	public Window setLength(double l) {
		super.setLength(l);
		return this;
	}

	@Override
	public Window setWidth(double w) {
		super.setWidth(w);
		return this;
	}
}
