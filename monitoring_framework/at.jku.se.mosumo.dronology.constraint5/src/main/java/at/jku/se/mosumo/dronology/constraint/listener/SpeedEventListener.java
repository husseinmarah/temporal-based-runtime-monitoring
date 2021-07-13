package at.jku.se.mosumo.dronology.constraint.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SpeedEventListener implements UpdateListener {
    private static Logger LOG = LogManager.getLogger(SpeedEventListener.class.getName());
	public void update(EventBean[] incomingEvents, EventBean[] outgoinEvents) {
//		System.out.println("a event=" + incomingEvents[0].get("a"));
//		System.out.println("b event=" + incomingEvents[0].get("b"));
		for (EventBean eventBean : incomingEvents) {
			LOG.warn("Speed Event Matching: "+eventBean.getUnderlying());
		
			
			
		}
	}
}   
