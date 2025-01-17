package superPackage;

public class ConstructorChild extends ConstructorParent {

	public ConstructorChild()
	{   
		super(25,3);
		System.out.println("i am the child class constructor");
	}
	
	public ConstructorChild(int a,int b)
	{   
		super(12,3,58);
		int c=a+b;
		System.out.println("Child sum: "+c);
	} 
	public ConstructorChild(String name)
	{
		super("krishna");
		System.out.println("child 3rd constructor is: "+name);
	}
	public ConstructorChild(int a,int b,int c)
	{
		this("nanda");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ConstructorChild obj=new ConstructorChild();
		ConstructorChild obj1=new ConstructorChild(25,10);
		ConstructorChild obj2=new ConstructorChild("krishna");
		ConstructorChild obj3=new ConstructorChild(20,30,25);
	}

}
