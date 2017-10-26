//5. To pass as argument in the constructor call.
public class ArgumentInConstructor {
 int data = 10;
	public ArgumentInConstructor() {
		// TODO Auto-generated constructor stub
		A a = new A(this);
		a.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArgumentInConstructor object = new ArgumentInConstructor();
	}

}
class A{
	ArgumentInConstructor obj;
	A(ArgumentInConstructor obj){
		this.obj  = obj;
	}
	void display() {
		System.out.println(obj.data); //Using data member of class ArgumentInConstructor.
	}
}