import java.util.Stack;

public class StackDemo {
//LIFO manner
//herogeneous,null allowed,insertion order preserv	
	
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(23);
		s1.push("hii");
		s1.push(2.6);
		s1.push(null);
		s1.push(23);
		s1.push(40);
		System.out.println(s1);
		System.out.println("s1.pop()="+s1.pop());
		System.out.println(s1);
		System.out.println("s1.size()="+s1.size());//5
		
		/*
		 * for(int i=1;i<=s1.size();i++) { System.out.println("s1.pop()="+s1.pop()); }
		 */
		int c=0;
		int s=s1.size();
		for(int i=1;i<=s;i++)
		{c++;
			System.out.println("s1.pop()="+s1.pop());
		}
		System.out.println("c="+c);
		
		s1.push(34);//0
		s1.push(3);//1
		s1.push(4);//2
		s1.push(3.4);//3
		s1.push(34.9);//4
		
		System.out.println("s1.peek()"+s1.peek());//retrive last obj
		
		System.out.println(s1);
		System.out.println("s1.search(340)="+s1.search(340));
		System.out.println("s1.search(34)="+s1.search(34));
		System.out.println("s1.search(3)="+s1.search(3));//dist=4 frm top of the stack
	}
	
	
	

}
