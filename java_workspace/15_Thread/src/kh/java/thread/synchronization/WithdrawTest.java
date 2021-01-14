package kh.java.thread.synchronization;

//Synchronization  ==>동기화  IO에서도 클래스에 synchronization 를 사용햇었다.
//
//	예) 계좌 Account 에 접근하는 ATM가 2대있다.
//		-각 ATM기(Thread) 가 하나의 계좌에서 출금하는 상황
//


		//단순이렇게사용하면 동기화가되어있지않기때문에 2개이상의 스레드를 같이작업할시 
		//공유객체에대한 사용의 순서가없다. 그래서 뒤죽박죽이되어버린다.  해당분제를 해결하기위해
		//쓰레드 동기화를해주어야한다.
//	public class WithdrawTest {
//	
//	public static void main(String[] args) {
//							//초기금액 잔액1000원
//		Account acc =new Account(1000);
//		
//		Thread atm1 =new Atm(acc);
//		Thread atm2 =new Atm(acc);
//		
//		atm1.setName("atm1");
//		atm2.setName("atm2");
//		
//		atm1.start();
//		atm2.start();
//		
//	}


//쓰레드동기화 사용 으로 코드를 수정해본다.
//동기화 처리
//1.synchronized 메소드 만들기
//2.synchronized bolock 사용하기. (추천)
//사용법은 public synchronized void 클래스이름 () 이렇게사용한다.
//Account.java 에가서 작성을마무리해본다.
public class WithdrawTest {
	
	public static void main(String[] args) {
							//초기금액 잔액1000원
		Account acc =new Account(1000);
		
		Thread atm1 =new Atm(acc);
		Thread atm2 =new Atm(acc);
		
		atm1.setName("atm1");
		atm2.setName("atm2");
		
		atm1.start();
		atm2.start();
		
	}
	//싱크로나이즈드를 하면 해당 작업이 쓰레드의 순서에맞게 진행된다.
	//두쓰레드가 acc를 사용용할때  쓰레드1이 사용할때 2쓰레드도사용하는상황을설명해보면
	// 1쓰레드는 런어블로 사용되고있을시 2쓰레드는 블락드상태가되서 사용이 안된다.
	
}



