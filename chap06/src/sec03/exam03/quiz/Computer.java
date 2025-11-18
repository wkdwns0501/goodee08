package sec03.exam03.quiz;

public class Computer {
	// 필드
	String model;
	
	// 매개변수가 없는 생성자
	public Computer() {
		System.out.println("객체생성완료(모델: "+ this.model +")");
	}
	
	// 모델명을 받는 생성자
	public Computer(String model) {
		this.model = model;
		System.out.println("객체생성완료(모델: "+ this.model +")");
	}
}
