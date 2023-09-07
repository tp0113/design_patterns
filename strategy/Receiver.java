package strategy;

/**
 * Receiver class represents a football player who plays in the receiver position.
 * 
 * @author Tilak Patel
 */
public class Receiver extends Player {
    /**
     * Constructs a new Receiver instance.
     * 
     * @param firstName first name of the player
     * @param lastName last name of player
     * @param offense boolean that determines whether offense is true or false
     */
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * Sets specific offense behavior for receivers ReceiveBehavior.
     */
    @Override
    public void setOffenseBehavior() {
        this.offenseBehavior = new ReceiveBehavior();
    }

    /**
     * Sets DefenseBehavior to null.
     */
    @Override
    public void setDefenseBehavior() {
        this.defenseBehavior = null;
    }
}
