package opps.code.Pillars_Of_Java;
interface Engine1{
	void start();
}

class PetrolEngine implements Engine1{
	public void start() {
		System.out.println("PetrolEngine.start()");
	}
	
}

class DieselEngine implements Engine1{
	public void start() {
		System.out.println("DieselEngine.start()");
	}
}

class Car1{
	
	Engine1 e;
	
	Car1(Engine1 e){
		this.e = e;
	}
	
	void run() {
		e.start();
		System.out.println("Car.run()");
	}
}

public class Loose_Coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine1 petrol = new PetrolEngine(); // parent ref child obj
		Car1 c1 = new Car1(petrol);
		c1.run();
		
		Car1 c2 = new Car1(new DieselEngine());
		c2.run();
		
		

	}

}
