import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//Heterogeneous
//duplication allowed
//Insertion order preserved
//null value allowed
//based on Array datastructure
//Frequent operation access and retrive
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();//16 
		
        boolean b=a1.isEmpty();
        System.out.println("b="+b);
        a1.add(10);// Integer i=new Integer(10); a1.add(i);
        a1.add(1.2f);
        a1.add("Hello");
        a1.add(10);
        a1.add(null);
        a1.add(1.2f);
        a1.add(3,"hii");
        a1.add(1);
    ////    a1.capacity();
       System.out.println("a1.remove(1)="+a1.remove("Hello"));
        System.out.println(a1);
        Collections.shuffle(a1);
        System.out.println("After Shuffle:\n"+a1);
        System.out.println("Size="+a1.size());
       System.out.println("a1.contains(Hello)="+a1.contains("Hello"));
       System.out.println("a1.contains(10)="+a1.contains(10));
       System.out.println("a1.LastindexOf(1.2f)="+a1.lastIndexOf(1.2f));
       
       System.out.println("a1.get(2)"+a1.get(2));
       System.out.println("a1.set(2)"+a1.set(2,"hii"));
       System.out.println(a1);
       
       
       for(int i=0;i<a1.size();i++)
       {
    	   System.out.println(a1.get(i));
    	   
       }
       
       
       ArrayList a2=new ArrayList(20);
       a2.add(3.4);
       a2.add("bye");
       a2.addAll(a1);
       
       System.out.println("a2 elements");
       for(int i=0;i<a2.size();i++)
       {
    	   System.out.println(a2.get(i));
    	   
       }
       System.out.println("a2.removeAll(a1)="+a2.removeAll(a1));
      // System.out.println("a2.retainAll(a1)="+a2.retainAll(a1));
       System.out.println(a2);
       
       ArrayList <Integer> a3=new <Integer>ArrayList();
       
      // a3.add(1.2f);
      System.out.println("___________________________"); 
       Iterator i	=a1.iterator();
   	while(i.hasNext())
   	{
   	System.out.println(i.next());
   	}
       
       
       
       
       
	}

}
