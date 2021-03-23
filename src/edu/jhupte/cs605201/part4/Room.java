package edu.jhupte.cs605201.part4;

import edu.jhupte.cs605201.part3.Rectangles;
import edu.jhupte.cs605201.part3.Sides;
import edu.jhupte.cs605201.part3.Surface;
import edu.jhupte.cs605201.part3.Wall;

/**
 *
 * @author Varun Kashyap
 */
public class Room extends edu.jhupte.cs605201.part3.Room
		implements
			PaintingRooms,
			RoomFeatures,
			Boxes {
	public Room() {
		super();
	}

	public Room(double l, double w, double h) {
		super(l, w, h);
	}

	private Paint wallColor;
	@Override
	public Paint getWallColor() {
		return wallColor;
	}

	@Override
	public Room setWallColor(Paint p) {
		wallColor = p;
		return this;
	}

	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Room setName(String name) {
		this.name = name;
		return this;
	}

	private int winCount;

	@Override
	public int getWindowCount() {
		return winCount;
	}

	@Override
	public Room add(Windows opening, Boxes.Side wall) {
		getSide(wall).addOpening(opening);
		winCount++;
		return this;
	}

	private int doorCount;

	@Override
	public int getDoorCount() {
		return doorCount;
	}

	@Override
	public Room add(Doors opening, Boxes.Side wall) {
		getSide(wall).addOpening(opening);
		doorCount++;
		return this;
	}

	@Override
	public double getLength() {
		return getCeiling().getLength();
	}

	@Override
	public Room setLength(double feet) {
		getCeiling().setLength(feet);
		getNorthWall().setLength(feet);
		getSouthWall().setLength(feet);
		return this;
	}

	@Override
	public double getWidth() {
		return getCeiling().getWidth();
	}

	@Override
	public Room setWidth(double feet) {
		getCeiling().setWidth(feet);
		getEastWall().setWidth(feet);
		getWestWall().setWidth(feet);
		return this;
	}

	@Override
	public double getHeight() {
		return getNorthWall().getHeight();
	}

	@Override
	public Room setHeight(double feet) {
		getNorthWall().setHeight(feet);
		getSouthWall().setHeight(feet);
		getEastWall().setHeight(feet);
		getWestWall().setHeight(feet);
		return this;
	}

	@Override
	public Wall getSide(Side side) {
		Wall w = null;
		switch (side) {
			case NORTH :
				w = getNorthWall();
				break;
			case SOUTH :
				w = getSouthWall();
				break;
			case EAST :
				w = getEastWall();
				break;
			case WEST :
				w = getWestWall();
				break;
		}

		return w;
	}

	@Override
	public Surface getEnd(End i) {
		Surface c = null;
		switch (i) {
			case TOP :
				c = this.getCeiling();
				break;
		}
		return c;
	}

	public String toString() {
		return Display.getRoomInfoString(this, " ", "  ");
	}

	public static void main(String... args) {
		Window window = new Window().setLength(3).setWidth(4.0);
		Door door = new Door(6.75, 3.5);
		Room rooms[] = new Room[]{new Room(17.0, 10.0, 8.5)
				.setName("Family Room").setWallColor(Paint.BLUE)
				.add(window, Boxes.Side.NORTH).add(window, Boxes.Side.EAST)
				.add(window, Boxes.Side.EAST).add(window, Boxes.Side.SOUTH)
				.add(door, Boxes.Side.WEST),
				new Room().setLength(10.0).setWidth(8.0).setHeight(8.5)
						.setName("Kitchen").setWallColor(Paint.YELLOW)
						.add(window, Boxes.Side.NORTH)
						.add(door, Boxes.Side.EAST).add(door, Boxes.Side.EAST),
				new Room().setHeight(8.5).setWidth(15.0).setLength(12.0)
						.setName("Dining Room").setWallColor(Paint.BEIGE)
						.add(window, Boxes.Side.NORTH)
						.add(door, Boxes.Side.EAST)
						.add(window, Boxes.Side.SOUTH)
						.add(door, Boxes.Side.WEST)};

		for (Room r : rooms) {
			System.out.println(r);
		}
	}
}
