package edu.jhupte.cs605201.part4;

/**
 *
 * @author Varun Kashyap
 */

interface WallPrimers {

	/**
	 * Get the wall primer color.
	 *
	 * @return the wall primer color paint.
	 */
	default Paint getWallPrimerColor() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Change the wall primer color.
	 *
	 * @param p
	 *            - the paint color
	 * @return this
	 */
	default WallPrimers setWallPrimerColor(Paint p) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Get the number of wall primer color coats.
	 *
	 * @return the number of wall primer color coats
	 */
	default int getWallPrimerCoats() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Set the number of wall primer color coats.
	 *
	 * @param c
	 *            - the number of coats
	 * @return this
	 */
	default WallPrimers setWallPrimerCoats(int c) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}

interface CeilingPrimers {

	/**
	 * Get the ceiling primer color.
	 *
	 * @return the ceiling primer color paint.
	 */
	default Paint getCeilingPrimerColor() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Change the ceiling primer color.
	 *
	 * @param p
	 *            - the paint color
	 * @return this
	 */
	default CeilingPrimers setCeilingPrimerColor(Paint p) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Get the number of ceiling primer color coats.
	 *
	 * @return the number of ceiling primer color coats
	 */
	default int getCeilingPrimerCoats() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Set the number of ceiling primer color coats.
	 *
	 * @param c
	 *            - the number of coats
	 * @return this
	 */
	default CeilingPrimers setCeilingPrimerCoats(int c) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}

interface CeilingFinishers {
	/**
	 * Get the ceiling finishing color.
	 *
	 * @return the ceiling finishing color.
	 */
	default Paint getCeilingColor() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Change the ceiling finishing color.
	 *
	 * @param p
	 *            - the paint color
	 * @return this
	 */
	default CeilingFinishers setCeilingColor(Paint p) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Get the number of ceiling finishing color coats.
	 *
	 * @return the number ceiling finishing color coats
	 */
	default int getCeilingCoats() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Set the number of ceiling finishing color coats.
	 *
	 * @param c
	 *            - the number of coats
	 * @return this
	 */
	default CeilingFinishers setCeilingCoats(int c) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}

interface WallFinishers {

	/**
	 * Get the wall finishing color.
	 *
	 * @return the wall finishing color paint.
	 */
	Paint getWallColor();

	/**
	 * Change the wall finishing color.
	 *
	 * @param p
	 *            - the paint color
	 * @return this
	 */
	WallFinishers setWallColor(Paint p);

	/**
	 * Get the number of wall finishing color coats.
	 *
	 * @return the number of wall finishing color coats
	 */
	default int getWallCoats() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Set the number of wall finishing color coats.
	 *
	 * @param c
	 *            - the number of coats
	 * @return the number of wall finishing color coats
	 */
	default WallFinishers setWallCoats(int c) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
