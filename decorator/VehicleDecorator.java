package decorator;

import java.util.ArrayList;

/**
 * Class for integrating decoration lines with base vehicle lines.
 * Ensures proper overlapping and character replacement.
 */
class VehicleDecorator extends Vehicle {
    /**
     * Constructs a VehicleDecorator with the provided lines.
     *
     * @param lines Base lines of the vehicle.
     */
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    /**
     * Integrates decoration lines into the base vehicle lines, ensuring correct overlap.
     *
     * @param decor - Decoration lines to integrate.
     */
    public void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < Math.min(lines.size(), decor.size()); i++) {
            String line = lines.get(i);
            String decoration = decor.get(i);

            StringBuilder mergedLine = new StringBuilder();
            for (int j = 0; j < Math.max(line.length(), decoration.length()); j++) {
                char vehicleChar = (j < line.length()) ? line.charAt(j) : ' ';
                char decorChar = (j < decoration.length()) ? decoration.charAt(j) : ' ';

                if (decorChar == ' ') {
                    // If the decoration has a blank, use the vehicle character
                    mergedLine.append(vehicleChar);
                } else {
                    // Otherwise, use the decoration character
                    mergedLine.append(decorChar);
                }
            }

            lines.set(i, mergedLine.toString());
        }
    }
}
