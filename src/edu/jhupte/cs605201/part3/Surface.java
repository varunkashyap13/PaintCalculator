package edu.jhupte.cs605201.part3;

/**
 *
 * @author Varun Kashyap
 */
public class Surface implements Rectangles {

	private double length;
	private double width;

	{
		length = 1;
		width = 1;
	}

	public Surface() {
	}

	public Surface(double l, double w) {
		length = l;
		width = w;
	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public Surface setLength(double feet) {
		length = feet;
		return this;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public Surface setWidth(double feet) {
		width = feet;
		return this;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	public String toString() {
		return getClass().getName() + "[L=" + length + "W=" + width + " A="
				+ getArea() + "]@Ox" + String.format("%h", hashCode());
	}

	public static void main(String[] args) {

	}
}
