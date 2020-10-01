import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
//homogeneous,null not allowed,duplications not allowed,insertion order not preserve
	//elements display in ascending order
	public static void main(String[] args) {
		TreeSet h1=new TreeSet();
	h1.add("xyz");
		h1.add("ab");
	h1.add("pqr");
	
		//h1.add(null);
		System.out.println(h1);
	}

}
