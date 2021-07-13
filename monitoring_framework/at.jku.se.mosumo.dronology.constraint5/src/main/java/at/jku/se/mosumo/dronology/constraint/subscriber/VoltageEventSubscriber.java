package at.jku.se.mosumo.dronology.constraint.subscriber;
public class VoltageEventSubscriber implements StatementSubscriber {
    public String getStatement() {  	
    	String VoltageEventStatement = "select * from VoltageEvent(voltage > 50)";
        return VoltageEventStatement;
    }
  
}
