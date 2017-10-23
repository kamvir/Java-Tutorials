
public class SetterGetter {
	int age;
	String name;
	
	//Setter Method for age 
	public void setAge(int a) {
		age = a;

	}
	/*
	 *  "void" in here means,
	 *   it returns no type(data type).
	 */
	
	//Setter method for name.
	public void setName(String s) {
		name = s;
	}
     
	//Getter method for age.
	public int getAge(int a) {
		return a;
	}
	
	public String getName(String s) {
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SetterGetter sg = new SetterGetter();
        int a = 22;
        String s = "Viraj";
        sg.setName(s);//Setting a name.
        sg.setAge(a);//Setting age.
        
        System.out.println("Hi! My name is "+sg.getName(s)+".");
        System.out.println("I am "+sg.getAge(a)+" years old.");
        
	}

}
