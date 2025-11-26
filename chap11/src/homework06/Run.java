package homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요: ");
		String input = sc.nextLine().trim();
        String[] words = sentence.split(" ");

        int index = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(input)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("존재하지 않는 단어입니다.");
            return;
        }
        if (index == words.length - 1) {
            System.out.println("마지막 단어입니다.");
        } else {
            System.out.println(input + " 다음 단어: " + words[index + 1]);
        }
		
	}
}
