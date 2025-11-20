package homework01;

public class Employee extends Person {
	int salary;
	String dept;
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		setName(name);
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() 
				+ "\n급여 : " + salary 
				+ "\n부서 : " + dept;
	}
	
}
