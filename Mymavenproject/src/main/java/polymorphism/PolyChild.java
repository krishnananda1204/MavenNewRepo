package polymorphism;

public class PolyChild extends PolyParent {
  public void calc(int a,int b)
  {
	  super.calc(10, 5); //child nne vilikanam is a relation ship ayond
	  int sub=a-b;
	  System.out.println("Substraction is: "+sub);
	  
  }
  
  public void sum(int a,int b)
  {
	  super.sum(20,5);
	  int div=a/b;
	  System.out.println("Division is: "+div);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolyChild obj=new PolyChild();
		obj.calc(5,2);
		
		//PolyParent obj1=new PolyParent();
		//obj1.calc(10, 5);
		obj.sum(20, 5);
		
		
	}

}
