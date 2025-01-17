package superPackage;

public class ChildInstanceVar extends ParentInstanceVar{
   String color="Red";
   public void display()
   {
	   System.out.println("Color from child class is : "+color);
	   System.out.println("Color from parent class is : "+super.color);
	   //here super is used to access parent class instance variable
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildInstanceVar obj=new ChildInstanceVar();
		obj.display();
	}

}
