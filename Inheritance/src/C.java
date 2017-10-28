// Rejection of multiple Inheritance in java.

class A{
	void msg() {
		System.out.println("A");
	}
}

class B{
	void say() {
		System.out.println("B");
	}
}

public class C extends A, B { // Suppose if it were.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C c = new C();
        c.msg(); // Now which msg() method would be invoked.
	}
/*
 * Important Note: The above code won't run. It will show an Compilation Error.
 * The reason of this error is Java does not support multiple inheritance.
 * The reason to avoid multiple inheritance is to reduce the complexity and simplify the language. 
 *  
 */
}

