
public class OperatorTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignment Operators.
      int a = 1, b = 2;
      //Arithmetic operators.    
      System.out.println("Assignment Operators:");
      System.out.println("a = "+a);
      System.out.println("b = "+b);
      System.out.println("\nArithmetic Operators:");
      System.out.println("a + b = "+(a+b));//Addition
      System.out.println("b - a = "+(b-a));//Subtraction
      System.out.println("a * b = "+(a*b));//Multiplication
      System.out.println("a / b = "+((float)a/b));//Division
      System.out.println("a % b = "+(a%b));//Remainder
      
      //Unary Operators.
      System.out.println("\nUnary Operators:");
      a = +a;// Unary plus.
      System.out.println("a = "+a);//prints 1.
      a--;//Decrement operator.
      System.out.println("a = "+a);//Prints 0
      a++; //Increment Operator
      System.out.println("a = "+a);//Prints 1
      a = -a;//Unary Minus 
      System.out.println("a = "+a);//Prints -1
      boolean c = false;
      System.out.println("c = "+c);
      c = !c;//Logical compliment
      System.out.println("c = "+c);//Prints true
      
      //Pre and Post increment/decrement operators
      System.out.println("\nPre and Post increment/decrement Operators:");
      int i = 1;
      System.out.println("i = "+i);//Prints 1
      i++;//Post increment
      System.out.println("i++ = "+i);//Prints 2
      ++i;//Pre-increment
      System.out.println("++i = "+i);//Prints 3
      System.out.println("i = "+(i++));//Prints 3
      System.out.println("i = "+(i));//Prints 4
      System.out.println("i = "+(++i));//Prints 5
      i--;//Post decrement
      System.out.println("i-- = "+i);//Prints 4
      --i;//Pre-decrement
      System.out.println("--i = "+i);//Prints 3
      System.out.println("i = "+(i--));//Prints 3
      System.out.println("i = "+(i));//Prints 2
      System.out.println("i = "+(--i));//Prints 1
      
      //Equality operator
      System.out.println("\nEqaulity and Relational Operators:");
      int val1 = 1,val2 = 2;
      if(val1==val2)//Equality operator
      System.out.println("Val1 == Val2");
      
      if(val1!=val2)//Not Equal to
    	  System.out.println("Val1 != Val2");
      
      if(val1<val2)//Less than
    	  System.out.println("Val1  < Val2");
      
      if(val1 <= val2)//Less than or Equal to
    	  System.out.println("Val1 <= Val2");
      
      if(val1>val2)//Greater than
    	  System.out.println("Val1 > Val2");
      
      if(val1>=val2)//Greater than or Equal to
    	  System.out.println("Val1 >= Val2");
      
      System.out.println("\nConditional Operators:");
      if((val1 == 1) && (val2 == 2))//Conditional-AND
      { System.out.println("Va1 is 1 AND Val2 is 2");}
      if((val1 == 1) || (val2 == 2))//Conditional-OR
    	  {System.out.println("Val1 is 1 OR Val2 is 2");}
      
      System.out.println("\nTernary Operator:");
      int result;
      result = (val1<val2)?val1:val2 ;//Ternary Operation Returns val1 for true or val2 for false.
      System.out.println("Result is true so result = "+result);
      
      System.out.println("\nType Comparison(instanceof) Operator:");
      
     Parent obj1 = new Parent();
     Parent obj2 = new Child();
    		  
      System.out.println("obj1 instanceof Parent: "+(obj1 instanceof Parent));
      System.out.println("obj1 instanceof Child: "+(obj1 instanceof Child));
      System.out.println("obj1 instanceof MyInterface: "+(obj1 instanceof MyInterface));
      System.out.println("obj2 instanceof Parent: "+(obj2 instanceof Parent));
      System.out.println("obj2 instanceof Child: "+(obj1 instanceof Child));
      System.out.println("obj2 instanceof MyInterface: "+(obj1 instanceof MyInterface));
      System.out.println("\nBitWise and BitShift Operators:");
      int bitwise = 10, val = 8;
      System.out.println("AND = "+(val & bitwise));//AND 
      System.out.println("OR = "+(val | bitwise));//OR
      System.out.println("Left Shift = "+(val << bitwise));//Left Shift Formula: val*2^bitwise
      System.out.println("Right Shift = "+(val >> bitwise));//Right Shift Formula: val/2^bitwise
      System.out.println("Unsigned Right Shift = "+(val >>> bitwise));//Unsigned Right Shift 
      //Formula:val/2^bitwise(For positive values.) 
      //For negative changes parity bit(MSB) to 0.
      System.out.println("Unsigned Right Shift(for negative) = "+(-val >>> bitwise));
      System.out.println("\nNOTE: If you are unable to understand, please see the Code....");
      
      
}

}
