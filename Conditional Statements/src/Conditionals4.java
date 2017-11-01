/*
 * 2. switch statement:
 * 
 *  A switch statement allows a variable to be tested for equality against a list of values.
 *  Each value is called a case, and the variable being switched on is checked for each case.
 *  
 *  The following rules apply to a switch statement −
 *  1. The variable used in a switch statement can only be integers, convertable integers (byte, short, char), 
 *     strings and enums.
 *  2. You can have any number of case statements within a switch. Each case is followed by the value to be compared 
 *     to and a colon.
 *  3. The value for a case must be the same data type as the variable in the switch and it must be a constant or a
 *     literal.
 *  4. When the variable being switched on is equal to a case, the statements following that case will execute until
 *     a break statement is reached.
 *  5. When a break statement is reached, the switch terminates, and the flow of control jumps to the next line following
 *     the switch statement.
 *  6. Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent 
 *     cases until a break is reached.
 *  7. A switch statement can have an optional default case, which must appear at the end of the switch. The default case
 *     can be used for performing a task when none of the cases is true. No break is needed in the default case.
 */
//Normal Switch.
public class Conditionals4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 20;
		switch(number) {
		case 10: System.out.println("10");
		break;
		case 20: System.out.println("20");
		break;
		case 30: System.out.println("30");
		break;
		default: System.out.println("Not in 10,20,30.");
		}

	}

}
