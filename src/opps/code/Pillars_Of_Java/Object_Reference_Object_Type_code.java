package opps.code.Pillars_Of_Java;

class Parent {
    void show() {
        System.out.println("Parent.show()");
    }
    
    void onlyParent() {
        System.out.println("Only in Parent");
    }
}

class Child extends Parent {
    // Overriding method
    @Override
    void show() {
        System.out.println("Child.show()");
    }
    
    // Child-specific method
    void child_show() {
        System.out.println("Child.child_show()");
    }
}

public class Object_Reference_Object_Type_code {
    public static void main(String[] args) {
        
        // Case 1: Parent reference + Parent object
        Parent p = new Parent();
        p.show();           // Parent.show()
        p.onlyParent();     // Parent specific method
        
        // Case 2: Child reference + Child object
        Child c = new Child();
        c.show();           // Child.show()  (overridden method)
        c.child_show();     // Child specific method
        c.onlyParent();     // Inherited method from Parent
        
        // Case 3: Parent reference + Child object
        Parent pc = new Child();
        pc.show();          // Child.show() (Runtime Polymorphism / Dynamic Method Dispatch)
        pc.onlyParent();    // Accessible, because Parent has this method
        // pc.child_show(); // ❌ Compile-time error: Reference is Parent type
        
        // Case 4: Downcasting Parent reference to Child
        Child down = (Child) pc; // Explicit cast
        down.child_show();       // ✅ Now Child specific method accessible
    }
}
