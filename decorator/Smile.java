package decorator;

/**
 * Adds a smile decoration to a vehicle.
 */
class Smile extends VehicleDecorator {
    /**
     * Constructs a Smile decorator for the vehicle.
     *
     * @param vehicle The base vehicle to add a smile to.
     */
    public Smile(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
 }
}
