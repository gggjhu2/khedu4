package kh.java.gui.swing.componet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import kh.java.gui.util.MyUtil;

public class RadioButtonTest extends JFrame {

	JLabel resultLabel;
	
	public RadioButtonTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		topPanel();
		sizePanel();
		resultPanel();
	}

	private void topPanel() {
		JPanel panel =new JPanel();
		JLabel label = new JLabel("커피 사이즈를 선택하세요.");
		panel.add(label);
		add(panel,BorderLayout.NORTH);
	}

	
	
	private void sizePanel() {
		JPanel panel =new JPanel();
		JRadioButton small =new JRadioButton("small");
		JRadioButton medium =new JRadioButton("medium");
		JRadioButton large =new JRadioButton("large");
		
		//단일 선택을위해서 그루핑 필수!
		ButtonGroup group =new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);
		
		//각각의 버튼에 이벤트핸들러 설치 ==>공용으로사용할것이다.
		ActionListener listener =new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//이벤트 발생 객체
				JRadioButton btn=(JRadioButton)e.getSource();
				resultLabel.setText("["+btn.getText()+"]를 선택하셨습니다.");
			}
		};
		
		small.addActionListener(listener);
		medium.addActionListener(listener);
		large.addActionListener(listener);
		
		panel.add(small);
		panel.add(medium);
		panel.add(large);
		add(panel);
		//여기까지면 이세가지싸이즈가 묵여있지않기때문에 한가지만선택하는것이안되는것이다.
	}

	private void resultPanel() {
		JPanel panel =new JPanel();
		this.resultLabel =new JLabel("사이즈를 선택하세요.");
		panel.add(resultLabel);
		add(panel,BorderLayout.SOUTH);
				
	}

	public static void main(String[] args) {
		new RadioButtonTest(300,200,"라디오 버튼").setVisible(true);
	}
	
	
}
