package sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingEx {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("김재현", 10));
        studentList.add(new Student("유재석", 20));
        
        // 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        studentList.stream()
            .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
            .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
        
        System.out.println();
        
        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream()
            .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))  
            .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
        
    }
}
