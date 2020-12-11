import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
//It is heterogeneous,duplication allowed,isertion order is preserve,
//null is allowed,based on Dynamic Array datastructure,
	//If frequent operation retrival of element
	
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		System.out.println(l1.isEmpty());
		l1.add(13); //Integer i =new Integer(13); l1.add(i); autoboxing
		
		l1.add("hello");
		l1.add(1.2f);
		l1.add('s');
		l1.add(13);
		l1.add(null);
		
		l1.add(2,'j');
		ArrayList l2=new ArrayList();
		l2.addAll(l1);
		System.out.println(l2);
		l2.add("hefshine");
		l2.add(100);
		System.out.println(l2);
		l2.retainAll(l1);
		System.out.println(l2);
		
		System.out.println("l2.get(3)="+l2.get(3));
		l2.set(4,"pune");
		System.out.println(l2);
		System.out.println("-------Forloop----------------");
		for(int i=0;i<l2.size();i++)
			System.out.println(l2.get(i));
	
		System.out.println("-------Iterator----------------");
		
		Iterator j=l2.iterator();
		while(j.hasNext())
		{
		System.out.println(j.next());
		}
		
		
		
		
/*	boolean b=l2.contains(13);
	System.out.println(b);
	
	System.out.println("l2.indexOf(1.2f)="+l2.indexOf(1.2f));
	System.out.println("l2.lastIndexOf(13)="+l2.lastIndexOf(13));
	
	Object ob[]=l2.toArray();
	
	for(int i=0;i<ob.length;i++)
	{
		System.out.print(ob[i]+" ");
	}
	
	//l2.remove(10); Exception*/
	
	}

}
