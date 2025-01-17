package inheritance;

public class ChildMultilevel extends IntermediateMultilevel {
  public void displayMultiChild()
  {
	  System.out.println("i am the multilevel child class");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMultilevel obj=new ChildMultilevel();
		obj.displayMultiParent();
		obj.displayMultiIntermediate();
		obj.displayMultiChild();
	}

}
