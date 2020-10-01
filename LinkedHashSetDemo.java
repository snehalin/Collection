import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	//Heterogeneous,duplications not allowed,null allowed,insertion order
	public static void main(String[] args) {
		LinkedHashSet h1=new LinkedHashSet();
		System.out.println("h1.add(20)="+h1.add(20));
		System.out.println("h1.add(6.0)="+h1.add(6.0));
		System.out.println("h1.add(20)="+h1.add(20));
		h1.add("hello");
		h1.add(null);
		System.out.println(h1);

	}

}
