package sec06.exam06;

public class Car {
	// 필드
	// 특별한 이유가 없다면 모든 필드는 기본적으로 private 선언
	private int speed;
	private boolean stop;
	
	// 메소드
	// 가장 일반적인 getter 메소드
	public int getSpeed() { // 만약 getter만 존재하면 읽기 전용 필드
		return speed;
	}
	
	// 가장 일반적인 setter 메소드
	public void setSpeed(int speed) {
		// 유효성 검사 추가
		if (speed < 0) {
			this.speed = 0;
			return; // return을 빼던가
		} else {	// else를 빼던가  둘중 하나만 
			this.speed = speed;
		}
	}
	
	// Quiz: stop의 Getter/Setter 만들기 (자동 완성 기능 있음)
	// boolean 타입일때는 보틍 is필드명으로 getter 메소드명을 짓는다.
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop) {
			speed = 0;
		}
	}
	
	// 정리:
	// 캡슐화는 필드를 숨기고(private)
	// 접근자 메소드(getter/setter)를 제공하여
    // 객체 내부 데이터의 무분별한 접근을 막는 방식
	
	// 중요 - 객체지향 4대 특징(캡슐화, 상속, 다형성, 추상화)
	// 캡슐화는 약(캡슐)처럼 속은 보이지 않고, 껍데기만 보이게 만드는 것
	// 약(객체) 속에는 여러 성분(데이터와 로직)이 있지만, 우리는 그냥 캡슐을 먹기만 함
	// 자바에서도 객체 속 내용(필드)을 직접 건드리지 않고, 정해진 방법(제공된 메소드)으로만 사용
	
}
