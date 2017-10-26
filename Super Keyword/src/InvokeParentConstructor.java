//3. To invoke parent class constructor.

class Parent2{
	Parent2(){
		System.out.println("This is Parent!!!");
	}
}

class Child2 extends Parent2{
	Child2(){
		super(); //invokes the Parent2 class constructor.
		System.out.println("This is Child!!!");
	}
} 

public class InvokeParentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child2 c = new Child2();
       
	}
/*
 * Here in line no.11, If you don't write the super keyword that won't make any difference.
 * Because compiler automatically adds a super() in each class constructor if there is no 
 * super() in it.
 */
}
