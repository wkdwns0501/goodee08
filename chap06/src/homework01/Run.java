package homework01;

public class Run {
	public static void main(String[] args) {
		Employee employee1 = new Employee("김철수", "교육운영팀", "직무1", 1, 1);
		Employee employee2 = new Employee("이영희", "경영지원팀", "직무2", 2, 2);
		
		employee1.printNameAndTeam();
		employee2.printNameAndTeam();
	}
}
