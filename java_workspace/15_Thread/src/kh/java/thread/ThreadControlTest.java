package kh.java.thread;

import javax.swing.JOptionPane;

//쓰레드 컨트롤 기능 공부
//쓰레드는 상태를 갖는다.

public class ThreadControlTest {

	
	
	public static void main(String[] args) {
		
		ThreadControlTest t =new ThreadControlTest();
	
		//sleep 제어문을통해 각 쓰레드가 일하고 쉬고를 시간을통해 조절할수있다.
//		t.test1();
		
		//숫자찍기 (쓰레드이름짖고 지연시간주어서 출력)
//		t.test2();
		
		
		//쓰레드간의 종속관계
		//일반쓰레드 -Deamon 쓰레드
//		t.test3();
		System.out.println("["+Thread.currentThread().getName()+"메인쓰레드 종료]");
		
		
		//test3의 쓰레드를 데언쓰레드를 종속해서하는메서드
//		t.test4();
		System.out.println("["+Thread.currentThread().getName()+"메인쓰레드 종료]");
		
		
		//해당 쓰레드를 바로종료 시킬수있는방법을공부해본다.
		t.test5();

	}
	
	
	//sleep을이용해 지연 출력하기
	public void test1() {
		
		Thread a =new Thread(new SleepThread('|' , 50));
		Thread b =new Thread(new SleepThread('-' , 30));
		
		//쓰레드 이름을 정해줄수있다.
		a.setName("a쓰레드");
        b.setName("b쓰레드");
		
        
		a.start();
		b.start();
	}

	
	//숫자찍기
	//3의배수 출력 쓰레드와 
	//4의 배수 출력 쓰레드를 생성하고 실행하세요
	//[Thread이름 -배수]
	//실행간격은 200밀리초.
	//100초과시 중지할것.
	//ex)					실제 3의배수 를 출력하는게아닌 3의배소 이름을갖는 쓰레드
	//[3배수 쓰레드-3]			4의배수 이름을 갖는 쓰레드의 출력을할뿐이다.
	//[3배수 쓰레드-6]			그리고 그둘의 작업이 100이될때까지 진행한다.
	//[4배수 쓰레드-4]
	//[3배수 쓰레드-9]
	//[4배수 쓰레드-8]
	//[3배수 쓰레드-12]
	// 이런식으로출력되면된다.
	public void test2() {
		
		Thread m3 =new Thread(new MultipleThread(3));
		Thread m4 =new Thread(new MultipleThread(4));
		
		m3.setName("3배수 쓰레드");
        m4.setName("4배수 쓰레드");
		
        m3.start();
        m4.start();
        
	}
	
	
	//쓰레드간의 종속관계
	//
	// 일반쓰레드 - Deamon 쓰레드
	public void test3() {		//카운트 숫자
		
		Thread cnt =new CountDown(50);
		
		cnt.start();
		
		//main thread 일시정지 블락 상태 만들기
					//팝업창이 뜬다 해당 버튼을 눌러야 메인쓰레드가 완벽히 종료된다. 스윙라이브러리 기능이다.
		JOptionPane.showMessageDialog(null, "확인을 누르시면 메인쓰레드가 종료됩니다.");
		
		
	}
	
	
public void test4() {		//카운트 숫자
		
		Thread cnt =new CountDown(50);
		
		
		//메인쓰레드와  cnt쓰레드의 종속관계를만들어준다
		//메인쓰레드가 종료되면 cnt쓰레드 도 종료가된다.
		//시간차이는 존재한다. 바로종료되진않는다.
		cnt.setDaemon(true);
		
		cnt.start();
		
		//main thread 일시정지 블락 상태 만들기
					//팝업창이 뜬다 해당 버튼을 눌러야 메인쓰레드가 완벽히 종료된다. 스윙라이브러리 기능이다.
		JOptionPane.showMessageDialog(null, "확인을 누르시면 메인쓰레드가 종료됩니다.");
	}



	//쓰레드 종료시키기  =>작성 절차
	//1.해당쓰레드의 interrupt() 메소드를 호출
	//2.InterruptedException 발생
	//3.catch 절에 다음액션 (종료) 작성
					//이종료 의 조건문을 조정하여 우리가 원하는 방식의 작업을하도록 유도할수잇따.
	public void test5() {
		Thread cnt =new CountDown2(100);
		cnt.start();
		JOptionPane.showMessageDialog(null, "확인을 누르시면 카운트다운을 종료합니다.");
		cnt.interrupt();
		//예외처리가발생하면바로 break를 통해서 종료되도록 설계를한것인다.
		
		
	}
}
