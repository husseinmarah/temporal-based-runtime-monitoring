package at.jku.se.mosumo.dronology.constraint.listener;

import java.util.Map;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
public class VoltageEventListener implements UpdateListener {
	public void update(EventBean[] incomingEvents, EventBean[] outgoinEvents) {

		for (EventBean eventBean : incomingEvents) {
			System.out.println("Voltage Event Matching: "+eventBean.getUnderlying());
			
		}
	}
}   
