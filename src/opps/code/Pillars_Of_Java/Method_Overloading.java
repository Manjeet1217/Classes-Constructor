//method overloading ka simple matlab hota hai kisi class mein ek naam ke multiple 
//methods with different return type


package opps.code.Pillars_Of_Java;

class calculator{
	
	int add() {
		return  5+7;
	}
	
	int add(int a, int b) {
		return  a+b;
	}
	
	int add(int a, int b,int c) {
		return  a+b+c;
	}
	
	double add(double a, double b) {
		return  a+b;
	}
	
	
	
	
}


public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator calc = new calculator();
		System.out.println(calc.add());
		System.out.println(calc.add(5,3));
		System.out.println(calc.add(5,9,8));
		System.out.println(calc.add(5.0,25.6));
	}

}
