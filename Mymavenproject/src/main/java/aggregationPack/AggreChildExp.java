package aggregationPack;

public class AggreChildExp {
   String name;
   int age;
   AggreParentExp ref;
  public AggreChildExp(String name,int age,AggreParentExp ref)
  {
	this.name=name;
	this.age=age;
	this.ref=ref;
  }
  public void display()
  {
	  System.out.println("Name is: "+name);
	  System.out.println("Age is: "+age);
	  System.out.println("State is: "+ref.state);
	  System.out.println("Code is: "+ref.code);
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggreParentExp obj1=new AggreParentExp("kerala",102);
		AggreChildExp obj=new AggreChildExp("krishna",50,obj1);
		obj.display();
		
		
	}

}
