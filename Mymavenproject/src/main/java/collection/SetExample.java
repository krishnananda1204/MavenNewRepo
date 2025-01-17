package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set is orderless
     Set<String> s=new HashSet<String>();
     s.add("Kinder Joy");
     s.add("Kitkat");
     s.add("Dairy Milk");
     s.add("Milkybar");
     System.out.println(s);
     
     //addAll
     Set<String> s1=new HashSet<String>();
     s1.add("Jasmin");
     s1.add("Sunflower");
     s1.add("Rose");
     s.addAll(s1);
     System.out.println(s);
     
     //contains
     System.out.println(s.contains("Jasmin"));
     System.out.println(s1.contains("Diary Milk"));
     System.out.println(s.contains("Lotus"));
     
     //size
     System.out.println(s.size());
     
     //isEmpty
     System.out.println(s.isEmpty());
     
     //remove
     s.remove("Sunflower");
     System.out.println(s);
     
     Iterator <String> itr=s.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     
     //clear
     s.clear();
     System.out.println(s);
	}

}
