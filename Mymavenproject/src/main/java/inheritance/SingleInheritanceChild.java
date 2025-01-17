package inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent{
    public void read()
    {
    	System.out.println("Single inheritance child class");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceChild obj=new SingleInheritanceChild();
		obj.read();
		obj.display();
	}

}
