package opps.code.Static_Keyword;

class Test{
	int x=20;
	static int y = 20;
	
	void show() {
		System.out.println("x = " + x);
	}
	
	static void display() {
		// direct access of static variable
		System.out.println(" y = " +y);
		
		
		
		//---------------
		
		//non-static variable refernece can not possible from static method
		//System.out.println("x = " +x);
		// error ->> Cannot make a static reference to the non-static field x
		
		//non-static method cannot be called directly from static method 
		//show();
		//  error -->  Cannot make a static reference to the non-static method show() from the type Test
		
		//------------------
		
		
		// correct way to call non-static variable and method
		Test t = new Test();
		System.out.println("x = "+t.x);
		t.show();
		
		
		
	}
	
	
}

public class Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.display();

	}

}
