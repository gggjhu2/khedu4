package kh.java.thread.synchronization;

public class Atm extends Thread {
	
	private Account acc;

	public Atm(Account acc) {
		this.acc = acc;
	}
	
	
	//기능 추가
	@Override
	public void run() {
		
		while(acc.getBalance()>0) {
				//출금ㄱ금액	==>1 ~3 중 랜덤수
			int money =(int)(Math.random()*3+1)*100;
						//100 ~300원 출금
			acc.Withdraw(money);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //1.5초마다 출금해라
			
		}
		
		System.out.println(Thread.currentThread().getName()+"종료!!!");
	}
	
}
