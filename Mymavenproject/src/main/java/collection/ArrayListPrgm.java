package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Create a New ArrayList,Add Some Colors,and Print the Collection	
     ArrayList ar=new ArrayList();
     ar.add("Green");
     ar.add("Violet");
     ar.add("Black");
     ar.add("Purple");
     System.out.println("Array list: "+ar);
     
     //Retrieve an Element at a Specified Index
     System.out.println("Retrieve element in 2nd index: "+ar.get(2));
     
     //Iterate Through All Elements in an ArrayList
     Iterator<String> itr=ar.iterator();
     while(itr.hasNext()) {
    	 System.out.println("iterate through all elements:"+itr.next());
     } 
     
	 
     //Remove the Third Element from an ArrayList
     ar.remove(3);
     System.out.println("Remove 3 rd element: "+ar);
     
     //Search an Element in an ArrayList
     System.out.println("Search Violet color is contain: "+ar.contains("Violet"));
     
	}

}
