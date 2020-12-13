import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
////Heterogeneous,duplications not allowed,no duplicate keys allowed,
////duplicate values allowed,null key and value allowed,Insertion order preserve
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap h1=new LinkedHashMap();
		h1.put(10,"abc");
		h1.put(1.0,"abc");
		h1.put("abz",1.2f);
		h1.put('z',null);
		h1.put(null,null);
		System.out.println(h1.put('0',"abc"));//null
		System.out.println(h1.put(10,"abc"));//abc
		System.out.println(h1.put(10,"xyz"));
		System.out.println(h1);
		
		LinkedHashMap h2=new LinkedHashMap();
		h2.putAll(h1);
		h2.put(2,"two");
		System.out.println(h2);
		Collection c=h2.values();//returns collection of values
		System.out.println(c);//[a,aa,a,a,a]
		
		Set s1=h2.keySet();//set of all keys    iterator()
		System.out.println(s1);
		
		System.out.println(h2.get(10));//takes key and retrive its values
		
		System.out.println("----keySet() and get()----------");
		Iterator i=s1.iterator();
		while(i.hasNext())
		{
			Object key=i.next();//1st key
			System.out.println(key+" "+h2.get(key));
		}

	}

}
