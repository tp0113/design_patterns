package strategy;

import java.util.Random;

/**
 * Class which represents the football player in the quarterback position.
 * 
 * @author Tilak Patel
 */
public class Quarterback extends Player {
    private Random random = new Random();

    /**
     * Constructs a new Quarterback with the given attributes.
     */
    public Quarterback(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * Sets the offense behavior for quarterbacks. They have a 50% chance of selecting RunBehavior and 50% chance of selecting PassBehavior.
     */
    @Override
    public void setOffenseBehavior() {
        Random rand = new Random();
        int x = rand.nextInt;

        switch(x) {
            case 0:
                offenseBehavior = new RunBehavior();
                break;
            case 1:
                offenseBehavior = new PassBehavior();
                break;
        }
    }

    /**
     * Sets defense behavior to null.
     */
    @Override
    public void setDefenseBehavior() {
        defenseBehavior = null;
    }
}