import java.util.HashSet;

public class HashSetDemo {
	
	//Heterogeneous,duplications not allowed,null allowed,insertion order not preserve
	
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		System.out.println("h1.add(20)="+h1.add(20));
		System.out.println("h1.add(6.0)="+h1.add(6.0));
		System.out.println("h1.add(20)="+h1.add(20));
		h1.add("hello");
		h1.add(null);
		System.out.println(h1);
		
		HashSet <Integer>h2=new <Integer>HashSet();
		//h2.add("hii");
		h2.add(60);
		h2.add(9);
		h2.add(80);
		
		Object a[]=h2.toArray();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
}
}
