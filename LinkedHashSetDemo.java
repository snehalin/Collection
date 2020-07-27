import java.util.LinkedHashSet;

/*1.Heterogeneous
2.null allowed
3.Insertion Order  Preserve
4.duplicate objects not allowed,add() return false
5.Default capacity 16,load factor 0.75*/
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
			l1.add(12);
			l1.add(34);
			l1.add(19);
			l1.add("k");
			l1.add(null);
			l1.add(12);
			System.out.println(l1);
	}

}
