// Real use

class Parent3{
	int id;
	String name;
	Parent3(int id, String name){
		this.id = id;
		this.name = name;
		
	}
}

class Child3 extends Parent3{
	float fees;
	Child3(int id, String name, float fees){
		super(id, name); //Reusing Parent3 class
		this.fees = fees;
		
		/*
		 * In the above lines of codes if I interchange line no. 17 to 16 and vice versa.
		 * Following error will occur:
		 * Implicit super constructor Parent3() is undefined. Must explicitly invoke another constructor
	     * Constructor call must be the first statement in a constructor
	     * 
	     * So keep in mind that the super() statement should always be the first statement in the constructor.
		 */
	}
	void display() {
		System.out.println(id+" "+name+" "+fees);
	}
}
public class InvokeParentConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child3 c1 = new Child3(111,"Viraj",2000f);
      c1.display();
         
	}
	/*
	 * Important points:
	 * 
     * 1. Call to super() must be first statement in Derived Class constructor.
     * 2. If a constructor does not explicitly invoke a superclass constructor, the Java 
     *   compiler automatically inserts a call to the no-argument constructor of the superclass.
     *   If the superclass does not have a no-argument constructor, you will get a compile-time error. 
     *   Object does have such a constructor, so if Object is the only superclass, there is no problem.
     * 3. If a subclass constructor invokes a constructor of its superclass, either
     *    explicitly or implicitly, you might think that a whole chain of constructors called, 
     *    all the way back to the constructor of Object. This, in fact, is the case. 
     *    It is called constructor chaining..
	 */

}
