package org.test.constraint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EsperEngineAPI{

     private static Logger LOG = LoggerFactory.getLogger(EsperEngineAPI.class.getName());
     private static EPServiceProvider srv;
     private static EPRuntime rnt;

	 /**speed event statement and subscriber*/
     private static EPStatement speedEventStatement;
     private static StatementSubscriber speedEventStatementSubscriber;

	 /**satellites event statement and subscriber*/
     private static EPStatement satellitesEventStatement;
     private static StatementSubscriber satellitesEventStatementSubscriber;


     
     public void loadEsperEngine(){
     	LOG.info("== Starting EsperEngine ==");
     	Configuration configTest=new Configuration();
     	configTest.addEventTypeAutoName("org.test.constraint.event");
     	srv = EPServiceProviderManager.getDefaultProvider(configTest);
     	rnt = srv.getEPRuntime();
     	createc1CheckExpression(); 
     	createc2CheckExpression(); 
     
     }
     /**speed event check expression*/
     private static void createc1CheckExpression() {
     
     	LOG.debug("Create c1 Check Expression");
     	SpeedEventSubscriber speedEventSubscriber =new SpeedEventSubscriber();	
     	speedEventStatement = srv.getEPAdministrator().createEPL(speedEventSubscriber.getStatement());
     	speedEventStatement.setSubscriber(speedEventStatementSubscriber);
     	speedEventStatement.addListener(new SpeedEventListener());
     }
     
     /**satellites event check expression*/
     private static void createc2CheckExpression() {
     
     	LOG.debug("Create c2 Check Expression");
     	SatellitesEventSubscriber satellitesEventSubscriber =new SatellitesEventSubscriber();	
     	satellitesEventStatement = srv.getEPAdministrator().createEPL(satellitesEventSubscriber.getStatement());
     	satellitesEventStatement.setSubscriber(satellitesEventStatementSubscriber);
     	satellitesEventStatement.addListener(new SatellitesEventListener());
     }
     
     
     public void sendSpeedEvent(String agentID, double groundspeed, int voltage) {
     	if ( agentID.equals("VIRT1") || agentID.equals("VIRT2") )
     	{
     	LOG.info("Speed Sent from: "+agentID+" to Esper Engine: " + groundspeed+" , "+voltage);
     	rnt.sendEvent(new SpeedEvent(groundspeed, voltage));
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
