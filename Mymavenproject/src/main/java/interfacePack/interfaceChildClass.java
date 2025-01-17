package interfacePack;

public class interfaceChildClass implements interfaceParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceParent obj=new interfaceChildClass();
		//similar to abstraction here object reference created for parent 
		obj.display();
		System.out.println("variable is: "+a);
		//obj.display1();
		
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("child class implements display method from interface");
	}

	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("child class implements display method2 from interface");
	}
}
