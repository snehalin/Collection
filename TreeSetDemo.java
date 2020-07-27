import java.util.TreeSet;
/*Homogeneous,null not allowed,duplication not allowed
 Insertion order not preserve,elements displays in ascending order*/
public class TreeSetDemo {
	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(9);
		t1.add(6);
		t1.add(7);
		t1.add(5);
		//	t1.add(null);
		System.out.println(t1);
		
		System.out.println(t1.first());//smallest
		System.out.println(t1.ceiling(5));//6
		System.out.println(t1.ceiling(6));
		System.out.println(t1.ceiling(11));//null
		System.out.println(t1.floor(8));//7
		System.out.println(t1.floor(6));//6
		System.out.println(t1.floor(4));
		
	}
}
