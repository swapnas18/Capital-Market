package SET;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linked_set {

	public static void main(String[] args) {
	
		//data structure is linear and hashtable
		//storage type hashtable
		//order of insertion is maintain
		//best choice for remove duplicate element  when order of insertion mandetory
		 LinkedHashSet l=new LinkedHashSet();
		
		 int s[]= { 1,2,6,8,4,9,3,3,8,0,3,7,0,0,0,0,0,0};
		 String ss[]= {"sapna","shinde","18","SS","sapna","swapna"};
	
	
	for( String o:ss){	 
		l.add(o);
	}
	System.out.println(l);
	
	for( int o:s){	 
		l.add(o);
	}
	System.out.println(l);
	
	Iterator it = l.iterator();
	while ( it.hasNext()) {
		System.out.println(it.next());
	}
	
	
}
	




}
