package coding;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		int[] answer = {1,1,3,3,0,1,1};
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < answer.length; i++) {
			list.add(answer[i]);
		}
		System.out.println(list);
		for (int i = 0; i < list.size()-1; i++) {
			if (answer[i] == answer[i+1]) {
				list.remove(list.get(i+1));
				i++;
			}
		}
        System.out.println(list);
		
	}
}
