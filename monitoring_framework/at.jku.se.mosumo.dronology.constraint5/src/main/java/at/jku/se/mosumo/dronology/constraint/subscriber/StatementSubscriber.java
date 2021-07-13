
package at.jku.se.mosumo.dronology.constraint.subscriber;
public interface StatementSubscriber {
    /**
     * Get the EPL Stamement the Subscriber will listen to.
     * @return EPL Statement
     */
    public String getStatement();
}
