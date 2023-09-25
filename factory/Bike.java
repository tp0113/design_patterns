package factory;

/**
 * Represents a generic bike with basic attributes.
 */
public abstract class Bike {
    protected String name;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Initializes a new Bike
     *
     * @param name              name of bike
     * @param numWheels         number of wheels on bike
     * @param hasPedals         boolean to tell whether the bike has pedals
     * @param hasTrainingWheels boolean to tell whether the bike has training wheels
     */
    public Bike(String name, int numWheels, boolean hasPedals, boolean hasTrainingWheels) {
        this.name = name;
        this.numWheels = numWheels;
        this.hasPedals = hasPedals;
        this.hasTrainingWheels = hasTrainingWheels;
    }

    /**
     * Assembles the bike with the specific steps to assemble the bike
     *
     * @return A String representation of the bike's assembly.
     */
    public abstract String assembleBike();

    /**
     * Create the bike frame.
     *
     * @return A String depiction of the bike frame assembly
     */
    protected String createFrame() {
        return "- Assembling " + name + " frame";
    }

    /**
     * Adds the bike's wheels.
     *
     * @return A String depiction of the wheel assembly
     */
    protected String addWheels() {
        return "- Adding " + numWheels + " wheel(s)";
    }

    /**
     * Adds the bike's pedals
     *
     * @return A String indicating the pedal assembly.
     */
    protected String addPedals() {
        return "- Adding pedals";
    }

    /**
     * Adds training wheels to a bike.
     *
     * @return A String description of the training wheel assembly
     */
    protected String addTrainingWheels() {
        return "- Adding training wheels";
    }
}
