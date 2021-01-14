package kh.java.thread.synchronization;

public class Account {
				//잔액
	private int balance;
	
	public int getBalance() {
		return balance;
	}






	public Account(int balance) {
		this.balance =balance;
	}
	
	
	
	//츨금 메서드 :ATM기들은 이메서드를 통해 출금가능하다.
//	public void Withdraw(int money) {
//		String threadName =Thread.currentThread().getName();
//		System.out.println("["+threadName+"->잔액 : ￦"+balance+"]");
//		if(money<=balance) {
//			balance -=money;
//			System.out.println("["+threadName+"-> 출금 : ￦"+money+"잔액  : ￦"+balance+"]");
//		}else {
//			System.out.println("["+threadName+"+출금 :  ￦ " +money+ ",-> 잔액이 부족해서 출금할수없습니다.]");
//		}
		
		
	
	//쓰레드동기화 사용 으로 코드를 수정해본다.
	//동기화 처리							==>한객체에 한쓰레드만 들어갈수있는영역
	//결국 객체 단위로 동기화 처리 : account 객체를 임계영역으로 설정하게된다.
	//1.synchronized 메소드 만들기
	//2.synchronized bolock 사용하기. (추천)
	//위의 어카운트 메서드  싱크로나이즈드 화 해본다.
	//1번 사용방법은 다음과같다.사용법은 public synchronized void 클래스이름 () 이렇게사용한다.
//	public synchronized void Withdraw(int money) {
//		String threadName =Thread.currentThread().getName();
//		System.out.println("["+threadName+"->잔액 : ￦"+balance+"]");
//		if(money<=balance) {
//			balance -=money;
//			System.out.println("["+threadName+"-> 출금 : ￦"+money+"잔액  : ￦"+balance+"]");
//		}else {
//			System.out.println("["+threadName+"+출금 :  ￦ " +money+ ",-> 잔액이 부족해서 출금할수없습니다.]");
//		}
//	}
	
	//2.synchronized bolock 사용하기. (추천)
	public void Withdraw(int money) {
		String threadName =Thread.currentThread().getName();
		
		
		
		//임계영역에서 사용할 객체가 들어온다.  =>메서드단위가아니라 해당 사용부분만 싱크로나이즈를하는것이므로 좋은방식이다.
		synchronized (this) {
			//==========		synchronized (this) { } 안에 내용을답는다 그럼해당부분은 싱크로나이즈드동기화된다.===
			System.out.println("["+threadName+"->잔액 : ￦"+balance+"]");
			if(money<=balance) {
				balance -=money;
				System.out.println("["+threadName+"-> 출금 : ￦"+money+"잔액  : ￦"+balance+"]");
			}else {
				System.out.println("["+threadName+"+출금 :  ￦ " +money+ ",-> 잔액이 부족해서 출금할수없습니다.]");
			}
		}
	
	
	}
	}
