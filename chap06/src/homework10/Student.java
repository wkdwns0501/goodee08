package homework10;

public class Student {
	static int nextStudentNo = 1;
	int studentNo;
	String name;
	String className;
	
	public Student() {
		this.studentNo = nextStudentNo;
        nextStudentNo++; 
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
