package homework02;

public class Run {
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", "주소1", "01012345678", 190.5, 100.2);
		Person person2 = new Person("김사부", "주소2", "01056434563", 175.4, 65.6);
		
		person1.printCallNumAndHAndW();
		person2.printCallNumAndHAndW();
	}
}
