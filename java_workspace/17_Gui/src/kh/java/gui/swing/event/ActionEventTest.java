package kh.java.gui.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;


//
//	EventListener 를 bind하는방법 3가지방법이있다.
//방법1.내부클래스로 선언해서 객체 생성										==>해본다.
//					(	public class MyActionListener implements ActionListener{) <=이부분이다.
//방법2.익명클래스로 선언과 동시에 객체 생성(추상클래서 ,인터페이스도 new연산자사용가능) ==>해본다
//방법3.JFrame 커스텀 클래스에서 Listener 구현하기.						==>해본다.
											//여기 부터 세번째방법이다. ==>line:98
public class ActionEventTest extends JFrame implements ActionListener{
	
	JTextField input;
	
	public ActionEventTest(int w ,int h ,String title) {
		MyUtil.init(this, w, h, title);
		
		JPanel panel =new JPanel();
		JLabel label =new JLabel("사용자 입력: ");
		
		input =new JTextField(10);
		
		//첫번째방법=================================================
		//input 컴포넌트에 ActionEventHandler 바인딩
//		input.addActionListener(new MyActionListener()); 
		//=========================================================>
		//public class MyActionListener implements ActionListener{ 아래 여기작성부분.
		
		
		
		
		//=============================================================
		//2번방법이다. (인터페이스를 객체로만든 것같은 방식의 모양이다.)
		//익명클래스 :클래스선언 +객체 생성 을 한번에 한것이다.
//		//지역내부클래스의 파생형이다.
//		ActionListener listener =new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//팝업창						//안줘도된다.
//				JOptionPane.showMessageDialog(/*parentComponent*/null,input.getText());
//				//초기화
//				input.setText("");
//			}
//		};
//		//위의것 바인딩하는 코딩 문구
//		input.addActionListener(listener);
		//==============================================================
		//두번째방법 끝  ==>세번째방법 시도를위해 주석처리해본다.
		
		
		//==============================================================
		//세번째방법 JFrameCustom클래스가 ActionListener 구현하기.
		input.addActionListener(this);
		
		
		//panel에 추가하기
		panel.add(label);
		panel.add(input);
		add(panel);
		
	}
	
	//=============첫번째방법 내부클래스를 사용한방법이다.====================================================	
	
	public class MyActionListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("actionPerformed");
				//팝업창						//안줘도된다.
				JOptionPane.showMessageDialog(/*parentComponent*/null,input.getText());
				
				//초기화
				input.setText("");
				input.requestFocus();//바로입력할수있도록 focus를가져오기
			}
	}
//=====================================================================================	
	
	

	
	
	public static void main(String[] args) {
	new ActionEventTest(300,200,"액션 이벤트").setVisible(true);
	
}


// 
//3번째방법이다 JFrame Custom 클래스에서 implments listener 를 추가하여
	// JFrame Custom 클래스에서  listener 를 구현하는방법이다.
//
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
