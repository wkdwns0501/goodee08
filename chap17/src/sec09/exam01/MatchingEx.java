package sec09.exam01;

import java.util.Arrays;

public class MatchingEx {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};
        
        boolean result = Arrays.stream(intArr)
                        // 모든 요소에 대한 람다식이 true를 리턴하면 최종 결과 true를 리턴
                            .allMatch(value -> value % 2 == 0); 
        System.out.println("모두 2의 배수인가? " + result);
        
        result = Arrays.stream(intArr)
                        // 하나라도 만족하는 요소가 있으면 최종 결과 true를 리턴
                            .anyMatch(value -> value % 3 == 0);
        System.out.println("하나라도 3의 배수가 있는가? " + result);
        
        result = Arrays.stream(intArr)
                        // 모두 만족하지 않아야(=전부 false를 리턴해야) 최종 결과 true를 리턴
                        .noneMatch(value -> value % 3 == 0);
        System.out.println("3의 배수가 없는가? " + result);
    }
}
