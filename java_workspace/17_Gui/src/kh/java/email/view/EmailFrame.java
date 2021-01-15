package kh.java.email.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kh.java.email.controller.EmailController;
import kh.java.email.vo.Email;
import kh.java.gui.util.MyUtil;

public class EmailFrame extends JFrame{

	private EmailController emailController =new EmailController();
	
	public EmailFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		JPanel inputPanel =new JPanel();
		JTextField inputEmail =new JTextField(10);
		JButton submitBtn =new JButton("등록");
		inputPanel.add(inputEmail);
		inputPanel.add(submitBtn);
		
		//제출 이벤트 핸들러

				//등록버튼 액션기능 구현
		submitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s =inputEmail.getText();
				Email email =new Email();
				emailController.insertEmail(email);
				System.out.println(email);
				//사용자 피드백
				
				//inputEmail 초기화
				
				
				
			}
		});
				
		
		JPanel listPanel =new JPanel();
		JTextArea textArea =new JTextArea(5,20);//rows, collums
		listPanel.add(textArea);
		
		add(inputPanel, BorderLayout.NORTH);
		add(listPanel);
	}

}
