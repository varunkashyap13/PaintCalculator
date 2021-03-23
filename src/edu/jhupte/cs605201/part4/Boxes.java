package edu.jhupte.cs605201.part4;

import edu.jhupte.cs605201.part3.Rectangles;
import edu.jhupte.cs605201.part3.Sides;

/**
 * Box is a three dimensional figure with 4 sides a top and a bottom that are
 * all described by three measurements (in feet), length, width, and height.
 *
 * @author Varun Kashyap
 */

public interface Boxes {
	public static enum Side {
		NORTH, EAST, SOUTH, WEST
	};
	public static enum End {
		TOP, BOTTOM
	};

	/**
	 * The length of the box as measured in feet.
	 *
	 * @return the length
	 */
	double getLength();
	/**
	 * Set the length of the box as measured in feet.
	 *
	 * @param feet
	 *            a <code>double</code> value that is the length in feet.
	 * @return Boxes
	 */
	Boxes setLength(double feet);
	/**
	 * The width of the box as measured in feet.
	 *
	 * @return the width in feet.
	 */
	double getWidth();
	/**
	 * Set the width of the box as measured in feet.
	 *
	 * @param feet
	 *            a <code>double</code> value that is the width in feet.
	 * @return Boxes
	 */
	Boxes setWidth(double feet);
	/**
	 * The height of the surface as measured in feet.
	 *
	 * @return the height in feet
	 */
	double getHeight();
	/**
	 * Set the height of the box as measured in feet.
	 *
	 * @param feet
	 *            a <code>double</code> value that is the height in feet
	 * @return Boxes
	 */
	Boxes setHeight(double feet);
	// /**
	// * Return one of the four sides.
	// *
	// * @param i an <code>Box.Side</code> value that is the position of the
	// Side
	// * @return the selected <code>Box.Side</code> value
	// */
	Sides getSide(Boxes.Side i);
	Rectangles getEnd(Boxes.End i);

}
