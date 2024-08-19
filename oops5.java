// 5. Abstraction
// - Abstraction is the concept of hiding the implementation details and showing only 
// the essential features of the object. 
// - It can be achieved using abstract classes and interfaces.

// - Example:

// Abstract class
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Regular method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

// Subclass (inheriting from abstract class)
class Car extends Vehicle {
    // Providing body for the abstract method
    void start() {
        System.out.println("Car started");
    }
}

public class oops5 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Output: Car started
        myCar.stop(); // Output: Vehicle stopped
    }
}

