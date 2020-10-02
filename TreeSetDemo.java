import java.util.ArrayList;
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
		
		
		TreeSet t1=new TreeSet();
		t1.add(20);
		t1.add(80);
		t1.add(40);
		t1.add(11);
		t1.add(45);
		System.out.println(t1);
		System.out.println("t1.higher(40)="+t1.higher(40));//>40
		System.out.println("t1.higher(80)="+t1.higher(80));
		System.out.println("t1.floor(11)="+t1.floor(11));//11<=
		System.out.println("t1.floor(13)="+t1.floor(13));
		System.out.println("t1.ceiling(11)="+t1.ceiling(11));
		System.out.println("t1.ceiling(12)="+t1.ceiling(12));
		System.out.println("t1.first()="+t1.first());
		System.out.println("t1.lower(15)="+t1.lower(15));
		System.out.println("t1.lower(20)="+t1.lower(20));//20 <
		System.out.println("t1.lower(40)="+t1.lower(40));
		
		
  ArrayList a1=new ArrayList();
  a1.add(t1);
  a1.addAll(t1);
	System.out.println(a1);	
		t1.add(10);
		t1.add(9);
	System.out.println("t1.headSet(20)="+t1.headSet(20));
	System.out.println("t1.tailSet(20)="+t1.tailSet(20));
		System.out.println(t1);
		java.util.NavigableSet n= t1.descendingSet();
		System.out.println(n);
		
		
	}
	
	
	

}
