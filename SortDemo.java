import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		//a1.add(12.5);
		a1.add(12f);
	//	a1.add(12.5f);
		a1.add(11f);
		a1.add(1f);
		a1.add(21f);
		a1.add(41f);
		a1.add(31f);
		
		System.out.println(a1);

		Collections.sort(a1);
		System.out.println("After sort:\n"+a1);
		
		ArrayList a2=new ArrayList();
		a2.add(new Student(1,"xyz",67.9));
		a2.add(new Student(3,"abc",47.9));
		a2.add(new Student(2,"pqr",77.9));
		System.out.println("Before Sorting:"+a2);
		Collections.sort(a2);//CompareTo
		System.out.println("After Sorting:"+a2);
		
		
		ArrayList a3=new ArrayList();
		
		a3.add(new Employee("xyxz",10000));
		a3.add(new Employee("rbc",5000));
		a3.add(new Employee("pqr",20000));
		
		System.out.println("Before Sorting:"+a3);
		Collections.sort(a3,new NameComparator() );
		System.out.println("After Sorting by Name:"+a3);
		
		Collections.sort(a3,new SalaryComparator());
		System.out.println("After Sorting by Salary:"+a3);
		
		
		
		
		/*class Integer implement Comparable
		{
		}
		
		class Float implement Comparable
		{
		}
		*/
		
	}

}
