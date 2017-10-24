
public class Constructors {
/*
 * Constructors are special types of method that is used 
 * to initialize objects. It is invoked in the time of object
 * creation. It constructs the values i.e., provide data to the 
 * object that is why it is known as constructor.
 * 
 * There two types of constructors, mainly:
 * 1. Default Constructor
 * 2. Parameterized Constructor
 */
	int id;
	//Default Constructor
	public Constructors() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Default constructor. Default value: "+id);
	}
	
	//Parameterized Constructor
	public Constructors(int i) {
		// TODO Auto-generated constructor stub
		id = i;
		System.out.println("This is Parameterized constructor. Initialized value: "+i);
	}
	
	//Constructor overloading.
	public Constructors(int i,int n) {
		// TODO Auto-generated constructor stub
		id = i;
	
		System.out.println("This is Overloaded constructor. Values passed here are: "+i+","+n);
	}
	
	//Copy Constructor
	public Constructors(Constructors c) {
		// TODO Auto-generated constructor stub
		int i;
		i = c.id;
		
		System.out.println("This is a Copy Constructor. Values copied are: "+i);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Constructors c1 = new Constructors();//invokes the default Constructor automatically.
        Constructors c2 = new Constructors(3);//invokes the parameterized constructor by 
                                               //initializing the value
        Constructors c3 = new Constructors(3,2);//invokes the Overloaded constructor and shows the
                                                //values that are being passed.   
        Constructors c4 = new Constructors(c2);//Copies the values which are present in other 
                                               //constructor
        
        System.out.println("\n\nNote: Refer code properly.");
	}
/*
 * Constructor do return a value. The value it returns is the current class instance (You cannot
 * use return type, yet it returns a value).
 * It is not only used for object initialization but also used for starting a thread, calling a method etc.
 * You can perform any operation in the constructor as you perform in the method. 
 */
}
