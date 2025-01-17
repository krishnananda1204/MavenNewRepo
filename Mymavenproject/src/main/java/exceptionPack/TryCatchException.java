package exceptionPack;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//arithmetic exception handling
   	/* int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println("Division is: "+c);
		}
		catch(ArithmeticException e){
			b=2;
			int c=a/b;
			//System.out.println("Exception handled");
	       System.out.println(c);
		}
		finally {
			System.out.println("Program ends here");
		}
	*/
		
	//arrayindexoutofbounds exception  handling
		
	  /*	try {
			int a[]= {1,2,3,4,5};
			for(int i=0;i<=7;i++)
			{
				System.out.println("array elements:"+a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("program ends here");
		}
		*/
		try {
		String s=null;
		System.out.println("String exception example"+s.length());
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("program ends here");
		}
	}

}
