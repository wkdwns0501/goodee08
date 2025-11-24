package sec01.exam00;

public interface Connection {
	// interface : 점접, 창구(통로)
	
	// 필드 (상수)
	// public static final을 명시적으로 붙여도 되지만 interface는 보통 쓰지 않음.
	// 타입 상수이름 = 값; 
	
	// 추상 메소드
	// public abstract를 명시적으로 붙여도 되지만 interface는 보통 쓰지 않음.
	void connect(); 
	void execute(String sql);
}
