package superPackage;

public class MethodChild extends MethodParent{
   public void show()
   {
	   System.out.println("I am child class method");
	   super.display();
	   this.show1(); //this invokes current class method
	   super.display1(); //this invokes super/parent class method
   }
   public void show1()
   {
	   System.out.println("i am also child class method");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		MethodChild obj=new MethodChild();
		obj.show();

	}

}
