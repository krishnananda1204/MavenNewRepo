package exceptionPack;

public class ExampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//arithmetic exception
		/*int a=10;
		int b=0;
		int div=a/b;
		System.out.println("Division is: "+div);
		*/
		
		//arrayindexoutofbounds exception
	/*	int array[]= {1,2,3,4,5};
		for(int i=0;i<=5;i++)
		{
			System.out.println("Array elements: "+array[i]);
		}
	*/
		//null pointer exception
		String s=null;
		System.out.println("String exception example"+s.length());

	}

}
