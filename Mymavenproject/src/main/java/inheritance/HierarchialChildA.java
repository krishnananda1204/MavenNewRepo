package inheritance;

public class HierarchialChildA extends HierarchialParent {
	public void displaychildA()
	{
		System.out.println("Hierarchial Child Class A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		HierarchialChildA obj=new HierarchialChildA();
		obj.displayparent();
		obj.displaychildA();
	}

}
