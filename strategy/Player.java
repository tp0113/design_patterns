package strategy;

/**
 * The abstract Player class represents a football player in the game.
 * 
 * @author Tilak Patel
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    public DefenseBehavior defenseBehavior;
    public OffenseBehavior offenseBehavior;

    /**
     * Constructs a new Player instance
     *
     * @param firstName Player firstName.
     * @param lastName  Player lastName.
     * @param offense   Boolean that tells (true) or defense (false).
     */
    public Player(String firstName, String lastName, boolean offense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
        setOffenseBehavior();
        setDefenseBehavior();
    }

    /**
     * Sets the defense behavior based on the player.
     */
    abstract public void setDefenseBehavior();

    /**
     * Sets the offense behavior based on the player.
     */
    abstract public void setOffenseBehavior();

    /**
     * Performs a play action based on the player's role (offense or defense).
     * 
     * @return A String describing the play action.
     */
    public String play() {
        if (offense && offenseBehavior != null) {
           setOffenseBehavior();
           return offenseBehavior;
        }
        else if (!offense && defenseBehavior != null) {
            setDefenseBehavior();
            return defenseBehavior.play();
        }
    }

    /**
     * Deals with turnover event for player.
     */
    public void turnover() {
        offense = !offense;
    }

    /**
     * Returns a string name for the player.
     *
     * @return A string containing the player's full name.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
