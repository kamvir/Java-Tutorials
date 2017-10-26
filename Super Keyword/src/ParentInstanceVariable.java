/*
 * The super keyword in java is a reference variable that is used 
 * to refer parent class objects.The keyword “super” came into the 
 * picture with the concept of Inheritance.
 * 
 * Usage of super keyword:
 * 1. To refer parent class instance variable.
 * 2. To invoke parent class method.
 * 3. To invoke parent class constructor.
 */

//1. To refer parent class instance variable.

class Parent{
	String color = "White";
	
}

class Child extends Parent{
	String color = "Black";
	void printColor() {
		System.out.println("Child color: "+color); //Prints color of Child class.
		System.out.println("Parent color: "+super.color); //Prints color of Parent class.
	}
}

public class ParentInstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child c = new Child();
        c.printColor();
	}
/*
 * Here both Parent and Child class share a same property "color". To refer to the Parent's 
 * color we need to use super keyword.
 */
}

