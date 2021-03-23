package edu.jhupte.cs605201.part4;

/**
 *
 * @author Varun Kashyap
 */
public class HousePainting implements PaintingHouses {

	private double tax = 1.06;

	@Override
	public double getTaxRatio() {
		return tax;
	}

	@Override
	public HousePainting setTaxRatio(double ratio) {
		tax = ratio;
		return this;
	}

	private double blueGallons;
	private double whiteGallons;
	private double yellowGallons;
	private double beigeGallons;

	@Override
	public double getGallonsUsed(Paint p) {
		double used = 0;
		switch (p) {
			case BLUE :
				used = blueGallons;
				break;
			case CEILING_WHITE :
				used = whiteGallons;
				break;
			case YELLOW :
				used = yellowGallons;
				break;
			case BEIGE :
				used = beigeGallons;
				break;
		}
		return used;
	}

	@Override
	public HousePainting updatePaintsUsed(PaintingRooms r) {
		blueGallons += r.getGallonsUsed(Paint.BLUE);
		whiteGallons += r.getGallonsUsed(Paint.CEILING_WHITE);
		yellowGallons += r.getGallonsUsed(Paint.YELLOW);
		beigeGallons += r.getGallonsUsed(Paint.BEIGE);
		return this;
	}

	@Override
	public PaintingHouses clearPaintTotals() {
		blueGallons = 0;
		whiteGallons = 0;
		yellowGallons = 0;
		beigeGallons = 0;
		return this;
	}

	@Override
	public boolean hasPaintTotals() {
		return blueGallons + whiteGallons + yellowGallons + beigeGallons > 0;
	}

	@Override
	public double getTotalPaintCost() {
		return (getPurchaseGallons(Paint.BLUE) * Paint.BLUE.price()
				+ getPurchaseGallons(Paint.CEILING_WHITE)
						* Paint.CEILING_WHITE.price()
				+ getPurchaseGallons(Paint.BEIGE) * Paint.BEIGE.price()
				+ getPurchaseGallons(Paint.YELLOW) * Paint.YELLOW.price())
				* tax;
	}
}
