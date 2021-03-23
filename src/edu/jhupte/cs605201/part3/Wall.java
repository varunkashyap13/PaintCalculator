package edu.jhupte.cs605201.part3;

/**
 * Class wall. Extends surface. Implements sides.
 *
 * @author Varun Kashyap
 */
public class Wall extends Surface implements Sides {

	private double openingsArea;

	public Wall() {
		super();
	}

	public Wall(double l, double w) {
		super(l, w);
	}

	@Override
	public Sides addOpening(Rectangles s) {
		openingsArea += s.getArea();
		return this;
	}

	@Override
	public Wall setLength(double l) {
		super.setLength(l);
		return this;
	}

	@Override
	public Wall setWidth(double w) {
		super.setLength(w);
		return this;
	}

	@Override
	public double getWidth() {
		return super.getLength();
	}

	@Override
	public double getArea() {
		return super.getArea() - openingsArea;
	}

	@Override
	public Wall setHeight(double height) {
		super.setWidth(height);
		return this;
	}

	@Override
	public double getHeight() {
		return super.getWidth();
	}

	public static void main(String[] args) {
		Wall w = new Wall(3.3, 4.5);
		System.out.println(w);

		Wall w1 = new Wall().setLength(5.4).setHeight(3.9);
		System.out.println(w1);

		Wall w2 = new Wall().setHeight(8.0).setWidth(18.5);
		System.out.println(w2);

		Surface win = new Surface(3, 4);
		System.out.println(win);
		w2.addOpening(win);
		System.out.println(w2);
		w2.addOpening(win);
		w2.setHeight(7.5);
		w2.addOpening(win);
		w2.addOpening(win);
		System.out.println(w2);

	}
}
