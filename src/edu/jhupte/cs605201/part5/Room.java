package edu.jhupte.cs605201.part5;

import edu.jhupte.cs605201.part4.Boxes;
import edu.jhupte.cs605201.part4.Door;
import edu.jhupte.cs605201.part4.Paint;
import edu.jhupte.cs605201.part4.Window;
import java.util.Scanner;

/**
 *
 * @author Varun Kashyap
 */
public class Room extends edu.jhupte.cs605201.part4.Room {

	public Room() {
		super();
	}

	public Room(double l, double w, double h) {
		super(l, w, h);
	}

	public Room(String record, Window window, Door door) {
		Scanner scn = new Scanner(record).useDelimiter(":");
		setName(scn.hasNext() ? scn.next() : "");
		setLength(scn.hasNext() ? scn.next() : "");
		setWidth(scn.hasNext() ? scn.next() : "");
		setHeight(scn.hasNext() ? scn.next() : "");
		add(window, scn.hasNext() ? scn.next() : "");
		add(door, scn.hasNext() ? scn.next() : "");
		setWallColor(scn.hasNext() ? scn.next() : "");

	}

	final public Room setLength(String feet) {
		Scanner scan = new Scanner(feet.trim());
		if (scan.hasNextDouble()) {
			setLength(scan.nextDouble());
		}
		return this;
	}

	final public Room setWidth(String feet) {
		Scanner scan = new Scanner(feet.trim());
		if (scan.hasNextDouble()) {
			setWidth(scan.nextDouble());
		}
		return this;
	}

	final public Room setHeight(String feet) {
		Scanner scan = new Scanner(feet.trim());
		if (scan.hasNextDouble()) {
			setHeight(scan.nextDouble());
		}
		return this;
	}

	final public Room setWallColor(String p) {
		setWallColor(Paint.parse(p.trim()));
		return this;
	}

	@Override
	final public Room setName(String name) {
		super.setName(name.trim());
		return this;
	}

	final public Room add(Window window, String count) {
		int i = 0; // wall opening distribution index
		// Symbolic wall location objects
		Boxes.Side sideValue[] = Boxes.Side.values();
		Scanner scan = new Scanner(count.trim());
		if (scan.hasNextInt()) {
			int cnt = scan.nextInt();
			// sequence through the wall objects to add
			// the openings
			for (int w = 0; w < cnt; w++) {
				add(window, sideValue[i++ % sideValue.length]);
			}
		}
		return this;
	}

	final public Room add(Door door, String count) {
		int i = 0; // wall opening distribution index
		// Symbolic wall location objects
		Boxes.Side sideValue[] = Boxes.Side.values();
		Scanner scan = new Scanner(count.trim());
		if (scan.hasNextInt()) {
			int cnt = scan.nextInt();
			// sequence through the wall objects to add
			// the openings
			for (int w = 0; w < cnt; w++) {
				add(door, sideValue[i++ % sideValue.length]);
			}
		}
		return this;
	}
	public static void main(String... a) {
		Window w = new Window(3.0, 4.0);
		Door d = new Door(6.75, 3.5);
		Room r = new Room("     Family Room: 17.0: 10.0: 8.5: 1: 4:  Blue ", w,
				d);

		System.out.println(r);
	}
}
