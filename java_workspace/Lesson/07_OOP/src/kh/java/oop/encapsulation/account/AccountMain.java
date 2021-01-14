package kh.java.oop.encapsulation.account;

public class AccountMain {

	public static void main(String[] args) {
		
//		Account acc =new Account();
//		acc.name="홍길동";
//		acc.balance=1_000_000;//잔액
//		
//		//입금
//		acc.balance += 500_000;
//		
//		System.out.println(acc.name+"님 계좌 잔액 : " +acc.balance +"원입니다.");
//		
//		//출금-
//		acc.balance -= 100_000;
//		System.out.println(acc.name+"님 계좌 잔액 : " +acc.balance +"원입니다.");
//		
		//접근제한자 private로 변경후 account의 필드를 직접 접근할수없어 에러가발생한다.
		//The field Account.balance is not visible error
		
		//접근제한후 acoount의 set 메서드에접근하여 값을변경할수잇다.
		Account acc =new Account();
		acc.setName("홍길동");
		acc.setBalance(1000000);
		
		//출력문또한 해당 출력 인스턴스가 프라이빗이기에 
		//퍼블릭 겟 메서드를 작성하여 우회로 값을 가져올수잇따.
		System.out.println(acc.getName()+"님의 계좌 잔액: "+acc.getBalance()+"원입니다.");
		
		//입금또한 우회접근해보겟따.
		
		acc.deposit(500000);
		System.out.println(acc.getName()+"님의 계좌 잔액: "+acc.getBalance()+"원입니다.");
		acc.deposit(-500);
		//사용자가 잘못처리할경우도 가능
		System.out.println(acc.getName()+"님의 계좌 잔액: "+acc.getBalance()+"원입니다.");
		
		//풀금을 우회 접근해보겟다.
		
		acc.Whithdraw(500000);
		System.out.println(acc.getName()+"님의 계좌 잔액: "+acc.getBalance()+"원입니다.");
		acc.Whithdraw(10000000);
		//잔액보다큰 금액을입력할경우의 수를 account withdraw 메서드를통해 미리작성한다.
		
		System.out.println(acc.getName()+"님의 계좌 잔액: "+acc.getBalance()+"원입니다.");
		
		
	}
}
