// 6. To return the current instance from method.
class C{
	C getC() {
		return this;
	}
	
	void msg() {
		System.out.println("Hello Human!!!");
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new C().getC().msg();
	}

}

