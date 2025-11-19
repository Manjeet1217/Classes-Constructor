//byte → short → int → long → float → double
//        char → int → long → float → double


package opps.code.Pillars_Of_Java;

class Automaitc_Promotion{
 
	void show(int a) {
		System.out.println("Automaitc_Promotion.show()-int method");
	}
	
	void show(double a) {
		System.out.println("Automaitc_Promotion.show()-double method");
	}
	
	
	
}


public class Method_Overloading_Automatic_Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automaitc_Promotion atp =new Automaitc_Promotion();
		atp.show(5);    // int
		atp.show(5.5);  // float
		atp.show(5l);   // long --> double
		atp.show('a');  // char --> int

		
	}

}
