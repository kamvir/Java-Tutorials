//Proof that this refers to same object.
 
public class ProofOfThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ProofOfThis obj = new ProofOfThis();
        System.out.println(obj); //Prints reference Id of the object.
        obj.m();
	}

	public void m() {
		// TODO Auto-generated method stub
		System.out.println(this); //Prints the same reference Id of the object.
	}



}
