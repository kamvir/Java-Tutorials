/*
 * this keyword in java is a reference variable that refers to current object.
 * this can be used in 6 ways.
 * 1. To refer current class instance variable.
 * 2. To invoke current class method(implicitly).
 * 3. To invoke current class constructor.
 * 4. To pass as an argument in the method call.
 * 5. To pass as argument in the constructor call.
 * 6. To return the current instance from method.
 */
//1. To refer current class instance variable.
public class CurrenCLassInstance {
int rno;
String name;
	public CurrenCLassInstance(int rno,String name) {
		// TODO Auto-generated constructor stub
		this.rno = rno;
		this.name = name;
		/*
		 * Here this.rno, this.name refers to the instance variable which are declared 
		 * first(See line no 13 and 14). The variables inside the constructor are the local 
		 * variables which have same name but difference is created due tothis keyword.
		 */
	}
 void display() {
	 System.out.println(rno+" "+name);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CurrenCLassInstance obj = new CurrenCLassInstance(111, "Viraj");
       obj.display();
	}

}
