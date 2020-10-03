import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
//key must be homogeneous,value can be heterogeneous
//null key not allowed,value can be null	
	//duplicate key not allowed but value allowed
	//insertion order not preserve but it displays in ascending order of key
	public static void main(String[] args)
	{
	TreeMap t1=new TreeMap();
	t1.put(13,"hjk");
	t1.put(67,'j');
	t1.put(8,76);
	t1.put(89,null);
	//t1.put(8,76);
	System.out.println(t1);
	
	java.util.SortedMap s=t1.headMap(67);
	System.out.println(s);
	Map.Entry m=t1.firstEntry();
	System.out.println(m.getKey()+" "+m.getValue());
	m=t1.lowerEntry(89);//< 89
	System.out.println(m.getKey()+" "+m.getValue());
	m=t1.floorEntry(89);//<= 89
	System.out.println(m.getKey()+" "+m.getValue());
	//
	//System.out.println();
	
	
	java.util.Set t=t1.descendingKeySet();
	System.out.println(t);
	
	
	TreeMap<Integer,String> t2=new TreeMap<Integer,String>();
	t2.put(7,"hii");
	t2.put(3,"hello");
	TreeMap.Entry k=t2.getLowerEntry(8);
	
	}

}
