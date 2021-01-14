package kh.java.gui.swing.container;

import javax.swing.JFrame;
import javax.swing.JLabel;

//java gui jframe 만드는순서
//1.jframe만들기


// JFrame 객체 생성방법은 두가지가있다.
//
//	1.new JFrame()직접 객체 생성하기.   ==>이거먼저 해본다.
//	
//	2.jframe 을 상속한 커스텀 클래스 작성후 객체 생성하기
public class JFrameTest1 {

	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		
		//윈도우창의 제목지정
		f.setTitle("Hello Swing");
		
		
		//윈도우 크기지정
				//300픽셀, 200픽셀 가로세로 크기정해준다.
		f.setSize(400, 250);
		
		
				//0,0 은 왼쪽 맨위가 기준이다. y축은 +면 아래로 x축은 오른쪽으로
//		f.setLocation(1000,800);

		//스크린 가운데 띄우기
		f.setLocationRelativeTo(null);
		
		
		//x버튼 -> 프로그램 종료 처리
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//자식 컴포넌트 : 컨테이너에 포함된 컴포넌트
		f.add(new JLabel("안녕"));
		//안녕 메세지 제일 왼쪽 y축중간출력
		
		
		
		//시각화 처리 (맨 마지막에 작성)
		//제일중요하다 맨마지막에 쓰지않으면 안에작성된 컴포넌트 문들이 작동안할수있다
		f.setVisible(true);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
