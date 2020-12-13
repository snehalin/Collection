import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//homogeneous,duplications not allowed,no duplicate keys allowed,
////duplicate values allowed,null key and value allowed,Insertion  ordernot
//preserve but objects are display in ascending order of key
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap h1=new TreeMap();
		h1.put(10,"abc");
		h1.put(10,"xyz");
		h1.put(20,"xyz");
		h1.put(140,"xabc");
		h1.put(160,"vabc");
		h1.put(120,"abbc");
		h1.put(100,"abnc");
		
		
		TreeMap h2=new TreeMap();
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

		System.out.println("----------------");
		
		Map.Entry e=h1.firstEntry();
		System.out.println(e);
		
		System.out.println("h1.lowerEntry(100)="+h1.lowerEntry(100));//<
		System.out.println("h1.higherEntry(100)="+h1.higherEntry(100));//>
		System.out.println("h1.ceilingEntry(100)="+h1.ceilingEntry(100));//>=
		System.out.println("h1.floorEntry(100)="+h1.floorEntry(100));//<=
		System.out.println("h1.ceilingEntry(111)="+h1.ceilingEntry(111));
		
		
		
		
		
		
		
		
	}
	}


