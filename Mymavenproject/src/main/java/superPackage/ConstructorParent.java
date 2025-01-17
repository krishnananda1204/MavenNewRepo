package superPackage;

public class ConstructorParent {
  public ConstructorParent(int a,int b)
  {
	  int c=a+b;
	  System.out.println("parent class constructor sum is: "+c);
  }
  
  public ConstructorParent(int a,int b,int c)
  {
	  int d=a+b+c;
	  System.out.println("parent class constructor sum is: "+d);
  }
  public ConstructorParent(String name)
  {
	  System.out.println("parent 3rd constructor:  "+name);
  }
}
