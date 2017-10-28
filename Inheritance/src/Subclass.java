// Subclass accesses.
class Superclass{
	int number = 2000;
	public void method() {
		System.out.println("Public method accessed by subclass.");
	}
	
	protected void method2() {
		System.out.println("Protected method accessed by subclass.");
	}
	
	private void method3() {
		System.out.println("Private method cannot be accessed by subclass");
	}
}
public class Subclass extends Superclass{
	 int salary = 20000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Subclass s = new Subclass();
       System.out.println("Number = "+s.number); //Prints Superclass variable number.
       System.out.println("Salary = "+s.salary);//Prints Subclass variable salary.
       s.method();
       s.method2();
       //s.method3(); //cannot be accessed as it is declared private
	}
/*
 * What can you do in subclass??
 * Ans: A subclass inherits all of the public and protected members of its parent, 
 * no matter what package the subclass is in. If the subclass is in the same package
 * as its parent, it also inherits the package-private members of the parent. You can
 * use the inherited members as is, replace them, hide them, or supplement them with new members:
 * 
 * 1. The inherited fields can be used directly, just like any other fields.
 * 2. You can declare a field in the subclass with the same name as the one in the superclass, 
 *    thus hiding it (not recommended).
 * 3. You can declare new fields in the subclass that are not in the superclass.
 * 4. The inherited methods can be used directly as they are.
 * 5. You can write a new instance method in the subclass that has the same signature as the one
 *    in the superclass, thus overriding it.
 * 6. You can write a new static method in the subclass that has the same signature as the one in 
 *    the superclass, thus hiding it.
 * 7. You can declare new methods in the subclass that are not in the superclass.
 * 8. You can write a subclass constructor that invokes the constructor of the superclass, either
 *    implicitly or by using the keyword super.
 *    
 * Private Members in a Super class:
 * 
 * A subclass does not inherit the private members of its parent class. However, 
 * if the superclass has public or protected methods for accessing its private fields, 
 * these can also be used by the subclass.A nested class has access to all the private 
 * members of its enclosing class—both fields and methods. Therefore, a public or protected 
 * nested class inherited by a subclass has indirect access to all of the private members of
 * the superclass.
 */
}

