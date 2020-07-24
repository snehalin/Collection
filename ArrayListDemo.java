import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
/*
 1.heterogeneous/homegeneous
 2.Duplication allowed
 3.Null Value allowed
 4.Based on DynamicArray datastructure
 5.Isertion Order Preserve.
 6.Frequent operation is Retrival
 */
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("Size="+a1.size());
		a1.add("hi");
		a1.add(10);
		a1.add(1.2f);
		a1.add(1,'c');
		
			
		//ArrayList<Integer> a2=new ArrayList<Integer>(); homogeneous Objects
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("hello");
		a2.add(1.4f);
		a2.add(null);
		a2.add(null);
		a2.add("hello");
		System.out.println(a2);
		System.out.println("a2.isEmpty()="+a2.isEmpty());
		System.out.println("a2.size()="+a2.size());
		System.out.println("a2.contains()="+a2.contains('d'));
		System.out.println("a2.remove(10)="+a2.remove((Object)10));
		System.out.println("a2.remove(1.2f)="+a2.remove(1.2f));
		System.out.println("a2.remove(0)="+a2.remove(0));
		System.out.println("a2.removeAll(a1)="+a2.removeAll(a1));
		a2.addAll(a1);
		
		System.out.println("before retainAll="+a2);
		System.out.println("a2.retainAll(a1)="+a2.retainAll(a1));
		System.out.println("After retainAll="+a2);
		
			
		System.out.println(a2);
		
		//iterator() :display,accessing individual objects
		
		System.out.println("Using Iterator");
		
		
		Iterator i=a2.iterator();
		/*
		 * System.out.println(i.next()); System.out.println(i.next());
		 * System.out.println(i.next()); System.out.println(i.next());
		 */
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		System.out.println("Using For loop");
		for(int j=0;j<a2.size();j++)
		System.out.println(a2.get(j));
		
		
		
		
		
		
		
	}

}
