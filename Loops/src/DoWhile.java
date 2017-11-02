/*
 * 3. do-while loop:
 *    do while loop is similar to while loop with only difference that it checks for condition
 *    after executing the statements, and therefore is an example of Exit Control Loop.
 *    
 *    Syntax:
 *    do{
 *    //code to be executed.
 *    }
 *    while(condition);
 *    
 *    i. do while loop starts with the execution of the statement(s). There is no checking of any
 *       condition for the first time.
 *   ii. After the execution of the statements, and update of the variable value, the condition is
 *       checked for true or false value. If it is evaluated to true, next iteration of loop starts.
 *  iii. When the condition becomes false, the loop terminates which marks the end of its life cycle.
 *   iv. It is important to note that the do-while loop will execute its statements atleast once before 
 *       any condition is checked, and therefore is an example of exit control loop.
 */
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i = 1;
         do {
        	 System.out.println(i);
        	 i++;
         }
         while(i<=10);
	}

}
