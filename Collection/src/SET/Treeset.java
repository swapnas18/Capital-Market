package SET;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
	//doesnt allow duplicate
		//null value not allow
		//storage type hashtable
		//data structure balanced tree
		//best choice for remove duplication and order of insertin in assending 
		
	  TreeSet <String > ss = new TreeSet();
//	 
     // int s[]= { 1,2,6,8,4,9,3,3,8,3,7,0,0,0,0,0,7};
     String sss[]= {"sapna","shinde","18","SS","swapna"};
//	for (int i:s) {
//		ss.add(i);
//	}
     
    System.out.println( ss.pollFirst());
    ;
     System.out.println(ss.pollLast());
     
	System.out.println(ss);
	for (String z:sss) {
	ss.add(z);}
//		
	//System.out.println(ss);
	
	
	
	
//	
//	        Iterator s1=ss.iterator();
//	        while (s1.hasNext()) {
//	        	System.out.println(s1.next());
//	        }
//	        
//	        for (String s2:ss) {
//	        	System.out.println(s2);
//	        }
//	        
	        
	}}


