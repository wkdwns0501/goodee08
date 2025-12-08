package sec05.exam03;

public class ConstructorReferenceEx {
	public static void main(String[] args) {
		Person person = new Person();
		
//		Member m1 = person.getMember1(id -> new Member(id));
		// 생성자 참조로 축약
		Member m1 = person.getMember1(Member::new);
		System.out.println(m1);
		
		System.out.println("------------------------------------------");
		
//		Member m2 = person.getMember2((id, name) -> new Member(id, name));
		Member m2 = person.getMember2(Member::new);
		System.out.println(m2);
		
		// 생성자 참조는 두 가지 방법 모두 동일하지만,
		// 함수형 인터페이스의 매개변수에 개수에 따라 실행되는 Member 생성자가 달라짐
		
	}
}
