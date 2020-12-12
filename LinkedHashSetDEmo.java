import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDEmo {
////Heterogeneous,isertion order  preserve,duplications not allowed,null allowed
	public static void main(String[] args) {
		LinkedHashSet h1=new LinkedHashSet();
		h1.add(10);
		h1.add(5.6);
		h1.add(10);
		h1.add(null);
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
