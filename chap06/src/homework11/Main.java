package homework11;

public class Main {
	public static void main(String[] args) {
		Account a1 = new Account("123-456-789", 100000);
		Account a2 = new Account("987-654-321", 50000);
		
		a1.withdraw(30000);
		System.out.print("30000원을 출금했습니다. ");
		System.out.println("현재 잔액: " + a1.getBalance() + "원");
		a2.deposit(100000);
		System.out.print("100000원을 입금했습니다. ");
		System.out.println("현재 잔액: " + a2.getBalance() + "원");
		
		Bank bank = new Bank();
		bank.transfer(a1, a2, 50000);
		System.out.print("50000원을 출금했습니다. ");
		System.out.println("현재 잔액: " + a1.getBalance() + "원");
		System.out.print("50000원을 입금했습니다. ");
		System.out.println("현재 잔액: " + a2.getBalance() + "원");
		
		System.out.println("계좌번호: " + a1.getAccountNumber());
		System.out.println("현재 잔액: " + a1.getBalance());
		System.out.println("계좌번호: " + a2.getAccountNumber());
		System.out.println("현재 잔액: " + a2.getBalance());
	}
}
