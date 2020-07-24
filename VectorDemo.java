import java.util.Vector;

// Vector class is equivalent to ArrayList 
/*		Vector              ArrayList
 1.LegacyClass 1.0         1.2  not LegacyClass
 2.Synchronized             NonSynchronized 
 3.ThreadSafe                Not  ThreadSafe
 4.Slow Performance         Faster
 */
/*
1.hetorogeneous,homogeneous
2.null allowed
3.duplicates
4.insertion order is preserved
5.Retrival
 */
public class VectorDemo {

	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println(v1.capacity());
		v1.addElement(10);//exclusive  add
		v1.addElement(10.7);
		v1.add(null);
		v1.add(10);
		System.out.println(v1);
		v1.removeElement(10.7); //remove
		System.out.println(v1);
		v1.removeAllElements(); //clear()
		System.out.println(v1);
		
		
		
		
		
		
		
		

	}

}
