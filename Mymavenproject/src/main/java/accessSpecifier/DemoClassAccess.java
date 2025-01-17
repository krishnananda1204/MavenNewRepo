package accessSpecifier;

public class DemoClassAccess extends AccessClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		DemoClassAccess obj1=new DemoClassAccess();
		obj1.publicMethod();
		obj1.protectedMethod();
		obj1.defaultMethod();
		
		//obj1.privateMethod();  private support only with in the class.it not support sub classes
	}

}
