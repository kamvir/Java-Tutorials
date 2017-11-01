//c. nested if statement.
public class Conditionals3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks = 65;
        if(marks<50) {
        	System.out.println("Fali.");
        }
        else if(marks>=50&&marks<60) {
        	System.out.println("D grade");
        }
        else if(marks>=60&&marks<70) {
        	System.out.println("C grade");
        }
        else if(marks>=70&&marks<80) {
        	System.out.println("B grade");
        }
        else if(marks>=80&&marks<90) {
        	System.out.println("A grade");
        }
        else if(marks>=90&&marks<100) {
        	System.out.println("A+ grade");
        }
        else {
        	System.out.println("Invalid.");
        }
        //Executes the code block, where the condition is true.
        
	}
	/*
	 * An if statement can be followed by an optional else if...else statement, 
	 * which is very useful to test various conditions using single if...else if statement.When using if, else if,
	 * else statements there are a few points to keep in mind.
	 * 
	 * 1.An if can have zero or one else's and it must come after any else if's.
	 * 2.An if can have zero to many else if's and they must come before the else.
	 * 3.Once an else if succeeds, none of the remaining else if's or else's will be tested.
	 */

}
