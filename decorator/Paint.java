package decorator;

/**
 * The Paint class decorates a vehicle with a specified color.
 * It extends the VehicleDecorator class to integrate color into the base vehicle's lines.
 */
class Paint extends VehicleDecorator {
    private String colorCode;

    /**
     * Constructs a Paint decorator with the specified color.
     *
     * @param vehicle The base vehicle to be painted.
     * @param color   The color to paint the vehicle.
     */
    public Paint(Vehicle vehicle, String color) {
        super(vehicle.lines);
        this.colorCode = getColorCode(color);
        applyColor();
    }

    /**
     * Retrieves the ANSI color code for the given color name.
     *
     * @param color The name of the color.
     * @return The ANSI color code.
     */
    private String getColorCode(String color) {
        switch (color) {
            case "red":
                return "\u001B[31m";   // Red color code
            case "green":
                return "\u001B[32m";   // Green color code
            case "yellow":
                return "\u001B[33m";   // Yellow color code
            case "blue":
                return "\u001B[34m";   // Blue color code
            case "purple":
                return "\u001B[35m";   // Purple color code
            case "cyan":
                return "\u001B[36m";   // Cyan color code
            default:
                return "\u001B[0m";    // Default to black (no color)
        }
    }

    /**
     * Applies the selected color to each line of the vehicle.
     */
    private void applyColor() {
        // Apply the selected color to each line
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, colorCode + lines.get(i));
        }
    }
}
