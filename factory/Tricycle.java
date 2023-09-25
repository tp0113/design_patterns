package factory;

/**
 * Constructs a Tricycle object and defines its assembly process.
 */
public class Tricycle extends Bike {
    public Tricycle() {
        super("Tricycle", 3, true, false);
    }

    @Override
    public String assembleBike() {
        String result = createFrame() + "\n" + addWheels() + "\n" + addPedals();
        return "Creating a Tricycle\n" + result;
    }
}
