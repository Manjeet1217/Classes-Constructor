package opps.code.Static_Keyword;

class Student {
    String name;       // Instance variable (unique for each object)
    int rollNo;        // Instance variable
    static String college = "IIT";  // Static variable (common for all students)

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(name + " | " + rollNo + " | " + college);
    }
}

public class Static_Variable {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101);
        Student s2 = new Student("Priya", 102);

        s1.display();
        s2.display();

        System.out.println("Changing static variabel from IIT to NIT");
        // Change static variable using one object
        s1.college = "NIT";

        s1.display();
        s2.display();

        // Best practice: Access static variable via class name
        System.out.println(Student.college);
    }
}

