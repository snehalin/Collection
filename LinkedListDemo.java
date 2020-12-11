import java.util.Iterator;
import java.util.LinkedList;
//It is heterogeneous,duplication allowed,isertion order is not preserve,
//null is allowed,based on doubly LinkedList datastructure,
	//If frequent operation insertion/deletion of element
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		System.out.println("l1.poll()="+l1.poll());
		//System.out.println("l1.pop()="+l1.pop());
		System.out.println(l1);
		l1.add(10);
		l1.offer(90);
		l1.push(67);
		
		l1.add(null);
		l1.add(1,98);
		l1.add("hello");
		l1.add(8.9);
		l1.add('c');
		l1.addFirst(8);
		System.out.println(l1);
		System.out.println("l1.pop()="+l1.pop());
		System.out.println("l1.pop()="+l1.pop());
		System.out.println(l1);
		System.out.println("l1.peek()="+l1.peek());
		System.out.println("l1.peek()="+l1.peek());
		System.out.println(l1);
		System.out.println("l1.poll()="+l1.poll());
		System.out.println(l1);
		
		
		System.out.println("-------Forloop----------------");
		for(int i=0;i<l1.size();i++)
			System.out.println(l1.get(i));
	
		System.out.println("-------Iterator----------------");
		
		Iterator j=l1.iterator();//Cursor-->Traversing ,,Universal
		while(j.hasNext())
		{
		System.out.println(j.next());
		}
	}

}
