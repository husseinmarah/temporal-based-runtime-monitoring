package org.test.constraint.listener;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SatellitesEventListener implements UpdateListener {
    private static Logger LOG = LogManager.getLogger(SatellitesEventListener.class.getName());
	public void update(EventBean[] incomingEvents, EventBean[] outgoinEvents) {

		for (EventBean eventBean : incomingEvents) {
			LOG.warn("Satellites Event Matching: "+eventBean.getUnderlying());
			
		}
	}
}   
