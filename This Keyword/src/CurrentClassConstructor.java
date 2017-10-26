//3. To invoke current class constructor.
public class CurrentClassConstructor {
//Calling default constructor from parameterized constructor.
	public CurrentClassConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	public CurrentClassConstructor(int x) {
		// TODO Auto-generated constructor stub
		this();//Invokes Default constructor.
		System.out.println("Parameterized Constructor. Value is: "+x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CurrentClassConstructor obj = new CurrentClassConstructor(5);
	}

}
