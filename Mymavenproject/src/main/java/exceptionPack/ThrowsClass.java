package exceptionPack;

public class ThrowsClass {

	public void display() throws ArithmeticException
	{
		System.out.println("Exception throws");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsClass obj=new ThrowsClass();
		obj.display();
		int age=15;
        if(age>=18)
        {
        	System.out.println("Eligible for voting");
        }
        else {
        	throw new ArithmeticException("Not eligible for voting");
        }
	}
	}

