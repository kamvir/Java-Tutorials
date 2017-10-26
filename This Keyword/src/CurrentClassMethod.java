//2. To invoke current class method(implicitly).
public class CurrentClassMethod {
void a() {
	System.out.println("This is 'a' ");
}
void b() {
	System.out.println("This is 'b' ");
	this.a();
	/*
	 * The above line(no. 8) can also be written as 
	 * a();
	 * that won't make any difference because compiler
	 *  will automatically change it into line no.8.
	 */
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CurrentClassMethod obj = new CurrentClassMethod();
       obj.b();
	}

}
