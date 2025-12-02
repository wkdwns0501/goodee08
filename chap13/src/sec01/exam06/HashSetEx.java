package sec01.exam06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일한 경우
		// 객체의 hashCode()와 equals()를 기준으로 동등성 판단
		set.add(new Member("이름1", 30));
		set.add(new Member("이름1", 30)); // 논리적 동등 객체 (중복 저장X)
		
		set.remove(new Member("이름1", 30)); // 재정의 되어있지 않다면 삭제도 X
		
		System.out.println(set);
		
		// 이 외에도 동등 객체로 판단하는 많은 메소드들이 제대로 동작하려면 재정의 필수
		
		// 요소 정렬
		// Member처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야함
		// => Member 클래스가 Comparable 인터페이스를 구현
		// => Comparator 인터페이스를 구현해서 다양한 정렬 기준을 제공
		
		// Comparable 방법
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김재현", 30));
		members.add(new Member("이수진", 25));
		members.add(new Member("박민수", 40));
		
		List<Member> memberList = new ArrayList<Member>(members);
		Collections.sort(memberList);
		
		// (참고) Comparator + 람다식 사용 방법
//		memberList.sort((o1, o2) -> o1.getAge() - o2.getAge()); // 나이 오름차순
		memberList.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); // 이름 오름차순
		
		for (Member member : memberList) {
			System.out.println(member);
		}
		System.out.println();
		
		// 다시 Set으로 변환 (순서를 유지하려면 LinkedHashSet으로)
		Set<Member> sortedSet = new LinkedHashSet<Member>(memberList);
		for (Member member : sortedSet) {
			System.out.println(member);
		}
		System.out.println();
		
		// ArrayList의 요소에서 중복 제거하기
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("김재현", 30));
		memList.add(new Member("이수진", 25));
		memList.add(new Member("박민수", 40));
		memList.add(new Member("김재현", 30)); // 중복
		memList.add(new Member("이수진", 25)); // 중복
		
		Set<Member> memSet = new HashSet<Member>(memList);
		List<Member> dedupList = new ArrayList<Member>(memSet);
		
		for (Member member : dedupList) {
			System.out.println(member);
		}
		
	}
}
