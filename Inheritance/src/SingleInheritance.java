/*
 * Inheritance in java is a mechanism in which one object acquires all the properties
 * and behaviors of parent object.The idea behind inheritance in java is that you can
 * create new classes that are built upon existing classes. When you inherit from an
 * existing class, you can reuse methods and fields of parent class, and you can add 
 * new methods and fields also.Inheritance represents the IS-A relationship, also known 
 * as parent-child relationship.
 * 
 * Usage of Inheritance in java:
 * 1. For Method overriding(so runtime Polymorphism can be achieved).
 * 2. For code reusability.
 * 
 * Syntax:
 * class subclass extends superclass
 * {
 * //methods and fields
 * }
 * 
 * The extends keyword indicates that you are making a new class that derives from an 
 * existing class. The meaning of "extends" is to increase the functionality.
 * In the terminology of Java, a class which is inherited is called parent or super class and 
 * the new class is called child or subclass. 
 * 
 * There are many types of Inheritance as follows:
 * 1. Single Inheritance.
 * 2. Multilevel Inheritance.
 * 3. Hierarchical Inheritance.
 */
//Single Inheritance
class Parent {
	void eat() {
		System.out.println("Parent: eating");
	}
}

class Child extends Parent{
	void filled() {
		System.out.println("Children: filled");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c = new Child();
       c.eat();
       c.filled();
	}

}
