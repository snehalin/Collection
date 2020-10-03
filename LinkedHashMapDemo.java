import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	//Heterogeneous,insertion order  preserve,null key,valaue allowed
	//duplicate ky not allowed but value allowed
	public static void main(String[] args) {
		LinkedHashMap h1=new LinkedHashMap();
		//h1.add(12);
		h1.put(10,"abc");
		System.out.println("h1.put(4.7,c)="+h1.put(4.7,'c'));
		h1.put(67,98.7);
		h1.put(70,98.7);
		h1.put(null,null);
		System.out.println("h1.put(10,pqr)="+h1.put(10,"pqr"));
		System.out.println(h1);
		
		
		
		  java.util.Set s2=h1.entrySet();
		    System.out.println("using entryset");
		     Iterator i1=s2.iterator();
		
		     while(i1.hasNext())
		     {
		    	Map.Entry e=(Map.Entry)i1.next();
		    	
		    	System.out.println(e.getKey()+" "+e.getValue());
		     }
	}

}
