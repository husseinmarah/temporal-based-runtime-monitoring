package at.jku.se.mosumo.dronology.constraint.event;

import java.util.Date;

/**
     * POJO class for the speed event
	 * @generated
	 */
public class SpeedSatellitesEvent{ 

	/**
	 * speed event
     */
    private double speed;

	/**
	 * satellites event
     */
    private int satellites;
	/**
	 * speed event constructor.
     *
	 * @param speed
	 *            is the speed event
	 * @param satellites
	 *            is the satellites event
     * @generated
	 */

    public SpeedSatellitesEvent(double speed, int satellites) {	
        this.speed=speed;
        this.satellites=satellites;
    }

	/**
     * @return
     * the value of the '<em><b>speed</b></em>' attribute.
	 * @generated
	 */
    public double getSpeed() {
        return speed;
    }

	/**
     * @return
     * the value of the '<em><b>satellites</b></em>' attribute.
	 * @generated
	 */
    public int getSatellites() {
        return satellites;
    }

    public String toString() {
        return "Speed: "+speed+" , "+"satellites: "+satellites;
    }

}
