package accessSpecifier;

public class AccessClass {
	private void privateMethod()
	{
		System.out.println("Private method");
	}
    
	public void publicMethod()
	{
		System.out.println("Public method");
	}

	protected void protectedMethod()
	{
		System.out.println("Protected method");
	}

	 void defaultMethod()
	{
		System.out.println("Default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessClass obj=new AccessClass();
		obj.privateMethod();
		obj.publicMethod();
		obj.protectedMethod();
		obj.defaultMethod();
	}

}
