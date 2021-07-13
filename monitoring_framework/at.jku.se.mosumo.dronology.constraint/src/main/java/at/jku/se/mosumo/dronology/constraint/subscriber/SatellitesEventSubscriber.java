package at.jku.se.mosumo.dronology.constraint.subscriber;

public class SatellitesEventSubscriber implements StatementSubscriber {
    public String getStatement() {  	
//    	String SatellitesEventStatement = "select * from SatellitesEvent(n_satellites < 5)";
    	
    	String SatellitesEventStatement = "select * from pattern [\n"
    	+ "every \n"
    	+ "E1 = SatellitesEvent (n_satellites < 5)\n"
    	+ " -> \n"
    	+ "E2 = SatellitesEvent (n_satellites < 3)\n"
    	+ " ->\n"
    	+ "E3 = SatellitesEvent (n_satellites < 3)\n"
    	+ " ->\n"
    	+ "E4 = SatellitesEvent (n_satellites < 3 )\n"
    	+ "where timer:within(1 minute)\n"
    	+ "]";
        return SatellitesEventStatement;
    }
  
}
