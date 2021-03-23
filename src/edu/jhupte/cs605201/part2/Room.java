package edu.jhupte.cs605201.part2;

/**
 * A program which calculates room paint cost.
 *
 * @author Varun Kashyap
 */

final public class Room {
	/**
	 * Default constructor, creates a new <code>Room</code> instance.
	 *
	 */
	public Room() {
	}

	/**
	 * Display room.
	 *
	 * @param args
	 *            a <code>String[]</code> value
	 */
	static public void main(String[] args) {

		// final float constants. all measurements in feet
		final float CEILING_HEIGHT = 8.5f;
		final float DOOR_WIDTH = 3.5f;
		final float DOOR_HEIGHT = 6.75f;

		// cost of paint in dollars
		final float WHITE_PPG = 24.98f;
		final float BLUE_PPG = 30.98F;

		// tax at 6 percent
		final float TAX = 1.06f;

		// final integer constants. all measurements in feet
		final int WALL_1_LENGTH = 17;
		final int WALL_2_LENGTH = 8;
		final int WINDOW_WIDTH = 3;
		final int WINDOW_HEIGHT = 4;

		final int NUM_DOORS = 1; // number of doors in the room
		final int NUM_WINDOWS = 4; // number of windows in the room

		// paint coverage in square feet
		final int WHITE_COVERAGE = 500;
		final int BLUE_COVERAGE = 400;

		// quantity of paint needed
		int whiteNeeded = 0;
		int blueNeeded = 0;

		// number of square feet of ceiling
		double ceilingArea = 0d;

		// total number of square feet of wall, exc. windows and door
		double wallArea = 0d;

		// total number of gallons of ceiling white needed to satisfy item 1
		double whiteGallons = 0d;

		// total number of gallons of blue needed to satisfy item 2
		double blueGallons = 0d;

		// area in square feet of 1 door
		double singleDoorArea = 0d;

		// area in square feet of 1 window
		double singleWindowArea = 0d;

		// area in square feet of wall to paint, minus doors and windows
		double wallPaintArea = 0d;

		// cost of white paint for the room
		double whiteCost = 0d;

		// cost of blue paint for the room
		double blueCost = 0d;

		// total cost of paint for the room
		double totalCost = 0d;

		// area algorithm
		ceilingArea = WALL_1_LENGTH * WALL_2_LENGTH;
		singleWindowArea = WINDOW_HEIGHT * WINDOW_WIDTH;
		singleDoorArea = DOOR_WIDTH * DOOR_HEIGHT;
		wallArea = 2 * (WALL_1_LENGTH * CEILING_HEIGHT)
				+ 2 * (WALL_2_LENGTH * CEILING_HEIGHT);
		wallPaintArea = wallArea - (NUM_DOORS * singleDoorArea)
				- (NUM_WINDOWS * singleWindowArea);

		// ceiling white cost algorithm
		whiteGallons = Math.round(
				((2 * ceilingArea) + wallPaintArea) / WHITE_COVERAGE * 100)
				/ 100.0;
		whiteNeeded = (int) Math.ceil(whiteGallons);
		whiteCost = Math.round(WHITE_PPG * whiteNeeded * 100) / 100.0;

		// blue cost algorithm
		blueGallons = Math.round((2 * wallPaintArea) / BLUE_COVERAGE * 100)
				/ 100.0;
		blueNeeded = (int) Math.ceil(blueGallons);
		blueCost = Math.round(BLUE_PPG * blueNeeded * 100) / 100.0;

		// calculating total cost of paint + tax
		totalCost = Math.round((whiteCost + blueCost) * TAX * 100) / 100.0;

		System.out.println("\n" + "     -------www-------\n"
				+ "     |               |\n" + "     |               |\n"
				+ "     s               w\n" + "     |               w\n"
				+ "     d               w\n" + "     d               |\n"
				+ "     |               o\n" + "     |               |\n"
				+ "     -----www-www-----\n" + "\n" + "   KEY:\n"
				+ "     |   vertical wall\n" + "     -   horizontal wall\n"
				+ "     d   door\n" + "     w   window\n"
				+ "     o   electrical outlet\n"
				+ "     s   electrical switch\n"
				+ "===========================");

		System.out.println(" ROOM PAINT");
		System.out.println("   Ceiling white @ $" + WHITE_PPG + "/gallon");
		System.out.println("      Use: " + whiteGallons + " gallons");
		System.out.println("      Purchase: " + whiteNeeded + " gallons");
		System.out.println("      Price: $" + whiteCost);
		System.out.println();
		System.out.println("   Blue @ " + BLUE_PPG + "/gallon");
		System.out.println("      Use: " + blueGallons + " gallons");
		System.out.println("      Purchase: " + blueNeeded + " gallons");
		System.out.println("      Price: $" + blueCost);
		System.out.println();
		System.out.println("   TOTAL COST: " + totalCost);

		return;
	}
}