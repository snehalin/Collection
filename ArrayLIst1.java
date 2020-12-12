import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIst1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(4);
		a.add(50);
		a.add(11);
		a.add(13);
		a.add(9);
		System.out.println("Before:"+a);
		Collections.sort(a);
		System.out.println("After:"+a);
		
		
		
		
		ArrayList a2=new ArrayList();
		a2.add(new Employee(1,"xyz",1000));
		a2.add(new Employee(4,"pqr",4000));
		a2.add(new Employee(2,"abc",3000));
		a2.add(new Employee(5,"lmn",10000));
		a2.add(new Employee(6,"ijk",1000));
	//	System.out.println("Using Comparable");
		//System.out.println("Before:"+a2);
	      // Collections.sort(a2);
	       
	      System.out.println("-------------------------------");
	     
	      System.out.println("Before sorting:"+a2);
	     
	      System.out.println("Using Comparator");
		
	      Collections.sort(a2,new NameComparator());
	      System.out.println("Acc. to name After sorting:"+a2);
		
		 Collections.sort(a2,new IdComparator());
			System.out.println("Acc. to id After sorting:"+a2);
			
			 Collections.sort(a2,new SalaryComparator());
		  System.out.println("Acc. to salary After sorting in descending:"+a2);
		
		
	
	}

}
