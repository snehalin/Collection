import java.util.ArrayDeque;
import java.util.PriorityQueue;
//Heterogeneous,isertion order  preserve,
	//duplications allowed,null not allowed
//first element first removes
public class ArrayDeqDEmo {

	public static void main(String[] args) {
		ArrayDeque p1=new ArrayDeque();
		//System.out.println(p1.removeLast()); Exception
		System.out.println(p1.pollLast());//null
		p1.add(10);
		p1.add(20);
		p1.add(2);
		p1.add(10);
		p1.add(1.3);
		p1.add("hi");
		
		//p1.add(null);
		System.out.println(p1);
		System.out.println(p1.removeLastOccurrence(10));//
		
		System.out.println(p1);
	}

}
