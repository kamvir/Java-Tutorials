
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Type casting of variables\n");
        System.out.println("1. Auto Type Casting(Widening, implicitly done):");
        int i = 100;
        long l = i;  //Automatically type cast the variable because it is larger than source type.
        float f = l; // same as above.
        
        System.out.println("int i = "+i);
        System.out.println("long l = i  gives "+l);
        System.out.println("float f = l gives "+f);
        
        System.out.println("\n2. Narrowing casting (Explicitly done): ");
        double d = 100.066;
        long a = (long)d; //Explicitly needs to be specified cause it is smaller than source type
        int s = (int)a;  //same as above
        
        System.out.println("double d = "+d);
        System.out.println("long a = (long)d gives "+l);
        System.out.println("int s = (int)l gives "+s);
        
        System.out.println("\nType casting of super and sub classes:");
        System.out.println("\n* Up Casting and Down Casting:");
        ChildCast c = new ChildCast();
        System.out.println("ChildCast c = new ChildCast() gives "+c);
        Casting x = c;//Up Casting. "ChildCast" inherits properties from parent "Casting". 
        System.out.println("Casting x = c (Automatic Upcasting) gives "+x);//The value doesn't changes 
        //but the labeling does.
        
        ChildCast c2 = (ChildCast)x;//Down Casting.
        
        System.out.println("ChildCast c2 = (ChildCast)x (Down cast manually done) gives "+c2);
        /*
         * Casting y = new Casting();
         * ChildCast c3 = (ChildCast)y;
         * The above statement cause exception of 
         * java.lang.ClassCastException: Casting cannot be cast to ChildCast
         */
        c.display();//Invokes the method under ChildCast.
        c2.display();//Same as above.
        /*
         * x.display(); cannot be done cause though it has ChildCast object stored in it, 
         * important thing is that it has Casting(Parent) Reference to it. For this either 
         * we have to make a private method display in Casting(Parent) class or downcast it
         *  again to ChildCast.
         */
        x.display();
        
        System.out.println("\nNote: Refer code for understanding...");
	}

	private void display() {
		// TODO Auto-generated method stub
		/*
		 * Private access is necessary for actually accessing this method(In Casting class). 
		 * Public access will bring out the method which is in ChildCast.
		 */
		System.out.println("I m Parent.");
	}

	

	

}
