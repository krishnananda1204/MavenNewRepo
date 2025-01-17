package exceptionPack;

public class ExampleThrows {
  public static void display() throws ArithmeticException
  {  
	  System.out.println("Exception throws example");
	  throw new ArithmeticException("throwing exception");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  ExampleThrows.display();
      }
      catch(ArithmeticException e) {
    	  System.out.println("Exception handled");
      }
	}

}
