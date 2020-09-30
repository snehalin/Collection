import java.util.Iterator;
import java.util.LinkedList;
//Heterogeneous
//duplication allowed
//Insertion order preserved
//null value allowed
//Frequent operation Insertion and Deletion
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		//System.out.println("l1.pop()="+l1.pop());
		l1.add(1.2);
		l1.add(null);
		l1.add(1.2);
		l1.add("hii");
		l1.add(1,30);
		System.out.println(l1);
		l1.addFirst(32);
		System.out.println(l1);
		System.out.println("l1.pop()="+l1.pop());//removes first element
		System.out.println(l1);
		System.out.println("l1.peek()="+l1.peek());//retrive first element but does nt remove
		System.out.println(l1);
		l1.push(23);
		l1.push(78);
		System.out.println(l1);
		l1.offer(67);
		l1.offer(90);
		System.out.println(l1);
		System.out.println("_____________________");
	Iterator i	=l1.iterator();
	while(i.hasNext())
	{
	System.out.println(i.next());
	}
		
		
		
		
		
		
		
		
		
		
	}

}
