package encapsulation;

public class EncapsChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//here object is created for parent and invoked in child
		//this way it is usually done
		EncapsParent obj=new EncapsParent();
		//EncapsChild obj=new EncapsChild();
		//here object is created for child instead which can also be done
		obj.setName("krishna");
		obj.setAge(20);
		System.out.println("Name is: "+obj.getName());
		System.out.println("Age is: "+obj.getAge());
	}

}
