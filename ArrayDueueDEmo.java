import java.util.ArrayDeque;

public class ArrayDueueDEmo {
//heterogeneous,null not allowed,duplicates allowed,insertion order preserved
	public static void main(String[] args) {
	ArrayDeque a1=new ArrayDeque();
	a1.add(10);
	a1.add(1.2);
	a1.offer('c');
	a1.offer("hii");
	a1.add(10);
	a1.add(1.2);
	a1.add(10);
	//a1.add(null);
	System.out.println(a1);
	System.out.println("a1.poll()="+a1.poll());
	System.out.println("a1.poll()="+a1.poll());
	System.out.println(a1);
	}

}
