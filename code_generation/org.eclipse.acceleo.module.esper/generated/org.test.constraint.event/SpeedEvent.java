package org.test.constraint.event;
	/**
     * POJO class for the speed event
	 * @generated
	 */
public class SpeedEvent{ 

	/**
	 * groundspeed event
     */
    private double groundspeed;

	/**
	 * voltage event
     */
    private int voltage;
	/**
	 * speed event constructor.
     *
	 * @param groundspeed
	 *            is the groundspeed event
	 * @param voltage
	 *            is the voltage event
     * @generated
	 */

    public SpeedEvent(double groundspeed, int voltage) {	
        this.groundspeed=groundspeed;
        this.voltage=voltage;
    }

	/**
     * @return
     * the value of the '<em><b>groundspeed</b></em>' attribute.
	 * @generated
	 */
    public double getGroundspeed() {
        return groundspeed;
    }

	/**
     * @return
     * the value of the '<em><b>voltage</b></em>' attribute.
	 * @generated
	 */
    public int getVoltage() {
        return voltage;
    }

    public String toString() {
        return "Groundspeed: "+groundspeed+" , "+"Voltage: "+voltage;
    }

}
