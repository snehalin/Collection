import java.util.Enumeration;
import java.util.Vector;

//Legacy class developed in java 1.0  version.
//methods are synchronized
//Thread safe
//It is heterogeneous,duplication allowed,isertion order is preserve,
//null is allowed,based on Dynamic Array datastructure,
public class VectorDEmo {

	public static void main(String[] args) {
		
     Vector v1=new Vector();
     v1.addElement(8);
     v1.addElement(8);
     v1.addElement(5);
     v1.addElement(null);
     v1.add("pune");
     v1.add('k');
     System.out.println(v1); 
     v1.remove("pune");
     System.out.println(v1);
     
     //Enumeration
    Enumeration e= v1.elements();
    while(e.hasMoreElements())
    {
    	System.out.println(e.nextElement());
    }
     
     
	}

}
