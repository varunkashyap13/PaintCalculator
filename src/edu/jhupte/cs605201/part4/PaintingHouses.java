package edu.jhupte.cs605201.part4;

/**
 * Manage the painting criteria, paint usage and total paint cost for multiple
 * rooms where each room has a wall color and the same PaintingCriteria (coats,
 * primer, ) as defined by PaintingRooms.
 *
 * All rooms have two colors: white and a wall color white ceilings applied with
 * color coats white as wall primer applied with primer coats wall color applied
 * with color coats
 *
 * @author Varun Kashyap
 */
public interface PaintingHouses {
	/**
	 * The tax as a ratio that can be multiplied with the cost to add the tax.
	 * Example: 1.05 adds 5% tax
	 *
	 * @return tax ratio
	 */
	double getTaxRatio();

	/**
	 * Set the tax as a ratio that can be multiplied with the cost to add the
	 * tax. Example: 1.05 adds 5% tax
	 *
	 * @return this
	 * @param ratio
	 */
	PaintingHouses setTaxRatio(double ratio);

	/**
	 * Get the total gallons used for this color paint from the total painting
	 * data.
	 *
	 * @param p
	 * @return color gallons used
	 */
	double getGallonsUsed(Paint p);

	/**
	 * Get the total purchase gallons for this color paint from the total
	 * painting data.
	 *
	 * @param p
	 * @return color gallons used
	 */
	default int getPurchaseGallons(Paint p) {
		return (int) Math.ceil(getGallonsUsed(p));
	}

	/**
	 * Add the painting data for this room to the set of managed paints.
	 *
	 * @param r
	 * @return
	 */
	PaintingHouses updatePaintsUsed(PaintingRooms r);

	/**
	 * Remove all of the data from the managed paints. All totals will be zero.
	 *
	 * @return
	 */
	PaintingHouses clearPaintTotals();

	/**
	 * Is there any managed paint data.
	 *
	 * @return
	 */
	boolean hasPaintTotals();

	/**
	 * Get the total cost including tax for all of the managed paints.
	 *
	 * @return total cost including tax
	 */
	double getTotalPaintCost();
}
