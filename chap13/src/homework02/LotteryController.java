package homework02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LotteryController {
	// 추첨 대상을 담을 HashSet 객체 생성(lottery)
	Set<Lottery> lottery = new HashSet<Lottery>();
	// 당첨 대상을 담을 HashSet 객체 생성(win)
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		// 1. 전달 받은 l을 lottry HashSet에 추가
		// 2. 추가 결과를 boolean 값으로 반환
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		// 1. 전달 받은 l을 lottery에서 삭제
		// 2. 당첨자 목록 win중에 삭제된 추첨 대상자가 존재할 수 있으므로
		// 삭제 결과인 boolean 값이 true이고 win 객체가 null이 아니면 
		// win에서도 해당 추첨 대상자 삭제
		boolean result = lottery.remove(l);
		if (result && win.contains(l)) {
			win.remove(l);
		}
		return result;
	}
	
	public Set<Lottery> searchObject(){
		// lottery를 리턴
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		// 1. 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// -> 당첨 목록을 찾기 전에 추첨 대상의 수가 4보다 큰지 먼저 확인
		// -> lottery의 크기가 4보다 작은 경우 null 리턴
		if (lottery.size() < 4) {
			return null;
		}
		List<Lottery> removeList = new ArrayList<>();
		for (Lottery w : win) {
		    if (!lottery.contains(w)) { 
		        removeList.add(w); 
		    }
		}
		for (Lottery r : removeList) {
		    win.remove(r);
		}
		// 2. 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고
		// 인덱스를 이용해 win에 당첨자 저장
		// 이때, 당첨자 수는 무조건 4명 이를 위한 추첨자 수는 4명 이상
		// 만일 추첨 대상 삭제로 인해 당첨자 목록에서 삭제된 추첨 대상자가 있다면
		// 삭제된 사람의 자리만큼 새로운 추첨자로 채우기
		List<Lottery> list = new ArrayList<Lottery>(lottery);
		while (win.size() < 4) {
			int random = (int) (Math.random() * list.size());
			Lottery lottery = list.get(random);
	        win.add(lottery);
		}
		return win;
		
		// 강사님 풀이
//		if (lottery.size() < 4) {
//			return null;
//		}
//		List<Lottery> lotteryList = new ArrayList<Lottery>(lottery);
//		while (win.size() < 4) {
//			int randomIdx = (int) (Math.random() * lotteryList.size());
//			win.add(lotteryList.get(randomIdx));
//		}
//		return win;
	}
	
	public Set<Lottery> sortedWinObject(){
		// 1. 이름을 오름차순으로 정렬
		// 이름이 같으면 번호로 오름차순 정렬
		// 정렬의 결과를 반환
		// 이때, 미리 만들어진 win을 가지고 정렬
		return new TreeSet<Lottery>(win); // 자동으로 compareTo 호출
	}
	
	public boolean searchWinner(Lottery l) {
		// 1. win에 해당 객체가 있는지 확인
		// 2. 결과 boolean을 리턴
		 return win.contains(l);
	}
}
