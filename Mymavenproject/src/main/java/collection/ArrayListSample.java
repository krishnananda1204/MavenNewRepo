package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lis=new ArrayList();  //object of arrayList
	    lis.add("Red");
	    lis.add("Green");
	    lis.add("Orange");
	    lis.add("White");
	    lis.add("Pink");
	    System.out.println(lis);
	    ArrayList a1=new ArrayList();
	    a1.add("Car");
	    a1.add("Bus");
	    a1.add("Bike");
	    a1.add("Auto");
	    System.out.println(a1);
	    
	    //addAll-to add from one list to another
	   // System.out.println(lis.addAll(a1));
	   // System.out.println(lis);
	    System.out.println(a1.addAll(lis));
	    System.out.println(a1);
	    
	    lis.remove(1);
	    System.out.println(lis.get(3));
	    System.out.println(lis);
	    
	    //iterator
	    Iterator <String> itr=lis.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    itr.remove();
	    System.out.println(lis);
	}

}
