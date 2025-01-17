package inheritance;

public class HierarchialChildB extends HierarchialParent{
	public void displaychildB()
	{
		System.out.println("Hierarchial Child Class B");
	}
	public void display1()
	{
		System.out.println("THANK YOU");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		HierarchialChildB obj=new HierarchialChildB();
		obj.displayparent();
		obj.displaychildB();
		obj.display1();
		
	}

}
