package edu.jhupte.cs605201.part3;

/**
 * Interface RoomAreas.
 *
 * @author Varun Kashyap
 */
public interface RoomAreas {
	double getWallArea(); // The total wall paintable area

	double getCeilingArea(); // The total ceiling paintable area

	Sides getNorthWall(); // Returns the north wall instance

	Sides getSouthWall(); // Returns the south wall instance

	Sides getEastWall(); // Returns the east wall instance

	Sides getWestWall(); // Returns the west wall instance

	Rectangles getCeiling(); // Returns the ceiling instance
}
