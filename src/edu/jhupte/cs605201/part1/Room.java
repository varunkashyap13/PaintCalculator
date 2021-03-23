package edu.jhupte.cs605201.part1;

/**
 * A program which prints a representation of a room.
 *
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
		System.out.println("\n" + "     -------www-------\n"
				+ "     |               |\n" + "     |               |\n"
				+ "     s               w\n" + "     |               w\n"
				+ "     d               w\n" + "     d               |\n"
				+ "     |               o\n" + "     |               |\n"
				+ "     -----www-www-----\n" + "\n" + "   KEY:\n"
				+ "     |   vertical wall\n" + "     -   horizontal wall\n"
				+ "     d   door\n" + "     w   window\n"
				+ "     o   electrical outlet\n"
				+ "     s   electrical switch");

		return;
	}
}// Room
