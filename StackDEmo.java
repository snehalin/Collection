import java.util.Stack;

public class StackDEmo {
//LIFO
	public static void main(String[] args) {
		
		Stack s1=new Stack();//LinkedList
		s1.push(30);
		s1.push(32);
		s1.push("hii");
		s1.push(3.2);
		s1.push(null);
		System.out.println(s1);
		//System.out.println(s1.peek());
		//System.out.println(s1.peek());
		//System.out.println(s1.peek());
		
		System.out.println("s1.search(hii)="+s1.search("hii"));
		System.out.println(s1);
	}

}
