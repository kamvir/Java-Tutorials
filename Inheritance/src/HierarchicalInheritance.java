//3. Hierarchical Inheritance.

class Fruit {
	void declare() {
		System.out.println("I am Fruit.");
	}
}

class Apple extends Fruit{
	void say() {
		System.out.println("I am Apple.");
	}
}

class Mango extends Fruit{
	void say() {
		System.out.println("I am Mango.");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Apple a = new Apple();
        a.declare();
        a.say(); //invokes class Apple method say().
                
        Mango m = new Mango();
        m.declare();
        m.say(); //invokes class Mango method say().
	}

}
