import java.util.PriorityQueue;

public class PriorityQueueDemo {
/*homogeneous,null not allowed,duplicates allowed,insertion order not preserve*/
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.add(10);
		//p1.add(2.3);
		p1.add(20);
		p1.add(8);
		p1.offer(9);
		//p1.add(null);
		p1.add(10);
		System.out.println(p1);
		
		System.out.println(p1.poll());//retrives and removes head element
		System.out.println(p1.poll());
		System.out.println(p1);//10,20
		
		
		System.out.println("p1.peek()="+p1.peek());//retrives but does not remove head 
		
		System.out.println(p1);
		System.out.println("p1.element()="+p1.element());
		System.out.println(p1);
		p1.clear();
		System.out.println("p1.element()="+p1.element());
		//System.out.println("p1.peek()="+p1.peek());
		
		
		
		
		
	}

}
