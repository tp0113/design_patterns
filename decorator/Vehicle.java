package decorator;

import java.util.ArrayList;

/**
 * Represents a basic vehicle with text lines.
 * Used as a foundation for creating and decorating vehicles.
 */
class Vehicle {
    /**
     * The lines of text defining the vehicle's appearance.
     */
    protected ArrayList<String> lines;

    /**
     * Constructs a vehicle with provided lines.
     *
     * @param lines Lines of text defining the appearance.
     */
    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Converts the vehicle to a string by joining lines with newlines.
     *
     * @return A string representation of the vehicle.
     */
    @Override
    public String toString() {
        StringBuilder carString = new StringBuilder();
        for (String line : lines) {
            carString.append(line).append("\n");
        }
        return carString.toString();
    }
}
