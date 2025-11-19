package opps.code.Pillars_Of_Java;

// Abstraction Example in Java
// Demonstrates abstract class, interface, object creation, and method overriding

// ------------------- Abstract Class -------------------
// Abstract class can have:
// 1. Abstract methods (without body)
// 2. Concrete methods (with body)
// 3. Variables
// 4. Constructors


abstract class Vehicle {
    String color;  // Instance variable (accessible by child class)

    // Constructor → initializes variables
    Vehicle(String color) {
        this.color = color;
        System.out.println("Vehicle constructor called");
    }

    // Abstract method → no implementation here
    // Implementation is hidden in abstract class
    // Must be implemented by child class
    
    abstract void start();

    // Concrete method → implementation provided here
    // Can be used directly by child class
    
    void showColor() {
        System.out.println("Vehicle color: " + color);
    }
}


// ------------------- Interface -------------------
// Interface represents full abstraction (all methods abstract by default)
interface Engine {
    // Abstract method → declaration only, no body
    void run(); // Implementation will be done in child class
}

// ------------------- Child Class -------------------
// Child class extends abstract class and implements interface
class Car extends Vehicle implements Engine {
    String model;

    // Constructor → calls parent constructor using super
    Car(String color, String model) {
        super(color); // Vehicle constructor executed
        this.model = model;
        System.out.println("Car constructor called");
    }

    // Implement abstract method from abstract class Vehicle
    @Override
    void start() {
        System.out.println("Car starting...");
    }

    // Implement abstract method from interface Engine
    @Override
    public void run() {
        System.out.println("Engine running...");
    }

    // Child-specific concrete method
    void showModel() {
        System.out.println("Car model: " + model);
    }
}

// ------------------- Main Class -------------------
public class Abstraction_code {
    public static void main(String[] args) {
        // Abstract class reference pointing to child object
        // Demonstrates runtime polymorphism
        Vehicle v = new Car("Red", "Sedan");

        // Call concrete method from abstract class → implementation in abstract class
        v.showColor();  // Output: Vehicle color: Red

        // Call abstract method from abstract class → implemented in child class
        v.start();      // Output: Car starting...

        // Downcasting to access child-specific method and interface method
        Car c = (Car) v;

        // Child-specific method → concrete, implemented in Car
        c.showModel();  // Output: Car model: Sedan

        // Interface method → abstract in interface, implemented in Car
        c.run();        // Output: Engine running...

        // Update color using abstract class variable
        c.color = "Blue";
        c.showColor();  // Output: Vehicle color: Blue
    }
}
