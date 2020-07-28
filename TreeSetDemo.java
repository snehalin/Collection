import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*Homogeneous,null not allowed,duplication not allowed
 Insertion order not preserve,elements displays in ascending order*/
public class TreeSetDemo {
	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(9);
		t1.add(6);
		t1.add(7);
		t1.add(5);
		
		//t1.add("hii");
			//t1.add(null);
		System.out.println(t1);
		
		System.out.println("first()="+t1.first());//smallest//5
		System.out.println("t1.ceiling="+t1.ceiling(8));//9
		System.out.println(t1.ceiling(6));//6
		System.out.println(t1.ceiling(11));//null >=
		System.out.println(t1.floor(8));//7   <=
		System.out.println(t1.floor(6));//6
		System.out.println(t1.floor(4));//null
		
		System.out.println("t1.higher(6)="+t1.higher(6));//7  >
		System.out.println("t1.higher(8)="+t1.higher(8));
		System.out.println("t1.lower(6)="+t1.lower(6)); // <
		System.out.println("t1.lower(4)="+t1.lower(4));//null
		
		
		System.out.println("----Using descIterator----");
		
		Iterator i=t1.descendingIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		ArrayList a1=new ArrayList(t1);
		
		TreeSet t2=new TreeSet(a1);
	}
}
