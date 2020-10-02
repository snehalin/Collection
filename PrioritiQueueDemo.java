import java.util.PriorityQueue;

public class PrioritiQueueDemo {
//homogeneous,null not allowed,insertion order is not preserve,
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		 // System.out.println("p1.poll()="+p1.poll());
     // System.out.println("p1.remove()="+p1.remove());
		p1.add(12); 
		p1.add(10);
         p1.add(20);
      //   p1.add(2.3);
         p1.add(20);
         p1.add(100);
         p1.add(21);
        // p1.add(null);
         System.out.println(p1);
        System.out.println("p1.remove()="+p1.remove());
        System.out.println("p1.poll()="+p1.poll());
         System.out.println(p1);
         System.out.println("p1.peek()="+p1.peek());  
         System.out.println("p1.peek()="+p1.peek());  
         System.out.println(p1);
	}

}
