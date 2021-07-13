package at.jku.se.mosumo.dronology.constraint.subscriber;

public class SpeedEventSubscriber implements StatementSubscriber {
    public String getStatement() { 
    	String SpeedEventStatement = "select * from SpeedEvent(speed > 10)";
    	
//        String SpeedEventStatement = "select * from SpeedEvent\n"
//        		+ "match_recognize (\n"
//        		+ "measures Event1 as takeoff1, Event2 as go_to2\n"
//        		+ "pattern ( Event1+\n"
//        		+ "Event2* )\n"
//        		+ "define\n"
//        		+ "Event1 as Event1.speed > 100,\n"
//        		+ "Event2 as Event2.speed < 100 \n"
//        		+ ")";
        
        
        return SpeedEventStatement;
    }
  
}


