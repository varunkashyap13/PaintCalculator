package edu.jhupte.cs605201.part4;

/**
 *
 * @author Varun Kashyap
 */
public class Tester {

	public static void main(String... args) {
		Window window = new Window(3.0, 4.0);
		Door door = new Door(6.75, 3.5);
		Room room[] = new Room[]{new Room(17.0, 10.0, 8.5),
				new Room().setLength(10.0).setWidth(8.0).setHeight(8.5),
				new Room().setHeight(8.5).setWidth(15.0).setLength(12.0)};
		room[0].setName("Family Room");
		room[0].setWallColor(Paint.BLUE);
		room[0].add(window, Boxes.Side.NORTH);
		room[0].add(window, Boxes.Side.EAST);
		room[0].add(window, Boxes.Side.SOUTH);
		room[0].add(window, Boxes.Side.SOUTH);
		room[0].add(door, Boxes.Side.WEST);
		room[1].setName("Kitchen");
		room[1].setWallColor(Paint.YELLOW);
		room[1].add(window, Boxes.Side.NORTH);
		room[1].add(door, Boxes.Side.EAST);
		room[1].add(door, Boxes.Side.EAST);
		room[2].setName("Dining Room");
		room[2].setWallColor(Paint.BEIGE);
		room[2].add(window, Boxes.Side.NORTH);

		room[2].add(door, Boxes.Side.EAST);
		room[2].add(window, Boxes.Side.SOUTH);
		room[2].add(door, Boxes.Side.WEST);
		HousePainting painting = new HousePainting().setTaxRatio(1.06);
		// add the rooms to painting
		System.out
				.println("--------------------------------------------------");
		for (Room r : room) {
			painting.updatePaintsUsed(r);
			System.out.println(r);
			System.out.println(
					"--------------------------------------------------");
		}
		System.out.println(Display.getPaintInfoString(Paint.CEILING_WHITE,
				painting, " ", "  "));
		System.out.println(
				Display.getPaintInfoString(Paint.BLUE, painting, " ", "  "));
		System.out.println(
				Display.getPaintInfoString(Paint.YELLOW, painting, " ", "  "));
		System.out.println(
				Display.getPaintInfoString(Paint.BEIGE, painting, " ", "  "));
		System.out.println("\n" + Display.getTotalCostString(painting, " "));
	}
}
