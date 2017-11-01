/*
 * Conditional Statement:
 *  In Java, like all other programming languages, is equipped with specific statements 
 *  that allow us to check a condition and execute certain parts of code depending on
 *  whether the condition is true or false. Such statements are called conditional, and 
 *  are a form of composite statement.
 *  
 *  There are two types of Conditional Statements:
 *  1. the if-else statement, to choose between two alternatives;
 *  2. the switch statement, to choose between multiple alternatives.
 *  
 *  1. The if-else Statement:
 *   The Java if statement is used to test the condition. It checks boolean condition:
 *   true or false. There are various types of if statement in java.
 *   
 *   a. if statement.
 *   b. if-else statement.
 *   c. nested if statement(if-else-if ladder).
 */
//a.if statement
public class Conditionals1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		if(age>18) {
			System.out.println("Age above 18, age is : "+age); //Executes if the given condition in if is true.
		}
       //If the above condition is false the codes executes but no output is shown as there is line of code
   	// after the if statement. You can check it by changing the value of age(line no.25) in the code.
	}

}
