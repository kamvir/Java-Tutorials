
public class OverLoaders {
/*
 * Signature of the method is declared as:
 * methodName(list of arguments);
 * 
 * In method overloading, you need to keep in mind that the names of the 
 * methods can be same but not their signatures.
 * Here's an example below.  
 */
	public void draw(int a) {
		System.out.println("Minimum number of Paint Brushes: "+a);
	}
	
	public void draw(String s) {
		System.out.println("Drawing topic: "+s);
	}
	/*
	 * The above code is right and will work properly,
	 * because they have same names but they don't have same arguments.
	 * Hence, the code will work.
	 */
	/*
	 * If I again declare a method say:
	 * 
	 * public void draw(int b) {
		
	      }
	      
	      The compiler would not differentiate between the method mentioned above(on line 11).
	      Hence, it will cause an error due to having same method signatures.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OverLoaders o = new OverLoaders();
        o.draw("Animals");
        o.draw(3);
	}

}
