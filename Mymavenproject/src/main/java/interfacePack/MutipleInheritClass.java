package interfacePack;

public class MutipleInheritClass implements MultipleInheritInterface1,MultipleInheritInterface2,MultipleInheritInterface3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MutipleInheritClass obj=new MutipleInheritClass();
		obj.display1();
		obj.display2();
		obj.display();
		obj.test();
		
		//MultipleInheritInterface3 obj1=new MutipleInheritClass();
		//obj.test();
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Interface 1 method");
	}
   
	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2 method");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface 3 method");	
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Interface 4 method");
	}

	
	
}
