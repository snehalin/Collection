import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIstDemo {
/*
 1.Heterogeneous,homogeneous
 2.null allowed
 3.insertion order preserve
 4.doubly linked list
 5.If Frequent operation is insertion/deletion
 */
	public static void main(String[] args) {
	//LinkedList<String> l1=new LinkedList<String>();
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add('h');
		l1.add("Hii");
		l1.add(2,null);
		l1.offer(2.3);
		l1.offerFirst(70.9f);
		l1.add(10);
		System.out.println(l1);
		System.out.println("l1.remove()="+l1.remove());//First obj removes
		System.out.println(l1);
		//l1.clear();
		//System.out.println("l1.element()="+l1.element());//execption
		//System.out.println(l1);
		
		System.out.println("l1.peek()="+l1.peek());//null
		System.out.println(l1);
		
		System.out.println("l1.getFirst()="+l1.getFirst());
		System.out.println("l1.getLast()="+l1.getLast());
		System.out.println(l1);
	
		ArrayList a1=new ArrayList();
		System.out.println("Size="+a1.size());
		a1.add("hi");
		a1.add(10);
		a1.add(1.2f);
		a1.add(1,'c');
		
		
		
		l1.addAll(a1);
		System.out.println("AddAll()="+l1);
		
		l1.add(a1);
		System.out.println("Add()="+l1);
		
		
		l1.clear();
		//System.out.println("l1.remove()="+l1.remove());
		//System.out.println(l1);
		System.out.println("l1.poll()="+l1.poll());
		System.out.println(l1);
		l1.clear();
		l1.add(3);
		l1.add(8);//add last
		l1.push(100);//addFirst
		l1.add("hii");
		System.out.println(l1);
		
		Object a[]=l1.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(20);
		l2.add(80);
		l2.add(1);
		l2.add(8);
	//Integer a2[]=(Integer[])l2.toArray();// ClassCastException
		Object a2[]=l2.toArray();
		System.out.println("Using to Array");
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]);
		}
		System.out.println("____________");
		System.out.println("using Iterator");
		Iterator i=l2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("____________");
		System.out.println("using for each loop");
		for( Object x:a2)//foreach loop
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
