import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
//Heterogeneous,insertion order not preserve,null key,valaue allowed
//duplicate ky not allowed but value allowed	
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		//h1.add(12);
		h1.put(10,"abc");
		System.out.println("h1.put(4.7,c)="+h1.put(4.7,'c'));
		h1.put(67,98.7);
		h1.put(70,98.7);
		h1.put(null,null);
		System.out.println("h1.put(10,pqr)="+h1.put(10,"pqr"));
		System.out.println(h1);
		
		System.out.println(h1.containsKey(70));
	java.util.Set s1=h1.keySet();
	System.out.println(s1);
	java.util.Collection c1=h1.values();
		
		System.out.println(c1);

		System.out.println("h1.get(70)="+h1.get(70));
		System.out.println("_________________");
		java.util.Iterator i=s1.iterator();//key
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.print(o+" ");
			System.out.println(h1.get(o));
		}
	
	
	    java.util.Set s2=h1.entrySet();
	    System.out.println("using entryset");
	     Iterator i1=s2.iterator();
	
	     while(i1.hasNext())
	     {
	    	Map.Entry e=(Map.Entry)i1.next();
	    	
	    	System.out.println(e.getKey()+" "+e.getValue());
	     }
	     
	
	}
	
	
	
	
	
	/*
	 interface Map
	 {
	 
	    inteface Entry
	    {
	         k getKey();
	         v getValue();
	         setValue(v);
	    
	    }
	 
	 
	 }
	 
	 
	 
	 */
	
	
	
	
	

}
