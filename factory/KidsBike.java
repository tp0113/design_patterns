package factory;

/**
 * Constructs a KidsBike object and defines its assembly process.
 */
public class KidsBike extends Bike {
    public KidsBike() {
        super("Kids Bike", 2, true, true);
    }

    @Override
    public String assembleBike() {
        String result = createFrame() + "\n" + addWheels() + "\n" + addTrainingWheels() + "\n" + addPedals();
        return "Creating a Kids Bike\n" + result;
    }
}
