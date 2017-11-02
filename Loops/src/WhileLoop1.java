/*
 * 2. while loop:
 *    A while loop is a control flow statement that allows code to be executed repeatedly
 *    based on a given Boolean condition. The while loop can be thought of as a repeating 
 *    if statement.
 *    
 *    Syntax: 
 *    while(Boolean Condition){
 *    //code to be executed.
 *    }
 *    
 *    i. While loop starts with the checking of condition. If it evaluated to true, then the 
 *       loop body statements are executed otherwise first statement following the loop is executed.
 *       For this reason it is also called Entry control loop.
 *   
 *   ii. Once the condition is evaluated to true, the statements in the loop body are executed. 
 *       Normally the statements contain an update value for the variable being processed for the
 *       next iteration.
 *  iii. When the condition becomes false, the loop terminates which marks the end of its life cycle.     
 */
public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 1;
        while(i<=10) {
        	System.out.println(i);
        	i++;
        }
	}

}
