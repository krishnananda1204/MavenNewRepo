package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		List <String> r=new ArrayList <String>();
	  //add-to insert elements
		r.add("Red");
		r.add("Green");
		r.add("Yellow");
		r.add("Orange");
		System.out.println(r);
	  
	   //set-provide the index and the value to set in that index
		r.set(1,"White");
		//r.set(4, "gold");
		System.out.println(r);
		
		//indexOf-when repeated is found the it show only the first occurrence
		System.out.println(r.indexOf("Yellow"));
        r.add("white");
        System.out.println(r);
        System.out.println(r.indexOf("White"));
        
        //lastIndexOf- last occurrence of object
		 System.out.println(r.lastIndexOf("White"));
	
		 //remove-object to be removed by giving index
		 r.remove(3);
		 System.out.println(r);
		 r.remove("Yellow");
		 System.out.println(r);

        //get-to get the object giving index
		 System.out.println(r.get(0));
		 
		 //contains-to check if object is present or not
		 System.out.println(r.contains("Red"));
		 System.out.println(r.contains("Black"));
		 
		 //isEmpty
		 if(r.isEmpty())
		 {
			 System.out.println("List is empty");

		 }else {
			 System.out.println("List is not empty");

		 }
		 System.out.println(r.isEmpty());

		 //size
		 System.out.println(r.size());

		 for(int i=0;i<r.size();i++)
		 {
			 System.out.println(r.get(i));
		 }

		 //forEach
		 for(String ar:r)
		 {
			 System.out.println(ar);
		 }
		 
		 
	}

}
