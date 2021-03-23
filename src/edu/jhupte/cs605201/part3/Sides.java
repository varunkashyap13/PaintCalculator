package edu.jhupte.cs605201.part3;

/**
 * Interface Sides. Extends Rectangles
 * 
 * Sides are Rectangles that allow the incremental addition of smaller
 * Rectangular openings with accumulated area that reduces the Sides area.
 *
 * @author Varun Kashyap
 */
public interface Sides extends Rectangles {
	/**
	 * Add an opening that reduces the Rectangle's surface area calculation by
	 * the area of a Rectangular opening.
	 *
	 * @param s
	 *            a <code>Rectangles</code> value
	 * @return a <code>boolean</code> value that is true when the flat surface
	 *         was added, else false.
	 */
	Sides addOpening(Rectangles s);

	/**
	 * The height of the Sides. This maps a Rectangle dimension to height. The
	 * other dimension should be mapped to get and set length and width.
	 * 
	 * @param height
	 * @return Sides
	 */
	Sides setHeight(double height);

	/**
	 * The height of the Sides.
	 * 
	 * @return height
	 */
	double getHeight();
}
