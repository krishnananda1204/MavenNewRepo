package encapsulation;

public class EncapsChild2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		EncapsParent1 obj=new EncapsParent1();
		obj.setUsername("krishna@gmail.com");
		obj.setPassword("12345");
		System.out.println("Username is: "+obj.getUsername());
		System.out.println("Password is: "+obj.getPassword());
	}

}
