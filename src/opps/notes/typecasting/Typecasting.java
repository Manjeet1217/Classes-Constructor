package opps.notes.typecasting;

public class Typecasting {

}


/*
🔑 Object Typecasting in Java

👉 Typecasting in Java = Reference variable ko ek type se dusre type me convert karna 
  (but only in case of parent-child relationship).

------------------------------------------------------
1. Why we need typecasting?
------------------------------------------------------
- Jab hum parent reference se child object banate hain:
   Parent p = new Child();

 Ab p reference ke through sirf parent class ke methods accessible hote hain.
 Agar child ke methods bhi use karna chahte hain → hume **downcasting** karna padta hai.

------------------------------------------------------
2. Types of Casting
------------------------------------------------------
✅ Upcasting (safe):
  - Child → Parent
  - Explicit cast ki jarurat nahi.
  Example:
     Child c = new Child();
     Parent p = c;  // Upcasting (always safe)

✅ Downcasting (risky):
  - Parent → Child
  - Explicit cast jaruri hai.
  Example:
     Parent p = new Child();
     Child c = (Child) p;  // Downcasting (safe if actual object is Child)

------------------------------------------------------
3. Compile-time Rules (Compiler check)
------------------------------------------------------
- Casting allowed tabhi hai jab dono classes ke beech Parent-Child ya Interface-Implementation relation ho.
- Agar completely unrelated classes hain → Compile-time error.

  Example:
     class A {}
     class B {}

     A a = new A();
     // B b = (B) a; ❌ Error: A and B are unrelated

------------------------------------------------------
4. Runtime Rules (JVM check)
------------------------------------------------------
- JVM actual object ka type check karta hai.
- Agar cast sahi hai → safe.
- Agar galat hai → ❌ ClassCastException.

  Example:
     Parent p = new Child();
     Child c = (Child) p;  // ✅ Safe

     Parent p2 = new Parent();
     Child c2 = (Child) p2; // ❌ Runtime error (ClassCastException)

------------------------------------------------------
5. Summary Table
------------------------------------------------------
| Case                                           | Compile-time | Runtime Result            |
|------------------------------------------------|--------------|---------------------------|
| Upcasting (Child → Parent)                     | Allowed      | Always Safe ✅             |
| Downcasting (Parent → Child, actual is Child)  | Allowed      | Safe ✅                    |
| Downcasting (Parent → Child, actual is Parent) | Allowed      | ❌ ClassCastException       |
| Unrelated classes casting                      | ❌ Error      | N/A                       |

------------------------------------------------------
6. Real-life Example
------------------------------------------------------
interface Engine {
   void start();
}

class DieselEngine implements Engine {
   public void start() { System.out.println("Diesel starting..."); }
   public void engineModel() { System.out.println("Model X"); }
}

class Test {
   public static void main(String[] args) {
       Engine e = new DieselEngine(); // Upcasting (safe)
       e.start();  // Only Engine methods accessible

       // Downcasting (to access child specific methods)
       DieselEngine de = (DieselEngine) e;
       de.engineModel(); // ✅ Now child-specific method accessible
   }
}

------------------------------------------------------
📝 KEY POINTS:
- Upcasting = always safe, no cast required.
- Downcasting = needs explicit cast, risky at runtime.
- Unrelated classes ko cast karna = not allowed.
- Use downcasting jab parent ref se child-specific features access karne ho.
*/
