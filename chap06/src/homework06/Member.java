package homework06;

public class Member {
	String memberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	public Member() {
		
	}
	
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	
	public void printName() {
		System.out.println("이름 : " + this.memberName);
	}
	
	
}
