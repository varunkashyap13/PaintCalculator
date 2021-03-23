package edu.jhupte.cs605201.part3;

/**
 * Class Room. Implements RoomAreas.
 *
 * @author Varun Kashyap
 */
public class Room implements RoomAreas {

	private final Wall north = new Wall();
	private final Wall south = new Wall();
	private final Wall east = new Wall();
	private final Wall west = new Wall();
	private final Surface ceiling = new Surface();

	public Room() {

	}

	public Room(double l, double w, double h) {
		ceiling.setLength(l).setWidth(w);
		north.setLength(l).setHeight(h);
		south.setLength(l).setHeight(h);
		east.setWidth(w).setHeight(h);
		west.setWidth(w).setHeight(h);
	}

	@Override
	public double getWallArea() {
		return north.getArea() + south.getArea() + east.getArea()
				+ west.getArea();
	}

	@Override
	public double getCeilingArea() {
		return ceiling.getArea();
	}

	@Override
	public Wall getNorthWall() {
		return north;
	}

	@Override
	public Wall getSouthWall() {
		return south;
	}

	@Override
	public Wall getEastWall() {
		return east;
	}

	@Override
	public Wall getWestWall() {
		return west;
	}

	@Override
	public Surface getCeiling() {
		return ceiling;
	}

}
