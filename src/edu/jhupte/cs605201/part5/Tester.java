package edu.jhupte.cs605201.part5;

import edu.jhupte.cs605201.part4.Door;
import edu.jhupte.cs605201.part4.HousePainting;
import edu.jhupte.cs605201.part4.Paint;
import edu.jhupte.cs605201.part4.Window;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Varun Kashyap
 */
public class Tester {

	static public void load(Path path, List<Room> rooms, Window w, Door d) {
		try {
			Files.lines(path)
					.forEachOrdered(line -> rooms.add(new Room(line, w, d)));
		} catch (IOException e) {
			System.err
					.println("ERROR: not able to read file \"" + path + "\".");
		}
		return;
	}

	public static void main(String[] args) {
		List<Room> rooms = new ArrayList<>();
		Path path = Paths.get(args[0]);
		load(path, rooms, new Window().setLength(3).setWidth(4),
				new Door().setLength(6.75).setWidth(3.5));
		// set the house painting parameters
		HousePainting painting = new HousePainting().setTaxRatio(1.06);
		// update house painting data for each room
		rooms.forEach((room) -> {
			painting.updatePaintsUsed(room);
		});

		Scanner terminal = new Scanner(System.in);
		String cmd = "";

		boolean done = false;
		while (!done) {
			// display the command menu (II i)
			System.out.print(Display.commandMenuString(rooms, " ", "  "));
			// ignore entered whitespace characters
			while ((cmd = terminal.nextLine().trim()).length() == 0) {
			} ;

			// switch on the character entered in cmd
			// process each alpha character case
			// in the default case process each numeric character

			String tab = " ";
			String offset = "  ";
			switch (cmd) {
				case "a" :
					System.out.println(
							"--------------------------------------------------\n"
									+ Display.getPaintInfoString(
											Paint.CEILING_WHITE, painting, tab,
											offset)
									+ "\n--------------------------------------------------");
					break;
				case "b" :
					System.out.println(
							"--------------------------------------------------\n"
									+ Display.getPaintInfoString(Paint.YELLOW,
											painting, tab, offset)
									+ "\n--------------------------------------------------");
					break;
				case "c" :
					System.out.println(
							"--------------------------------------------------\n"
									+ Display.getPaintInfoString(Paint.BLUE,
											painting, tab, offset)
									+ "\n--------------------------------------------------");
					break;
				case "d" :
					System.out.println(
							"--------------------------------------------------\n"
									+ Display.getPaintInfoString(Paint.BEIGE,
											painting, tab, offset)
									+ "\n--------------------------------------------------");
					break;
				case "E" :
					done = true;
					break;
				case "T" :
					System.out.println(
							"--------------------------------------------------\n"
									+ Display.getTotalCostString(painting, tab)
									+ "\n--------------------------------------------------");
					break;
				default :
					Scanner sc = new Scanner(cmd);
					int x = 0;
					if (sc.hasNextInt()) {
						x = sc.nextInt() - 1;
					} else {
						System.out.println(tab + offset + " >>" + cmd
								+ " is not valid!\n");

					}
					if (x > -1 && x < rooms.size()) {
						System.out.println(
								"--------------------------------------------------\n"
										+ Display.getRoomInfoString(
												rooms.get(x), tab, offset)
										+ "\n--------------------------------------------------");
					} else {
						System.out.println(tab + offset + " >>" + cmd
								+ " is not valid!\n");
					}

			}
		}
	}
}
