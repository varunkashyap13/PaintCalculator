package edu.jhupte.cs605201.part4;

/**
 * Paint is a substance composed of solid coloring matter suspended in a liquid
 * medium and applied as a protective or decorative coating to various surfaces.
 *
 * @author Varun Kashyap
 */

public enum Paint {
	CEILING_WHITE("Ceiling White", 24.98, 500), YELLOW("Yellow", 30.98,
			400), BLUE("Blue", 30.98,
					400), BEIGE("Beige", 30.98, 400), NONE("None", 0, 0);

	private final String _name;
	private final double _price;
	private final int _coverage;

	private Paint(String n, double p, int c) {
		_name = n;
		_price = p;
		_coverage = c;
	}

	/** Handle printing. */
	public String toString() {
		return _name;
	}
	public String color() {
		return _name;
	}
	/**
	 * The cost of a single gallon.
	 * 
	 * @return the price per gallon
	 */
	public double price() {
		return _price;
	}
	/**
	 * The expected coverage of a single gallon estimated to the nearest square
	 * foot.
	 * 
	 * @return the coverage in square feet per gallon
	 */
	public int coverage() {
		return _coverage;
	}
	/**
	 * Handle case and leading/trailing white-space insensitive parsing.
	 * 
	 * @param c
	 *            the name of a color
	 * @return the associated color object
	 */
	public static Paint parse(String c) {
		return (c == null)
				? null
				: valueOf(c.trim().toUpperCase().replaceAll(" ", "_"));
	}
	/**
	 * Return the total cost of purchasing <i>gallons</i> of <i>color</i> where
	 * the paint an only be purchased in gallon units.
	 * 
	 * @param gallons
	 *            - the quantity of paint needed
	 * @return the cost of purchasing gallon units that provided the specified
	 *         quantity
	 */
	public double cost(double gallons) {
		return Math.round(Math.ceil(gallons) * _price * 100.0) / 100.0;
	}

}
