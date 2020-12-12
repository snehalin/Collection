import java.util.PriorityQueue;
//Homogeneous,isertion order not preserve elements displays sorted order,
	//duplications allowed,null not allowed
//smallest element first removes
public class PriorityQue {

	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.add(10);
		p1.add(20);
		p1.add(2);
		p1.add(10);
		//p1.add(null);
		System.out.println(p1);
		System.out.println(p1.remove());
		System.out.println(p1.remove());
		System.out.println(p1);
	}

}
