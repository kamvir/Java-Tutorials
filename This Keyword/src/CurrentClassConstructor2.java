//3. To invoke current class constructor.
public class CurrentClassConstructor2 {
//Calling parameterized constructor from default constructor.
	public CurrentClassConstructor2() {
		// TODO Auto-generated constructor stub
		this(5);
		System.out.println("Default Constructor");
	}
	/*
	 * From above block of code, keep in mind that the this() should be written first, don't write
	 * System.out.println("Default Constructor"); //(Referring from line 6 and 7)
	 * this(5); //(Referring from line 6 and 7)
	 * 
	 * The above lines of code will produce a error:
	 * call to this must be first statement in constructor.
	 * SO, ALWAYS WRITE this() FIRST!!!! 
	 */
	public CurrentClassConstructor2(int x) {
		// TODO Auto-generated constructor stub
		
		System.out.println("Parameterized Constructor. Value is: "+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CurrentClassConstructor2 obj = new CurrentClassConstructor2();
       
	}

}
