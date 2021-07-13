package org.test.constraint.event;
	/**
     * POJO class for the satellites event
	 * @generated
	 */
public class SatellitesEvent{ 

	/**
	 * n_satellites event
     */
    private int n_satellites;
	/**
	 * satellites event constructor.
     *
	 * @param n_satellites
	 *            is the n_satellites event
     * @generated
	 */

    public SatellitesEvent(int n_satellites) {	
        this.n_satellites=n_satellites;
    }

	/**
     * @return
     * the value of the '<em><b>n_satellites</b></em>' attribute.
	 * @generated
	 */
    public int getN_satellites() {
        return n_satellites;
    }

    public String toString() {
        return "N_satellites: "+n_satellites;
    }

}
