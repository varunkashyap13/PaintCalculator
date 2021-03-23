package edu.jhupte.cs605201.part4;

/**
 *
 * This interface defines the design criteria for all the rooms.
 *
 * A room has 1 ceiling color 1 wall color and 1 primer paint Constants for all
 * rooms + Ceiling White is the primer paint and the ceiling color + 2 coats of
 * primer on the walls and none on the ceiling + 2 coats of color on the walls
 * and ceiling + 1 primer coat on the walls
 *
 *
 * @author Varun Kashyap
 */

public interface PaintingRooms
		extends
			WallPrimers,
			WallFinishers,
			CeilingPrimers,
			CeilingFinishers,
			edu.jhupte.cs605201.part3.RoomAreas {

	default public Paint getCeilingPrimerColor() {
		return Paint.NONE;
	}

	default public int getCeilingPrimerCoats() {
		return 0;
	}

	default public Paint getCeilingColor() {
		return Paint.CEILING_WHITE;
	}

	default public int getCeilingCoats() {
		return 2;
	}

	default public Paint getWallPrimerColor() {
		return Paint.CEILING_WHITE;
	}

	default public int getWallPrimerCoats() {
		return 1;
	}

	default public int getWallCoats() {
		return 2;
	}

	default double getGallonsUsed(Paint p) {
		double total = 0;

		if (p == getWallColor()) {
			total += getWallArea() * getWallCoats() / getWallColor().coverage();
		}

		if (p == getWallPrimerColor()) {
			total += getWallArea() * getWallPrimerCoats()
					/ getWallPrimerColor().coverage();
		}

		if (p == getCeilingColor()) {
			total += getCeilingArea() * getCeilingCoats()
					/ getCeilingColor().coverage();
		}

		if (p == getCeilingPrimerColor()) {
			total += getCeilingArea() * getCeilingPrimerCoats()
					/ getCeilingPrimerColor().coverage();
		}

		return total;
	}

	default int getPurchaseGallons(Paint p) {
		return (int) Math.ceil(getGallonsUsed(p));
	}
}
