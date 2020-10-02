
public class Employee {
String name;
double Salary;
public Employee(String name, double salary) {
	super();
	this.name = name;
	Salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", Salary=" + Salary + "]";
}

}
