package aggregationPack;

public class AggreChild {
	int no;
	String sub;
	AggreParent ref; //reference variable
  public AggreChild(int no,String sub,AggreParent ref)
  {
	  this.no=no;
	  this.sub=sub;
	  this.ref=ref;
	  
  }
  public void display()
  {
	  System.out.println("Child class display method");
	  System.out.println("RollNo is: "+no);
	  System.out.println("Subject is: "+sub);
	  System.out.println("Name is: "+ref.name);
	  System.out.println("Age is: "+ref.age);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		AggreParent object=new AggreParent(21,"krishna");
		AggreChild obj=new AggreChild(2,"English",object);
		obj.display();
		
	}

}
