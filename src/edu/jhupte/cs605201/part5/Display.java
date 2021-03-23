package edu.jhupte.cs605201.part5;

import java.util.List;

/**
 *
 * @author Varun Kashyap
 */
public class Display extends edu.jhupte.cs605201.part4.Display {

	public static String commandMenuString(List<Room> rooms, String tab,
			String offset) {

		String menu = tab + "Room Summary\n";
		int i = 1;
		for (Room r : rooms) {
			menu += tab + offset + "(" + i++ + ") " + r.getName() + "\n";
		}

		menu += tab + "Color Summary\n" + tab + offset + "(a) Ceiling White\n"
				+ tab + offset + "(b) Yellow\n" + tab + offset + "(c) Blue\n"
				+ tab + offset + "(d) Beige\n" + "\n" + tab + "(T)otal Cost\n"
				+ tab + "(E)xit\n" + "\n" + tab + "Select an Action: ";
		return menu;
	}
}
