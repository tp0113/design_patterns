package decorator;

/**
* Car class which represents a car
*/
class Car extends Vehicle {
 public Car() {
     super(FileReader.getLines("decorator/txt/car.txt"));
 }
}
