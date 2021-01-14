package kh.java.gui.swing.container;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	
	public JPanelTest() {
		
		setTitle("세번째 프레임");
				
		setSize(800,600);
		setLocation(800,400);
		//JFrame 의 기본 LayoutManager 객체는 BorderLayout 이다.
//		setLayout(new BorderLayout());  작성하지않아도 자동으로 작성되어있는다
		//NULL LAYOUT : LAYOUT MANAGER 를 사용하지않고 직접 좌쵸를 지정한다,
		setLayout(null);
		//널을선언후에 페널에 직접 좌표를 입력해줄수잇따
		
		
		
		//스크린 가운데 띄우기
//		setLocationRelativeTo(null);
		//바운즈 (0,0,0,0)을하여도 뒤에 가운데정렬 스크린띄우기 로케이션릴레이티브투를 하면
		//강제로 위치가 가운데로 수정된다.
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//자식 컴포넌트 추가  (프레임안의 프레임이라생각하면된다.)
		JPanel panel1= new JPanel();
//		panel1.setBackground(Color.magenta);
		//RGB좌표 컬러넣는방법
		panel1.setBounds(100,50,300,400);
		panel1.setBackground(new Color(182, 205, 242));
		
		//라벨넣고  패널넣기
		
		
		
		JLabel label1= new JLabel("panel1");
		//라벨 패널에 추가
		panel1.add(label1);
					//패널1추가 위치 지정이다 윘쪾 위치지정해줬다
		setVisible(true);
		JPanel panel2= new JPanel();
		JLabel label2= new JLabel("panel2");
		panel2.setBounds(400,50,300,400);
		panel2.setBackground(new Color(190, 219, 171));

		//라벨 패널에 추가
		panel2.add(label2);
		setVisible(true);
		
		//프레임에 패널 추가
		add(panel1);
		add(panel2);
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new JPanelTest();
	}
}
