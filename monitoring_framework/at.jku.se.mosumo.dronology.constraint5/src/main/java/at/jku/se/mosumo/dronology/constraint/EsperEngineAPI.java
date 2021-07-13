package at.jku.se.mosumo.dronology.constraint;

import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;

import at.jku.se.mosumo.dronology.constraint.event.SatellitesEvent;
import at.jku.se.mosumo.dronology.constraint.event.SpeedEvent;
import at.jku.se.mosumo.dronology.constraint.event.VoltageEvent;
import at.jku.se.mosumo.dronology.constraint.listener.SatellitesEventListener;
import at.jku.se.mosumo.dronology.constraint.listener.SpeedEventListener;
import at.jku.se.mosumo.dronology.constraint.subscriber.SatellitesEventSubscriber;
import at.jku.se.mosumo.dronology.constraint.subscriber.SpeedEventSubscriber;
import at.jku.se.mosumo.dronology.constraint.subscriber.StatementSubscriber;

/**
 * Entry point for the Demo
 */

public class EsperEngineAPI{

    //private static Logger LOG = LoggerFactory.getLogger(EsperEngine.class);

	private static final Logger LOG = LogManager.getLogger(EsperEngineAPI.class.getName());

    private static EPServiceProvider srv;
    private static EPRuntime rnt;

	 /**speed event statement and subscriber*/
    private static EPStatement speedEventStatement;
    private static StatementSubscriber speedEventStatementSubscriber;

	 /**voltage event statement and subscriber*/
    private static EPStatement voltageEventStatement;
    private static StatementSubscriber voltageEventStatementSubscriber;


	 /**satellites event statement and subscriber*/
    private static EPStatement satellitesEventStatement;
    private static StatementSubscriber satellitesEventStatementSubscriber;

    public void loadEsperEngine(){
    	LOG.info("== Starting EsperEngine ==");
    	Configuration configTest=new Configuration();
    	configTest.addEventTypeAutoName("at.jku.se.mosumo.dronology.constraint.event");
    	srv = EPServiceProviderManager.getDefaultProvider(configTest);
    	rnt = srv.getEPRuntime();
    	createc1CheckExpression();
    	createc2CheckExpression();
    }

    /**speed event check expression*/
    private static void createc1CheckExpression() {
    
    	LOG.info("Create c1 Check Expression");
    	SpeedEventSubscriber speedEventSubscriber =new SpeedEventSubscriber();	
    	speedEventStatement = srv.getEPAdministrator().createEPL(speedEventSubscriber.getStatement());
    	speedEventStatement.setSubscriber(speedEventStatementSubscriber);
    	speedEventStatement.addListener(new SpeedEventListener());
    }
    
    /**satellites event check expression*/
    private static void createc2CheckExpression() {
    
    	LOG.info("Create c2 Check Expression");
    	SatellitesEventSubscriber satellitesEventSubscriber =new SatellitesEventSubscriber();	
    	satellitesEventStatement = srv.getEPAdministrator().createEPL(satellitesEventSubscriber.getStatement());
    	satellitesEventStatement.setSubscriber(satellitesEventStatementSubscriber);
    	satellitesEventStatement.addListener(new SatellitesEventListener());
    }
    

    
    public void sendSpeedEvent(String agentID, double speed, int satellites) {
     	if ( agentID.equals("VIRT1") || agentID == "VIRT2" )
     	{
     	LOG.info("Speed Sent from: "+agentID+" to Esper Engine: " + speed+" , "+satellites);
     	rnt.sendEvent(new SpeedEvent(speed, satellites));
     	}
     }
     
     public void sendVoltageEvent(String agentID, int voltage, Date timeStamp) {
     	if ( agentID == "VIRT3" )
     	{
     	LOG.info("Voltage Sent from: "+agentID+" to Esper Engine: " + voltage+" , "+timeStamp);
     	rnt.sendEvent(new VoltageEvent(voltage, timeStamp));
     	}
     }
     public void sendSatellitesEvent(String agentID, int n_satellites) {
      	if ( agentID.equals("VIRT3") )
      	{
      	LOG.info("Satellites Sent from: "+agentID+" to Esper Engine: " + n_satellites);
      	rnt.sendEvent(new SatellitesEvent(n_satellites));
      	}
      }

}