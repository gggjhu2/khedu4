package kh.java.gui.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;




//Event
//
//	컴퓨터(프로그램)와 사용자간의 상호작용
//
//	event -> os -> jvm -> event 분배 쓰레드 ->각 component event handler메서드 호출
//
//	이벤트 의 두분류
//	1.저수준 이벤트
//		-key event
//		-mouse event
//		-focus event
//		-window event....
//
//	2.고수준 이벤트 Semantic Event (Component별 처리)  ==>저수준이벤트몇개의 조합한 이벤트이므로 고수준이벤트라한다.
//		-action event  <===보통 이 거하나로 다커버가가능하다.  새로운컴포넌트마다 기능이다달라진다.다 익혀야된다.
//		-item event
//		-adjustment event ....
public class LowLevelEventTest1 extends JFrame{
public LowLevelEventTest1(int w, int h, String title) {
	MyUtil.init(this, w, h, title);
	
	//패널추가
	JPanel panel =new JPanel();
	JLabel label =new JLabel("라벨");
	panel.add(label);
	
	//프레임에 패널추가하기.
	add(panel); 
	
	//이벤트 등록 방법  => 핸들러객체 만들기
	MyMouseListener listener =new MyMouseListener();
	//패널에 마우스리스너를 연결한다.
	panel.addMouseListener(listener);
	//기능을 떙겨오는 인터페이스 컴포넌트 별로 다추가를해줘야 연결이된다.
	//즉위에서는 마우스리 스너의 인터페이스만 연결해준것이고
	//아래는 마우스 휠리스너를 추가로 연결한것이다.
	panel.addMouseWheelListener(listener);
	//모션리스너 추가
	panel.addMouseMotionListener(listener);
	//클릭한상태에서움직이면 드레그드가 출력이된다.
	//우선순위가 드레그드가 우선순위가높아서 그렇다.
	
	//mouse adapter 용 프레임을만들어본다.
	JPanel panel2 =new JPanel();
	JLabel label2 =new JLabel("mouseadapter사용\n마우스클릭드만가져와서쓰기");
	panel2.add(label2);
	
	//프레임에 패널추가하기.
	add(panel2); 
	
	//마우스어댑터기능추가
	panel2.addMouseListener(new MyMouseListener2());
	
	
}



//아래 미우스리스너형태로 인터페이스를 끌어다쓸경우는 쓰지않을 기능도다 작성을해주어야하는상황이발생.
//이런경우는 다음과같이해결가능하다.			//마우스어댑터를 상속한다.
public class MyMouseListener2 extends MouseAdapter{

	//마우스어댑터는 마우스 관련 이벤트 인터페이스안의 메서드들을  원하는 메서드만오버라이딩을할수있게
	//해준다.원하는 기능만 끌어와서 오버라이딩해서 끌어다쓰면되는방식이다.
		@Override
		//클릭했을때
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouseClicked~");
		}
	
}





//내부 클래스로 마우스 이벤트 핸들러 클래스를만들어준다
public class MyMouseListener
implements MouseListener ,MouseWheelListener,MouseMotionListener{

	
	//MouseListener 인터페이스 
	@Override
	//클릭했을때
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked~");
	}

	@Override
	//마우스눌려있는상태
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed"+e);
	}

	@Override
	//마우스 누름띠면 나오는거.
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}

	@Override
	//마우스가 창안에들어왔을떄
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}

	@Override
	//마우스 창밖으로나갔을때
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}

	
	//MouseWheelListener 인터페이스
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("mouseWheelMoved");
	}

	
	//드래그 드랍 같은걸감지하는메서드 MouseMotionListener 인터페이스 
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseDragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//무브드는 좌표를찍어본다.
		System.out.println(e.getX()+","+e.getY());
		
	}
	
	
	
}


public static void main(String[] args) {
	new LowLevelEventTest1(300,200,"저수준 이벤트").setVisible(true);
}
}
