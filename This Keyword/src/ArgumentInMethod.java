//4. To pass as an argument in the method call.
public class ArgumentInMethod {
 void m(ArgumentInMethod obj) {
	 System.out.println("Method m invoked");
 }
 void n() {
	 m(this);
	 /*
	  * invokes the method m by passing the object 'a'(which is referred by this keyword)
	  * which is created.
	  */
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArgumentInMethod a = new ArgumentInMethod();//Creates object name 'a'
       a.n();
    		   
       /*
        * APPLICATION: In event handling or situation where to provide reference of a
        * class to another one used to reuse one object in many methods.
        */
	}

}
