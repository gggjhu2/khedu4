package kh.java.gui.swing.container;

import javax.swing.JFrame;

public class JFrameTest2 extends JFrame {

	public JFrameTest2() {
		
		setTitle("두번째 프레임");
		
//		setSize(300,200);
//		setLocation(200,200);
	//위 두줄의 코드를 한번에 작성할수있는 방법이잇다.
		setBounds(200,200,300,200);
				//왼쪽이좌표  //우측이 사이즈
		
		
		//리사이즈 띄운창의 크기를 창 테두리를눌러 자유롭게조절하는 기능을 막는기능도있다.
//		setResizable(false);
					//false 를하면 리사이즈를 막는다
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new JFrameTest2();
	}
	
}
