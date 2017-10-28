//2. Multilevel Inheritance
class GrandParent{
	void eat() {
		System.out.println("Grand Parent: eating");
	}
}

class Parent1 extends GrandParent{
	void serving() {
		System.out.println("Parent: serving");
	}
}

class Child1 extends Parent1{
	void sleep() {
		System.out.println("Children: sleeping");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.eat();
		c.serving();
		c.sleep();
	}

}
