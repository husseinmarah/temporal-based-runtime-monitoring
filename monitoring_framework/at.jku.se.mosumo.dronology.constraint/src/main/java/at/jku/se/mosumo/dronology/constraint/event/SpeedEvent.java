package at.jku.se.mosumo.dronology.constraint.event;

import java.util.Date;

/**
     * POJO class for the speed event
	 * @generated
	 */
public class SpeedEvent{ 

	/**
	 * speed event
     */
    private double speed;

	/**
	 * timeStamp event
     */
    private int num;
	/**
	 * speed event constructor.
     *
	 * @param speed
	 *            is the speed event
	 * @param timeStamp
	 *            is the timeStamp event
     * @generated
	 */

    public SpeedEvent(double speed, int num) {	
        this.speed=speed;
        this.num=num;
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
     * the value of the '<em><b>timeStamp</b></em>' attribute.
	 * @generated
	 */
    public int getNum() {
        return num;
    }

    public String toString() {
        return "Speed: "+speed+" , "+"num: "+num;
    }

}
