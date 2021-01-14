package kh.java.thread;

public class CountDown extends Thread {
	private int num;
	
	public  CountDown(int num) {
		this.num =num;
	}
	
	
	
	
	//5,4,3,2,1, 카운트다운을하는 쓰레드를 만든다.
	@Override
	public void run() {
		
		for(int i =num ; i>0 ; i--) {
			System.out.println(i);
			
			//쓰레드 슬립을 해야할때 예외처리가 번거로울떄 사용방법이있다.
			//슬립 딜레이시간
			delay(100);  //==>0.1초
			
		}
		System.out.println("["+Thread.currentThread().getName()+"카운트다운쓰레드 종료]");

	}
	
	
	
	//밀리초를 실행하는 메서드를  따로 작성해서 가져다쓰면편하다.
	public void delay(long millis) {
		
		try{
			Thread.sleep(millis);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
