package homework01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Student[] student = new Student[3];
		Student student1 = new Student("김철수", 20, 178.2, 70.0, 1,"정보시스템공학과");
		student[0] = student1;
		Student student2 = new Student("이영희", 23, 167.0, 54.0, 4,"물리학과");
		student[1] = student2;
		Student student3 = new Student("홍길동", 21, 197.6, 86.0, 2,"경영학과");
		student[2] = student3;
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}
		
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[10];
		int count = 0;
		while (true) {
			System.out.println("=== 사원 입력받기 ===");
			System.out.print("이름 입력: ");
			String name = sc.nextLine();
			System.out.print("나이 입력: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("키 입력: ");
			double height = sc.nextDouble();
			System.out.print("몸무게 입력: ");
			double weight = sc.nextDouble();
			System.out.print("급여 입력: ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 입력: ");
			String dept = sc.nextLine();
			Employee employee = new Employee(name, age, height, weight, salary, dept);
			employees[count] = employee;
			count++;
			System.out.print("계속 추가 하시겠습니까? : ");
			String yn = sc.nextLine();
			if ("n".equalsIgnoreCase(yn)) break;
			else if ("y".equalsIgnoreCase(yn)) continue;
		}
		for (int i = 0; i < count; i++) {
			System.out.println(employees[i].toString());
		}
		sc.close();
	}
}
