package edu.jhupte.cs605201.part3;

/**
 * Rectangles interface.
 * 
 * Rectangles are two dimensional areas bounded by four sides and having
 * opposing sides of equal length. These are the rectangle length and width
 * measured in feet.
 *
 *
 * @author Varun Kashyap
 * 
 */

public interface Rectangles {
	/**
	 * The length of the surface as measured in feet.
	 * 
	 * @return the length in feet
	 */
	double getLength();
	/**
	 * Set the length of the surface as measured in feet.
	 * 
	 * @param feet
	 *            - the length in feet
	 * @return Rectangles
	 */
	Rectangles setLength(double feet);
	/**
	 * The width of the surface as measured in feet.
	 * 
	 * @return the width in feet
	 */
	double getWidth();
	/**
	 * Set the width of the surface as measured in feet.
	 * 
	 * @param feet
	 *            - the width in feet
	 * @return Rectangles
	 */
	Rectangles setWidth(double feet);
	/**
	 * Calculate and return the getArea of the surface in square feet.
	 * 
	 * @return the getArea in square feet
	 */
	double getArea();

}
