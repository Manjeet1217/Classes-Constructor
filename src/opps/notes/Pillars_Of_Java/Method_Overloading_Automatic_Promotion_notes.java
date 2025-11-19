package opps.notes.Pillars_Of_Java;

public class Method_Overloading_Automatic_Promotion_notes {

}

/*
🔑 Automatic Promotion in Method Overloading

👉 Kya hota hai?
  Jab hum method ko call karte hain aur exact matching method 
  available nahi hota, tab Java automatically argument ko 
  "next higher datatype" mein promote karke suitable overloaded 
  method ko call karta hai.

👉 Promotion Chain (Hierarchy):
  byte → short → int → long → float → double
  char → int → long → float → double

👉 Important Rules:
  1. Exact match milega to wahi method call hoga.
  2. Agar exact match nahi mila → argument ko promote kiya jaayega.
  3. Agar ek se zyada promotion possible ho → ❌ Ambiguity error.

👉 Example 1: Normal Promotion
   void show(int a)    { System.out.println("int method"); }
   void show(double a) { System.out.println("double method"); }

   show('a');   // char → int  → "int method"
   show(10L);   // long → double → "double method"
   show(5);     // int (exact match) → "int method"

👉 Example 2: Ambiguity Case
   void show(long a)   { System.out.println("long method"); }
   void show(float a)  { System.out.println("float method"); }

   show(10); // int can go to long OR float → ❌ Compile-time error

✅ Key Points (Interview ke liye):
  - Exact match > Promotion.
  - Promotion ka use tabhi hota hai jab exact match available nahi hota.
  - Multiple promotion options = Ambiguity.
  - Automatic promotion se code flexible hota hai, lekin dikkat tab hoti hai
    jab ek hi argument do alag direction mein promote ho sakta hai.
*/

