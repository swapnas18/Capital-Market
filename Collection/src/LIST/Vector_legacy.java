package LIST;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_legacy {

	public static void main(String[] args) {
		//duplicate are allowed
		//n number of null value allowed
		//storage type index
		//order of insersion maintain
		//default capacity is 10
		//data structure is doubly
		//ic =current capacity*2
		//best choice for retrival operation
		//worst choice for manupulation operation
		//vector is legacy class
		
		Vector v= new Vector();
		v.add('s');	v.add("sapna");	v.add(18);	v.add(null);
		v.add(null);	v.add('s');	v.add(98);	v.add("shinde");
		v.add("sapna");	v.add(1234);	v.add(18.98);	v.add(null);
		System.out.println(v);
		System.err.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.contains('s'));
		System.out.println(v.get(3));
		v.add(3,9);
		System.out.println(v.get(3));
		System.out.println(v.size());
//		System.out.println("====for loop===");
//		for (int i=0;i<=v.size()-1;i++) {
//			System.out.println(v.get(i));
//	}
//		System.out.println("====for each====");
//		 for (Object s:v) {
//			  System.out.println(s);
//		 }
		System.out.println("==enumeration=====");
		 System.out.println("enumaration");
		 Enumeration e= v.elements();
		 while (e.hasMoreElements()) {
			 System.out.println(e.nextElement());
		 }
		 System.out.println(" ===listiterator=====");
              ListIterator list = v.listIterator();{
            	  while(list.hasNext()) {
            		  System.out.println(list.next());
            	  }
            	  
              }
		
		
	}

}
