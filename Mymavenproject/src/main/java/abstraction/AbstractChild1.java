package abstraction;

public class AbstractChild1 extends AbstractParent1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		AbstractParent1 obj=new AbstractChild1();
		//here a object reference is created as abstract class has no constructor invoking
		//object is created for child class and given as reference to parent class
		obj.display();
		obj.test();
		//obj.display2();
		//display2() cannot be invoked as display2() is a method of child class only those methods
		//which are defined in abstract class can be accessed through reference object
	}
	public void display2()
	{
		System.out.println("display method 2 is implemented here");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method is implemented here");
	}

}
