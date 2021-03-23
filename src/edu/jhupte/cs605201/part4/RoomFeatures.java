package edu.jhupte.cs605201.part4;

import edu.jhupte.cs605201.part3.Rectangles;

/**
 * RoomFeatures describes the non-geometric characteristics of a room.
 *
 * @author Varun Kashyap
 *
 */

public interface RoomFeatures {
	public static interface Windows extends Rectangles {
	}
	public static interface Doors extends Rectangles {
	}

	/**
	 * The room identifier.
	 *
	 * @return the identifier.
	 */
	String getName();

	/**
	 * Set the the room identifier.
	 *
	 * @param name
	 *            the identifier of the room.
	 * @return this
	 */
	RoomFeatures setName(String name);

	/**
	 * The color of the wall paint.
	 *
	 * @return the paint color
	 */
	// Paint getWallColor();
	/**
	 * Set the color of the wall paint.
	 *
	 * @param color
	 *            the paint color
	 * @return
	 */
	// RoomFeatures setWallColor(Paint color);
	/**
	 * The number of windows.
	 *
	 * @return The number of windows in the room
	 */
	int getWindowCount();
	/**
	 * The number of doors.
	 *
	 * @return the number of door in the room
	 */
	int getDoorCount();
	/**
	 * Add an Door to a wall.
	 *
	 * @param opening
	 *            a <code>Door</code> door opening
	 * @param wall
	 *            the index (0-3) of the wall that gets the opening
	 * @return this
	 */
	RoomFeatures add(RoomFeatures.Doors opening, Boxes.Side wall);
	/**
	 * Add a window to a wall
	 *
	 * @param opening
	 *            a <code>FlatSurface</code> window opening
	 * @param wall
	 *            the index (0-3) of the wall that gets the opening
	 * @return this
	 */
	RoomFeatures add(RoomFeatures.Windows opening, Boxes.Side wall);

}
