package opps.notes.Pillars_Of_Java;

public class Couping_notes {

}



/*
🔑 Coupling in Java

👉 Definition:
Coupling ka matlab hai ek class ka dusri class par kitna dependency hai.
- Agar ek class directly dusri class ke implementation par depend kare → Tight Coupling
- Agar ek class sirf abstraction (interface/abstract class) par depend kare → Loose Coupling

-------------------------------------------
1️⃣ Tight Coupling
  - Ek class directly dusri class ka object banati hai aur use karti hai.
  - Example:
       class Car {
           PetrolEngine e = new PetrolEngine();  // direct dependency
           void run() {
               e.start();
           }
       }
  - Problem: Agar PetrolEngine ko DieselEngine se replace karna ho,
             to Car class ke code ko modify karna padega.
             (Maintenance problem)

-------------------------------------------
2️⃣ Loose Coupling
  - Ek class abstraction (interface/abstract class) par depend karti hai.
  - Dependency injection use karte hai.
  - Example:
       interface Engine { void start(); }

       class Car {
           Engine e; 
           Car(Engine e) {  // dependency injection
               this.e = e;
           }
           void run() {
               e.start();
               System.out.println("Car is running...");
           }
       }

  - Ab chahe PetrolEngine ho ya DieselEngine,
    Car class ko modify karne ki zarurat nahi hai.
    Sirf object creation ke waqt Engine ka type pass karna hai.

-------------------------------------------
3️⃣ Why Loose Coupling is Better?
  - Code flexible ho jata hai
  - Easily extendable (new engines add kar sakte ho bina Car class badle)
  - Follows OOP principle → "Program to an interface, not to an implementation"

-------------------------------------------
🔑 Summary:
- Tight Coupling = More dependency → Less flexibility
- Loose Coupling = Less dependency → More flexibility (Recommended)
*/

