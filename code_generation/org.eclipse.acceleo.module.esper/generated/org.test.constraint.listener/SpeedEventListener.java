package org.test.constraint.listener;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SpeedEventListener implements UpdateListener {
    private static Logger LOG = LogManager.getLogger(SpeedEventListener.class.getName());
	public void update(EventBean[] incomingEvents, EventBean[] outgoinEvents) {

		for (EventBean eventBean : incomingEvents) {
			LOG.warn("Speed Event Matching: "+eventBean.getUnderlying());
			
		}
	}
}   
