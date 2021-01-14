package kh.java.thread;


//test6 의  interrupt 종료 예문을위한  인터페이스수정
public class CountDown2 extends Thread {
	private int num;
	
	public  CountDown2(int num) {
		this.num =num;
	}
	
	
	
	
	//5,4,3,2,1, 카운트다운을하는 쓰레드를 만든다.
	@Override
	public void run() {
		
		for(int i =num ; i>0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				//예외가발생한다.
//				e.printStackTrace();//여길주석하면 아예 그냥 문구없이 조용히종료가된다.
				break;	//에러 문구가뜨면 빠져나간다.
			}
			
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
