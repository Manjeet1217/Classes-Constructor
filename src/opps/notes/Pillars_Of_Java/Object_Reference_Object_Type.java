package opps.notes.Pillars_Of_Java;

public class Object_Reference_Object_Type {

}

/*
🔑 Object Reference vs Object Type in Method Overriding




1. Parent reference + Parent object:
   - Accessible methods: only Parent methods
   - Execution: Parent methods
   Example:
       Parent p = new Parent();
       p.show();   // Output: Parent's show()

2. Child reference + Child object:
   - Accessible methods: both Parent and Child methods
   - Execution: depends on method
       -> If overridden → Child's version
       -> If not overridden → Parent's version
   Example:
       Child c = new Child();
       c.show();            // Child's show()
       c.onlyChildMethod(); // Child specific method

3. Parent reference + Child object:
   - Accessible methods: only Parent methods (compile-time check)
   - Execution: 
       -> If method overridden → Child's method executes (runtime polymorphism)
       -> If not overridden → Parent's method executes
   - Child-specific methods ❌ NOT accessible
   Example:
       Parent pc = new Child();
       pc.show();   // Child's show()
       pc.onlyChildMethod(); // ❌ Compile-time error
*/
