package strategy;

import java.util.Random;

/**
 * Represents the Lineman position.
 * 
 * @author Tilak Patel
 */
class Lineman extends Player {
    private Random random = new Random();

    /**
     * Constructs a new Lineman.
     * 
     * @param firstName first name of the lineman
     * @param lastName last name of the lineman
     * @param offense boolean which decides if offense is true
     */
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * Sets the offense behavior.
     */
    @Override
    public void setOffenseBehavior() {
        this.offenseBehavior = new OBlockBehavior();
    }

    /**
     * Sets the defense behavior.
     */
    @Override
    public void setDefenseBehavior() {
        Random rand = new Random();
        int x = rand.nextInt;

        switch(x) {
            case 0:
                defenseBehavior = new BlockBehavior();
                break;
            case 1:
                defenseBehavior = new StripBehavior();
                break;
            case 2:
                defenseBehavior = new SackBehavior();
                break;
        }
    }
}