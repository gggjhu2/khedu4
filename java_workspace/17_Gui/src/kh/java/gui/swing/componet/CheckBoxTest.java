package kh.java.gui.swing.componet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

//사용자로부터 복수개의 선택을 받을때
public class CheckBoxTest extends JFrame {

	JLabel resultLabel; 
	
	public CheckBoxTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		topPanel();
		selectPanel();
		resultPanel();
	}

	
	//상단의 제목페널
	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("과일을 선택하세요.");
		panel.add(label);
		add(panel, BorderLayout.NORTH);
	}
	//중간의 체크박스 페널
	private void selectPanel() {
		JPanel panel = new JPanel();
		JCheckBox[] chks = {
			new JCheckBox("바나나"),
			new JCheckBox("딸기"),
			new JCheckBox("아보카도")	
		};

		// 이벤트 핸들러 처리
		for(JCheckBox chk: chks) {
			chk.addActionListener(new ActionListener() {
				// 해당 요소들을 체크할때 체크해제할 때모두 엑션퍼폼드가 발생한다.
				@Override
				public void actionPerformed(ActionEvent e) {
//					System.out.println("actionPerformed!");
					List<String> checkedList = new ArrayList<>();
					for(JCheckBox chk : chks) {
						if(chk.isSelected())
							checkedList.add(chk.getText());
					}
					
					if(checkedList.isEmpty()) {
						resultLabel.setText("아무것도 선택하지 않았습니다.");
					}
					else {
						resultLabel.setText(checkedList + "를 선택했습니다.");
					}
				}
			});
		}
		// 체크박스 추가
				for (JCheckBox chk : chks) 
					panel.add(chk);
				
				add(panel);
	}
		//하단의 결과 패널
	private void resultPanel() {
		JPanel panel = new JPanel();
		resultLabel = new JLabel("아무과일도 선택하지 않았습니다.");
		panel.add(resultLabel);
		add(panel, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new CheckBoxTest(300, 500, "체크박스").setVisible(true);
	}
}
