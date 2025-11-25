package homework02;

public class UnSupportedException extends RuntimeException {
	
//	public UnSupportedException() {
//		 super();
//	}
	
	@Override
	public String getMessage() {
		return "원인을 알 수 없는 오류가 발생했습니다.";
	}

}
