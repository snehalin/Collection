import java.util.ArrayList;
import java.util.Iterator;

public class Employee implements Comparable<Employee> {
    int eid;
	String name;
	double salary;
	
	
	@Override
	public int compareTo(Employee e2) {
		
		/*
		 * if(this.eid>e2.eid) return 1; else if(this.eid<e2.eid) return -1; else
		 * 
		 * return 0;
		 */
		
		
		/*
		 * if(this.salary>e2.salary) return -1; else if(this.salary<e2.salary) return 1;
		 * else
		 * 
		 * return 0;
		 */
		
		return (this.name).compareTo(e2.name);
			
		
		
		
		
		
	}
	
	
		public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		

	@Override
		public String toString() {
			return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
		}

	public static void main(String[] args) {
		Employee e1=new Employee(101,"xyz",10000);
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("hii");
		a1.add(e1);
		
		//System.out.println(e1);
      System.out.println(a1);
      
      ArrayList<Employee> a2=new ArrayList<Employee>();
      
      a2.add(e1);
      a2.add(new Employee(102,"pqr",20000));
      a2.add(new Employee(103,"abc",50000));
      a2.add(new Employee(104,"lmn",30000));
      
      System.out.println(a2);
      System.out.println("----Using Iterator------");
      Iterator i=a2.iterator();
      
      while(i.hasNext())
      {
    	//Object o=i.next();
    	//  Employee temp=(Employee)o;
    	Employee temp=(Employee)i.next();
    	if(temp.getSalary()==50000)
    	{
    		temp.setName("Hefshine");
    	}
    	
      }
      System.out.println("--------------");
       Iterator i2=a2.iterator();
      
      while(i2.hasNext())
      {
      System.out.println(i2.next());
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

	

}
