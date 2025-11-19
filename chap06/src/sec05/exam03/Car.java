package sec05.exam03;

public class Car {
	// 인스턴스 필드
	int speed;
	
	// 인스턴스 메소드
	void run() {
		System.out.println(speed + "(km/h)로 달립니다.");
	}
	
	// 정적 메소드
	static void test() {
		// 정적 메소드에서는 인스턴스 멤버(필드, 메소드), this 키워드 사용 불가
//		speed = 60;
//		run();
		
		// 정적 메소드에서 인스턴스 멤버를 사용하려는 경우
		// 객체를 먼저 생성하고 참조 변수로 접근하면 가능은 함
		// 하지만 권장하지 않음
		// 이유는 왜 굳이 정적 메소드에서 객체를 만들어서 인스턴스 멤버를 쓰는가?
		// 이미 인스턴스 멤버를 사용해야 한다면, 그냥 인스턴스 메소드로 만드는 것이 자연스럽고 명확함
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
	
	public static void main(String[] args) {
		// 당연히 정적 메소드안에서 정적 멤버 사용 가능
		test();
	}
	
}
