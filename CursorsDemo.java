import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo {
//Used to traverse elements of Collection
	/*1.Iterable--Iterator (Universal cursor)
	2.ListIterator 1.2
	3.Enumeration -1.0 legacy
	4.Spliterator -1.8*/
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add("hi");
		a1.add(10);
		a1.add(1.2f);
		a1.add(1,'c');

		System.out.println("Using Iterator");
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("Using ListIterator in forword");
		ListIterator li=a1.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		//System.out.println("li.preveous="+li.previous());
		//System.out.println("li.preveous="+li.previous());
		System.out.println("Backword direction\n");
		
		while(li.hasPrevious())
		{
			System.out.println("li.preveous="+li.previous());
		}
		
		ListIterator li2=a1.listIterator(2);		
		System.out.println("_________________");
		System.out.println("li.preveous="+li2.previous());
		System.out.println("li.preveous="+li2.previous());
		System.out.println("li.preveous="+li2.next());
		
		
		Vector v1=new Vector();
		v1.addElement(12);
		v1.add(5);
		v1.add(null);
		v1.add(56);
		v1.addAll(a1);
		
		Enumeration e=v1.elements();
		System.out.println("-----------------");
		System.out.println("Using Enumeration");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
