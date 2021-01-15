package kh.java.gui.swing.change.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class CustomPanel extends JPanel {
	
	private JFrame parent;
	
	public CustomPanel(JFrame parent,Color c ,String title) {
		this.parent=parent;//부모 객체에 접근하기위해 미리 필드로 지정
		
		
		setBackground(c);
		//패널의 기본 패널은 플로으 패널인데 그게아니라 에러가난다.
//		setLayout();
		//==>바까주면된다.
		setLayout(new BorderLayout());
		add(new JLabel(title),BorderLayout.NORTH);
		
		JPanel linkPanel =new JPanel();
		JButton btn0 =new JButton("0");
		JButton btn1 =new JButton("1");
		JButton btn2 =new JButton("2");
		
		linkPanel.add(btn0);
		linkPanel.add(btn1);
		linkPanel.add(btn2);
		add(linkPanel, BorderLayout.SOUTH);
		
		//각버튼 별 패널 교체하기
		ActionListener listener =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index =Integer.parseInt( ( (JButton)e.getSource() ).getText() );
				System.out.println(index);
				
				JPanel nextPanel =MainFrame.panels[index];
										//this라고하면 안된다.
				MyUtil.changePanel(parent, CustomPanel.this ,nextPanel);
			}
		};
		btn0.addActionListener(listener);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
	}

}
