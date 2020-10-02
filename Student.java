//
public class Student implements Comparable<Student>{
int rollno;
String name;
double per;
public Student(int rollno, String name, double per) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.per = per;
}
@Override
public String toString() {
	return "\nrollno=" + rollno + ", name=" + name + ", per=" + per +"\n";
}

public int compareTo(Student o2)
{/*
	if(this.rollno>o2.rollno)
		return 1;
	if(this.rollno<o2.rollno)
		return -1;
	else 
		return 0;
	
	if(this.per<o2.per)
		return 1;
	if(this.per>o2.per)
		return -1;
	else 
		return 0;
	*/
	return this.name.compareTo(o2.name);
	
	
	
}

}
