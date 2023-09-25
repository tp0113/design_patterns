package factory;

/**
 * Constructs a Strider object and defines its assembly process.
 */
public class Strider extends Bike {
    public Strider() {
        super("Strider", 2, false, false);
    }

    @Override
    public String assembleBike() {
        String result = createFrame() + "\n" + addWheels();
        return "Creating a Strider\n" + result;
    }
}
