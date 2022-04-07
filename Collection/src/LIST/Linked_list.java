package LIST;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list {

	public static void main(String[] args) {
//		it allow multiple duplicate value
//	n number of	null value allow
//	storage type index
//	 order of insertion maintain
//	 data structure is linear
// no default capacity 
//	best choice for manupulation
//	worst choice for retrival operation
		
		 LinkedList ss = new LinkedList();
           ss.add(1234);
           ss.add('s');
           ss.add("sapnashinde");
           ss.add(99);
           ss.add(null);
           ss.add("pandharpur");
           ss.add('s');
           ss.add("abcd");
           ss.add(99);
           ss.add(null);
//          
//   	System.out.println(ss.get(8));
//   	System.out.println(ss.getFirst());
//   	System.out.println(ss.getClass());
   System.out.println("==============================");
 Iterator  it=ss.iterator();
   		while (it.hasNext()) {
   			System.out.println(it.next());
   		}
   	 System.out.println("==============================");
		for (Object s:ss) {
			System.out.println(s);
		}
		 System.out.println("==============================");
		
		ListIterator s1 = ss.listIterator();
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
