package opps.notes.Pillars_Of_Java;

public class Tightly_Encapsulated_notes {

}


/*
🔑 Tightly Encapsulated Class in Java

1. Definition:
  - A class is tightly encapsulated if:
    a) All variables are private
    b) Access via public getter/setter only
    c) No direct access from outside

2. Purpose / Advantages:
  - Data hiding → safe from unintended modifications
  - Controlled access → validation in setters
  - Maintainability → internal changes don’t affect external code
  - Flexibility → can change implementation internally

3. Key Points:
  - Constructor initializes essential fields
  - Getter provides read access
  - Setter provides controlled write access




4. Short Example:

class Student {
   private int id;
   private String name;
   private int age;

   // Constructor
   Student(int id, String name, int age) {
    
    	... 
    
    }

   // Getter and Setter for id
   public int getId() { ... }
   public void setId(int id) { ... }


   // Getter and Setter for name
   public String getName() { ... }
   public void setName(String name) { ... }


   // Getter and Setter for age (with validation)
   public int getAge() { ... }
   public void setAge(int age) { ... }


   // Show method
   void show() { ... }
}




5. Usage:
  - Create object → initialize via constructor
  - Modify fields → use setters
  - Access fields → use getters

✅ Takeaway: Tightly encapsulated class ensures **data safety, controlled access, and flexibility**.
*/
