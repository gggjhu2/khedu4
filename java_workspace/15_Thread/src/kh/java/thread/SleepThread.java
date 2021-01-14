package kh.java.thread;

public class SleepThread implements Runnable {

	private char ch;
	private long millis;  //밀리초 
	
	
	//생성자 생성
	public SleepThread(char ch, long millis) {
		super();
		this.ch = ch;
		this.millis = millis;
	}


	@Override
	public void run() {
		for(int i =0 ; i <100; i++) {
			System.out.print(ch);

			//현재 쓰레드를 timed -watting 상태로 변경
			//예외처리 감싸주어야한다.
			try {
				//쓰레드를찍고 밀리초를 기다렸다가 다시 자동으로꺠어난다.
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"끝");
	}

}
