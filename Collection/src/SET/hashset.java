package SET;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
	// doesnt allow duplicate
	//allow only one null value
		//order of insertion is random insersion
		//storage Type is hashtable
		//no default capacity
		//data strucyture is hashtable
		
		//best choice for remove  duplicate element when order of insertion is not mandatory
		
		HashSet   <String> h= new HashSet();
 
	int s[]= { 1,2,6,8,4,9,3,3,8,0,3,7,0,0,0,0,0,0};
//		
//	for( int o:s) {
//		h.add(o);
//	
//	}
		System.out.println(h);
	
String ss[]= {"sapna","shinde","18","SS","sapna","swapna"};
for( String sss:ss) {
	h.add(sss);
	
}
System.out.println(h);
}
}

