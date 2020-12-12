import java.util.HashSet;
import java.util.Iterator;
//Heterogeneous,isertion order not preserve,duplications not allowed,,null allowed
public class HashSetDEmo {

	public static void main(String[] args) {
	//	HashSet<Integer> h1=new HashSet<Integer>();
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(5.6);
		System.out.println(h1.add("hello"));
		System.out.println(h1.add(10));
		System.out.println(h1);
		
		Iterator  i=h1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
