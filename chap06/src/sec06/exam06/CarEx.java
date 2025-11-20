package sec06.exam06;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
//		System.out.println(myCar.speed); // 외부에서는 private 에 접근 불가
		
		// 잘못된 속도 변경 -> setter 메소드에 유효성 검사 추가
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		// 멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
