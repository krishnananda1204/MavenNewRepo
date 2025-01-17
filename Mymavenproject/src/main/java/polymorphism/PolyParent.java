package polymorphism;

public class PolyParent {
  public void calc(int a,int b)
  {
	  int sum=a+b;
	  System.out.println("Sum is: "+sum);
  }
  
  public void sum(int a,int b)
  {
	  int mul=a*b;
	  System.out.println("Multiplication is: "+mul);
  }
}
