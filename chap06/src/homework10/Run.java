package homework10;

public class Run {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setName("김철수");
        s1.setClassName("A");
        s2.setName("홍길동");
        s2.setClassName("F");
        s3.setName("이영희");
        s3.setClassName("B");
        
        System.out.println(s1.getStudentNo() + " " + s1.getName() + " " + s1.getClassName());
        System.out.println(s2.getStudentNo() + " " + s2.getName() + " " + s2.getClassName());
        System.out.println(s3.getStudentNo() + " " + s3.getName() + " " + s3.getClassName());
	}
}
