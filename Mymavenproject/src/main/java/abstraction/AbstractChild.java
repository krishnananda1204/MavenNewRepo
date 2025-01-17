package abstraction;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		AbstractChild obj=new AbstractChild();
		obj.display();
	    obj.show();
	    obj.display1();
	    obj.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("parent abstract method is displayed here");
	}
	public void display1()
	{
		System.out.println("child non abstract method");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("parent abstract method");
	}

}
