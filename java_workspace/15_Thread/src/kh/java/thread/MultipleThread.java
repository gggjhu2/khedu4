package kh.java.thread;

public class MultipleThread implements Runnable {

	private int num;
	
	public MultipleThread(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String ThreadName =Thread.currentThread().getName();
		int i =1;
		while(true) {
			int product=i++*num;
				//100미만일때까지 
			if(product<100)
				System.out.println("["+ThreadName+"]"+" - "+product);
			try {
				Thread.sleep(20);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
