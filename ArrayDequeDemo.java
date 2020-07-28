import java.util.ArrayDeque;

public class ArrayDequeDemo {
/*Heterogeneous,null not allowed,duplicates allowed,insertion order preserve*/
	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		a1.add(10);
		a1.add(2.3);
		//a1.add(null);
		a1.add(10);
		a1.add(8);
		System.out.println(a1);
		System.out.println("a1.poll()="+a1.poll());//retrives and removes head element
	//	System.out.println(a1.poll());
		System.out.println(a1);
		
		System.out.println("a1.peek()"+a1.peek());
		System.out.println(a1);
	}

}
