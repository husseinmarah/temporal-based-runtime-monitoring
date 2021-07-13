package at.jku.se.mosumo.dronology.constraint.event;

import java.util.Date;

/**
     * POJO class for the voltage event
	 * @generated
	 */
public class VoltageEvent{ 

	/**
	 * voltage event
     */
    private int voltage;

	/**
	 * timeStamp event
     */
    private Date timeStamp;
	/**
	 * voltage event constructor.
     *
	 * @param voltage
	 *            is the voltage event
	 * @param timeStamp
	 *            is the timeStamp event
     * @generated
	 */

    public VoltageEvent(int voltage, Date timeStamp) {	
        this.voltage=voltage;
        this.timeStamp=timeStamp;
    }

	/**
     * @return
     * the value of the '<em><b>voltage</b></em>' attribute.
	 * @generated
	 */
    public int getVoltage() {
        return voltage;
    }

	/**
     * @return
     * the value of the '<em><b>timeStamp</b></em>' attribute.
	 * @generated
	 */
    public Date getTimeStamp() {
        return timeStamp;
    }

    public String toString() {
        return "Voltage: "+voltage+" , "+"TimeStamp: "+timeStamp;
    }

}
