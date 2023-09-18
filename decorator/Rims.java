package decorator;

/**
 * The Rims class decorates a vehicle with custom rims.
 * It extends the VehicleDecorator class to add rim lines.
 */
class Rims extends VehicleDecorator {
    /**
     * Constructs a Rims decorator for a vehicle.
     *
     * @param vehicle The base vehicle to add custom rims to.
     */
 public Rims(Vehicle vehicle) {
     super(vehicle.lines);
     integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
 }
}
