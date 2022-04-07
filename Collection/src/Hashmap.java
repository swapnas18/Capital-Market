import java.io.ObjectOutputStream.PutField;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class Hashmap {

	public static void main(String[] args) {

		Hashtable<Integer,String > m=new Hashtable<Integer,String >();
		
		m.put(1, "A");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");
		m.put(6, "b");
		m.put(6, "A");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey(6));
		System.out.println(m.putIfAbsent(6, "Ab"));

		
	
			
			
		
	}

}
