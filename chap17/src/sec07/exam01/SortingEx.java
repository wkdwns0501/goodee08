package sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingEx {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("김재현", 10));
        studentList.add(new Student("유재석", 20));
        
        // 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        studentList.stream()
            .sorted() // 최종 처리가 없으면 중간 처리는 동작하지 않음
            .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
            // 최종 처리 후 실행 했을 때
            // 매개변수가 없는 sorted()는 객체에 Comparable이 구현되어 있지 않으면 예외 발생
        
        System.out.println();
        
        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream()
            // 정렬 기준이 Comparable로 정의되어 있어야만 reverseOrder() 사용 가능 (정렬 기준 뒤집기)
            .sorted(Comparator.reverseOrder())  
            .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
        
    }
}
