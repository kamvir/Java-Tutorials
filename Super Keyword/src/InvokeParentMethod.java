// 2. To invoke parent class method.

class Parent1{
	void create() {
		System.out.println("Parent created.");
	}
	
	void eat() {
		System.out.println("Parent started eating.");
	}
}
class Child1 extends Parent1{
	void create() {
		System.out.println("Child created.");
	}
	
	void eat() {
		System.out.println("Child started eating.");
	}
	
	void start() {
		super.create(); //invokes Parent1 method create
		create();      //invokes Child1 method create
		super.eat();  //invokes Parent1 method eat
		eat();       //invokes Child1 method eat
	}
}
public class InvokeParentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Child1 c = new Child1();
         c.start();
	}

}
