// Tightly Encapsulated Class

package opps.code.Pillars_Of_Java;

class Student{
	
	// Private variabels --> Direct access nahi
	private int id;
	private String name;
	private int age;
	
	// constructor --> essential data set karna
	
	Student (int id, String name, int age){
		this.id=id;
		this.name = name;
		this.age = age;
	}
	
	//Getter for id
	public int getId() {
		return id;
	}
	
	// Setter for id
	public void setId(int id) {
		this.id = id;
	}
	
	// Getter for name
	public String getName() {
		return name;
	}
	
	// Setter for name
		public void setName(String name) {
			this.name = name;
		}
	
	// Getter for age
	public int age() {
		return age;
	}
	
	// Setter for age
		public void setAge(int age) {
			if(age>0) {
			this.age = age;
			}else {
				System.out.println("Age must be positive");
			}
		}
		
		// show method
		
		void show() {
			System.out.println("ID: "+ id + ", Name: " + name + ", Age: " + age);
		}
	
	
	
	
}
public class Tightly_Encapsulated_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101,"Manjeet",22);
		
		s1.show();
		
		s1.setAge(25);
		s1.setAge(-1);
		s1.show();
		

	}

}
