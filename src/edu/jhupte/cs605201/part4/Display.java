package edu.jhupte.cs605201.part4;

/**
 *
 * @author Varun Kashyap
 */
public class Display {

	private static String addS(int i) {
		return (i == 1) ? "" : "s";
	}

	private static String addS(String i) {
		return (i.equals("1.00") ? "" : "s");
	}

	public static String getRoomInfoString(Room r, String tab, String offset) {
		String primer = String.format("%.2f",
				r.getGallonsUsed(r.getWallPrimerColor()));
		String finisher = String.format("%.2f",
				r.getGallonsUsed(r.getWallColor()));

		return tab + r.getName() + " - " + String.format("%.1f", r.getLength())
				+ " x " + String.format("%.1f", r.getWidth()) + ", ceiling "
				+ String.format("%.1f", r.getHeight()) + ", "
				+ r.getWindowCount() + " window" + addS(r.getWindowCount())
				+ ", " + r.getDoorCount() + " door" + addS(r.getDoorCount())
				+ "\n" + tab + offset + "Use: " + primer + " gallon"
				+ addS(primer) + " " + r.getWallPrimerColor() + "\n" + tab
				+ offset + "Use: " + finisher + " gallon" + addS(finisher) + " "
				+ r.getWallColor() + "";
	}

	public static String getPaintInfoString(Paint p, HousePainting hp,
			String tab, String offset) {
		String use = String.format("%.2f", hp.getGallonsUsed(p));
		int purchase = hp.getPurchaseGallons(p);

		return tab + p + " @ $" + p.price() + "/gallon\n" + tab + offset
				+ "Use: " + use + " gallon" + addS(use) + "\n" + tab + offset
				+ "Purchase: " + purchase + " gallon" + addS(purchase) + "\n"
				+ tab + offset + "Price: $"
				+ String.format("%.2f", hp.getPurchaseGallons(p) * p.price());
	}

	public static String getTotalCostString(HousePainting hp, String tab) {
		return tab + "TOTAL COST: $"
				+ String.format("%.2f", hp.getTotalPaintCost());
	}
}
