/*Looping in Java:
 * Looping in programming languages is a feature which facilitates the execution of a set of 
 * instructions/functions repeatedly while some condition evaluates to true.Java provides three 
 * ways for executing the loops. While all the ways provide similar basic functionality, they differ 
 * in their syntax and condition checking time.
 * 
 * 3 loops that Java has 
 * 1. for loop
 * 2. while loop
 * 3. do-while loop
 * 
 * 1. for loop:
 *  for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement 
 *  consumes the initialization, condition and increment/decrement in one line thereby providing a shorter,
 *  easy to debug structure of looping.
 *  *Syntax:
 *  for(initialization; test condition; increment/decrement){
 *  //code to be executed
 *  }
 *  
 *   i. Initialization condition: Here, we initialize the variable in use. It marks the start of a for loop.
 *      An already declared variable can be used or a variable can be declared, local to loop only.
 *   
 *   ii. Testing condition: It is used for testing the exit condition for a loop. It must return a boolean 
 *       value. It is also an Entry Control Loop as the condition is checked prior to the execution of the 
 *       loop statements.
 *       
 *   iii. Statement execution: Once the condition is evaluated to true, the statements in the loop body are
 *        executed.    
 *        
 *   iv. Increment/Decrement: It is used for updating the variable for next iteration.
 *   
 *   v. Loop Termination: When the condition becomes false, the loop terminates marking the end of its life 
 *      cycle.
 *      
 *      There are three types of for loop:
 *      a. Simple for loop.
 *      b. for-each loop (Enhanced for loop).
 *      c. Labeled for loop.
     
 */

// a. Simple for loop.
public class Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=10;i++) {
        	System.out.println(i);
        }
	}

}
