package factory;

public class BikeStore {
    
    /**
     * Creates a new instance of Bike based a certain type of bike.
     *
     * @param type the type of bike that is created
     * @return instance of the specific type of bike
     * @throws IllegalArgumentException if there is an invalid bike type
     */
    public Bike createBike(String type) {
        if (type.equalsIgnoreCase("tricycle")) {
            return new Tricycle();
        } else if (type.equalsIgnoreCase("strider")) {
            return new Strider();
        } else if (type.equalsIgnoreCase("kids bike")) {
            return new KidsBike();
        } else {
            throw new IllegalArgumentException("Invalid bike type");
        }
    }
}
