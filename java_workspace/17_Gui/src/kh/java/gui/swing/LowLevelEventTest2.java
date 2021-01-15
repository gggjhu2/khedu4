package kh.java.gui.swing;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;

public class LowLevelEventTest2 extends JFrame {

	
	
	JTextField input;
	JTextArea textArea;
	
	
	
	public LowLevelEventTest2(int w, int h,String title) {
		MyUtil.init(this, w, h, title);
		
		//top panel
		initTopPanel();
		
		
		//centerPanel
		initCenterPanel();
	}

	
	private void initTopPanel() {
		JPanel panel =new JPanel();
		panel.add(new JLabel("사용자 입력: "));
		input =new JTextField(10);
		panel.add(input);
		//panel.add(new JTextField(10));//컬럼수로 너비지정가능
		add(panel,BorderLayout.NORTH);
		
		
		//이벤트 핸들러 추가.
		input.addKeyListener(new MyKeyListener());   
	}


	
	private void initCenterPanel() {
		JPanel panel =new JPanel();
		
		textArea =new JTextArea(5,20);
//		panel.add(new JTextArea(5,20));//컬럼수로 너비지정
		panel.add(textArea);
		
		
		
		add(panel);
	}



	public class MyKeyListener implements KeyListener{

		@Override//누른걸 묶어서 한번에처리.3
		public void keyTyped(KeyEvent e) {
									//아스키코드값을가져와야되지만 안된다.
			System.out.print("typed :"+e.getKeyCode()+" "+e.getKeyChar());
			
			
		}

		@Override //키누른다.1
		public void keyPressed(KeyEvent e) {
			System.out.print("press: "+e.getKeyCode()+" "+e.getKeyChar());
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
//				System.out.println("엔터를 입력하셨습니다.");
				//사용자 입력값 전체를 jtextarea에 출력!
				String s =input.getText(); //jtextfield의 값을가져오는과정이다.
				 textArea.append(s+"\n");//텍스트에어리어에 string s 를 추가한다 append
				 
				 //초기화
				 input.setText("");
				
			}
		}

		@Override//키띤다.2
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new LowLevelEventTest2(300,200,"키이벤트").setVisible(true);
	}
	
	
	
}
