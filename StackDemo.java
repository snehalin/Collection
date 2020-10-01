import java.util.Stack;

public class StackDemo {
//heterogeneous,null allowed,duplications allowed,insertion order preserve
	public static void main(String[] args) {
		Stack s1=new Stack();
		//System.out.println("s1.pop="+s1.pop());
		s1.push(20);
		s1.push(2.0);
		s1.push("20");
		s1.push('2');
		s1.push(30);
		s1.push(null);
		System.out.println(s1);
		System.out.println((Integer)s1.get(4)+(Double)s1.get(1));
		System.out.println("s1.pop="+s1.pop());//LIFO
		System.out.println("s1.pop="+s1.pop());//removes topmost element
		System.out.println(s1);
		System.out.println("s1.peek="+s1.peek());//retrives topmost element but does not removes 
		System.out.println("s1.peek="+s1.peek());//
		System.out.println("s1.peek="+s1.peek());
		System.out.println(s1);
		System.out.println("s1.search(\"20\"=)"+s1.search("20"));
		
		
		
	}

}
