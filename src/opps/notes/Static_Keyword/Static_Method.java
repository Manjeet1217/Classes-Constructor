package opps.notes.Static_Keyword;

public class Static_Method {

}

/*
🔹 Static Method in Java

1. Definition:
  - Static method is a class-level method.
  - It belongs to the class, not to any object.
  - Can be called without creating an object.

2. Rules:
  - Cannot use 'this' or 'super' keyword inside a static method.
  - Can directly access only static variables and other static methods.
  - Cannot directly access instance (non-static) variables or methods.

3. Syntax:
  static returnType methodName(parameters) {
      // method body
  }

4. Usage:
  - Utility or helper methods (like Math.sqrt(), Math.max(), etc.)
  - Common functionality for all objects of a class.
  - Reduces memory usage because no object required.

5. Access:
  - By ClassName.methodName()
  - Can also be accessed via object reference (not recommended)

6. Example:
  class Calculator {
      static int add(int a, int b) {
          return a + b;
      }

      int multiply(int a, int b) {
          return a * b;
      }
  }

  public class Demo {
      public static void main(String[] args) {
          int sum = Calculator.add(5, 10); // static method call
          Calculator c = new Calculator();
          int product = c.multiply(5, 10); // non-static method call
      }
  }
*/







/*
🔹 Static Method Rules in Java (Explained)

1️⃣ Rule 1: Cannot use 'this' or 'super' inside a static method
  - 'this' keyword = current object reference
  - 'super' keyword = parent class reference
  - Static method = class-level, object ke bina call hota hai
  - Koi current object nahi hota → 'this' aur 'super' ka use static method me nahi ho sakta

  Example:
      class Car {
          static void show() {
              // System.out.println(this); // ❌ ERROR
              // super.start();            // ❌ ERROR
              System.out.println("Static method");
          }
      }

2️⃣ Rule 2: Can directly access only static variables and other static methods
  - Static method ke paas sirf class-level members hote hain directly accessible
  - Non-static (instance) variables/methods = object-specific → direct access nahi
  - Object ke through hi non-static members access kar sakte ho

  Example:
      class Test {
          static int x = 10;   // static variable
          int y = 20;          // instance variable

          static void display() {
              System.out.println(x); // ✅ OK, static variable
              // System.out.println(y); // ❌ ERROR, non-static
          }
      }

3️⃣ Rule 3: Cannot directly access instance (non-static) variables or methods
  - Static method me object ke bina execute hota hai
  - Instance members object ke saath bind hote hain → direct access nahi
  - Agar access karna hai → object create karo aur object ke through call karo

  Example:
      class Test {
          int y = 20;

          static void display() {
              Test t = new Test();
              System.out.println(t.y); // ✅ Access via object
          }
      }

4️⃣ Rule 4: Static method can be called without creating an object
  - Syntax: ClassName.methodName()
  - Object ke through bhi call ho sakta hai (not recommended)

  Example:
      Calculator.add(10, 20); // static method call without object

🔑 Summary:
- Static method = class-level, shared by all objects
- Object-specific members = static method me direct access nahi
- 'this' / 'super' keywords = object ke liye → static method me invalid
- Sirf static variables aur static methods directly accessible
*/
