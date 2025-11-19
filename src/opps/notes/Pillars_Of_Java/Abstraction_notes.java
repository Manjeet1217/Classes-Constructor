package opps.notes.Pillars_Of_Java;

public class Abstraction_notes {

}



/*
🔑 Abstraction in Java

1. Definition:
  - Abstraction = "Hiding unnecessary details and showing only essential features".
  - Real-life example: Driving a car → You use steering, accelerator, brake. You don't need to know engine internals.

2. How to achieve in Java:
  a) Interface:
     - 100% abstraction (all methods abstract, all variables public static final).
     - Used to define method contracts.
  b) Abstract Class:
     - Partial abstraction (abstract methods + concrete methods + variables + constructors).
     - Can provide common code for child classes.

3. Abstract Class Features:
  - Can have abstract methods (without body).
  - Can have concrete methods (with body).
  - Can have variables (instance/static/final).
  - Can have constructors (called when child object created).
  - Cannot create object directly.

4. Interface Features:
  - Only method declarations (Java 7), Java 8+ can have default/static methods.
  - Variables always `public static final`.
  - No constructors.
  - Supports multiple inheritance.

5. Differences (Abstraction Perspective):

| Feature                | Abstract Class                          | Interface                          |
|------------------------|----------------------------------------|-----------------------------------|
| Abstraction Level      | Partial (abstract + concrete methods)  | Full (Java 7) / Partial (Java 8+)|
| Variables              | Instance/static/final allowed           | Only public static final           |
| Constructors           | Allowed                                | Not allowed                       |
| Inheritance            | Single inheritance only                | Multiple inheritance supported    |
| Use case               | Common code + partial abstraction      | Only method contract / full abstraction |

6. Why use Abstraction:
  - Hide unnecessary details.
  - Improve code reusability and maintainability.
  - Implement polymorphism.

7. Real-life Analogy:
  a) Driver & Car: Driver sees steering, brake, accelerator (essential), engine hidden (details hidden)  
  b) Smartphone: User sees call, message, camera features; internal OS & hardware hidden  

8. Short Example:

abstract class Vehicle {
   String color;
   Vehicle(String color) { this.color = color; }  // constructor
   abstract void start();  // abstract method
   void showColor() { System.out.println(color); } // concrete method
}

interface Engine {
   void run();  // method declaration
}

class Car extends Vehicle implements Engine {
   Car(String color) { super(color); }
   void start() { System.out.println("Car starting..."); }
   public void run() { System.out.println("Engine running"); }
}

public class Main {
   public static void main(String[] args) {
       Vehicle v = new Car("Red");
       v.showColor(); // Red
       v.start();     // Car starting...
       ((Car)v).run(); // Engine running
   }
}

✅ Key Point: Abstraction = hiding unnecessary details + showing essential features
*/
