package exceptionPack;

public class ThrowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
