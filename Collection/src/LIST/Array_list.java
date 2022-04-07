package LIST;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list {
//	duplicate is allowed
//	nul value allowed
//	storage type index
//	order of inesertion maintain
	//data structure is resizable
	//incrementle capacity is current capacity*1.5+1
	//best choice for retrival operation
	//worst choice for manupulation operation
      public static void main(String[] args) {
		ArrayList s= new ArrayList();	
	    s.add("swapnali");
	    s.add(11);
	    s.add("shinde");
	    s.add('s');
	    s.add(null);
	    s.add(18);
	    s.add('a');
	    s.add(true);
	    s.add(false);
	    s.add(18.11);
	     s.remove(4);
	    s.get(3);
	    s.add(4, null);
	    System.out.println();
	    System.out.println(s.size());
	    System.out.println(s);
		
	
		System.out.println(s.get(4));
		
		System.out.println("====iterator=====");
		Iterator ss= s.iterator ();
	
		while (ss.hasNext()) {
			System.out.println(ss.next());
		}
		System.out.println("====for loop====");
		for (int i=0;i<=s.size()-1;i++) {
			System.out.println(s.get(i));
		}
		System.out.println("=======each loop======");
		for (Object o:s) {
			System.out.println(o);}
		
		System.out.println("====listIterator====");
ListIterator sss = s.listIterator();
		while( sss.hasNext()) {
			System.out.println(sss.next());
		}
		
		
	}

}
