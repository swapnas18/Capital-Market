package SET;

import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet <String > ss = new TreeSet();
		 ss.add("swapnali");
		   
		    ss.add("shinde");
		    ss.add("s");
  ss.add("a");
		    ss.add("true");
		    ss.add("false");
		 System.out.println(ss);
		 System.out.println("remove   "+ss.pollFirst());
		    System.out.println(ss.pollLast());
		    System.out.println(ss);
		    
		    System.out.println(ss.remove("s"));
		    System.out.println(ss);    
	}

}
