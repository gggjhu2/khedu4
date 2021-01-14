package kh.java.thread;

public class CustomThread1 extends Thread {
	private char ch;
	
	public  CustomThread1(char ch) {
		this.ch =ch;
	}
	//
	//쓰레드 작업 내용을 작성하면된다.
	//시작이자 끝을 의미한다.
	@Override
	public void run() {
	for(int i =0 ; i <100 ; i++) {
			System.out.print(ch);
		}
	System.out.println("<"+ch+"쓰레드작업끝>");
	}
	
	
}
