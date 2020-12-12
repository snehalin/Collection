
public class Employee implements Comparable<Employee>{
int id;
String name;
double salary;
public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
	return "\n [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

@Override
public int compareTo(Employee e2) {
	//logic to compare attribute
	/*if(this.id==e2.id)
		return 0;
	if(this.id>e2.id)
		return 1;
	else
		return -1;*/
	/*if(this.salary==e2.salary)
		return 0;
	if(this.salary>e2.salary)
		return 1;
	else
		return -1;*/
	
	return this.name.compareTo(e2.name);
	
}

}
