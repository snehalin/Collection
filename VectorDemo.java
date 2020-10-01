import java.util.Enumeration;
import java.util.Vector;
//heterogeneous,null allowed,duplications allowed,insertion order preserve
public class VectorDemo {

	public static void main(String[] args) {
	Vector v1=new Vector(15,3);
	System.out.println("Capacity="+v1.capacity());
	v1.add(23);
	v1.addElement(45);
	v1.add(4.6);
	
	v1.add(23);
	v1.addElement(45);
	v1.add(4.6);
	v1.add(23);
	v1.addElement(45);
	v1.add(4.6);
	v1.add(null);
	v1.add(23);
	v1.addElement(45);
	v1.add(4.6);
	v1.add(null);
	v1.add(23);
	v1.addElement(45);
	v1.add(4.6);
	v1.add(null);
	System.out.println("Capacity="+v1.capacity());
	
	v1.add(23);
	v1.add(1);
	System.out.println(v1);
	System.out.println("v1.elementAt(1)="+v1.elementAt(1));
	System.out.println("v1.removeElement(1)="+v1.removeElement(1));
	System.out.println(v1);
	
	System.out.println("_____________________");
	Enumeration e=v1.elements();
	//System.out.println(e.nextElement());
	//System.out.println(e.nextElement());
	while(e.hasMoreElements())
	System.out.println(e.nextElement());
	
	
	
	
	}

}
