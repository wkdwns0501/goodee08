package homework01;

public class Employee {
	public String name;
	public String team;
	String job;
	int salary;
	private int bonus;
	
	public Employee(String name, String team, String job, int salary, int bonus) {
		this.name = name;
		this.team = team;
		this.job = job;
		this.salary = salary;
		this.bonus = bonus;
	}

	public void printNameAndTeam() {
		System.out.println(this.name + ", " + this.team);
	}
	
}
