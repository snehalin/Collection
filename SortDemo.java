import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		/*
		 * a1.add(10.2); a1.add(10.0); a1.add(1.0); a1.add(5.0);
		 */
		a1.add(new Employee(109,"xyz",40000));
		a1.add(new Employee(101,"yxz",10000));
		a1.add(new Employee(103,"ayz",50000));
		a1.add(new Employee(105,"hxyz",240000));
		a1.add(new Employee(107,"xjyz",80000));
		
		Collections.sort(a1);
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	}

}
