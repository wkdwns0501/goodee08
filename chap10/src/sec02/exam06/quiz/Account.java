package sec02.exam06.quiz;

public class Account {
	// 필드
	private String user;
	private long balance;
	
	// 생성자
	public Account() {}

	public Account(String user, long balance) {
		this.user = user;
		this.balance = balance;
	}
	
	// Getter
	public String getUser() {
		return user;
	}

	public long getBalance() {
		return balance;
	}
	
	// 입금 메소드
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원이 입금되었습니다. [잔액: " + balance + "원]");
	}
	
	// 출금 메소드
	public void withdraw(int amount) throws InsufficientBalanceException {
		// 출금 금액이 잔액보다 크면 InsufficientBalanceException을 발생시키고 호출한 쪽으로 예외를 떠넘김
		if (balance  < amount) {
			throw new InsufficientBalanceException("잔액이 " + (amount - balance) + "원 부족합니다.");
		}
		// 출금 성공시 잔액에서 차감하고, 메시지 출력
		balance -= amount;
		System.out.println(amount + "원이 출금되었습니다. [잔액: " + balance + "원]");
	}
	
}
