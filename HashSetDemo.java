import java.util.HashSet;

public class HashSetDemo {
/*1.Heterogeneous
 2.null allowed
 3.Insertion Order not Preserve
 4.duplicate objects not allowed,add() return false
 5.Default capacity 16,load factor 0.75
 */
	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add(10);
		s1.add(2.3);
		s1.add(null);
		s1.add("hii");
		System.out.println("s1.add(10)="+s1.add(10));	
			
		System.out.println("s1.add(1.2)="+s1.add(1.2));
		
		HashSet s2=new HashSet(5);
		
		s2.add(1);
		s2.add(4);
		
		
		HashSet s3=new HashSet(20,0.90f);//sets capacity and loadfactor
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
