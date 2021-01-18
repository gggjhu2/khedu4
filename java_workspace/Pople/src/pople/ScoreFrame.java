package pople;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame{
	private JButton calcbtn;
	private JLabel lb;
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	
	ScoreFrame(){ 
	super();
	setBounds(200, 100, 400, 300);
	
	JPanel centerPane = new JPanel();
	centerPane.setLayout(new GridLayout(4,1,0,0));
	
	JLabel title = new JLabel("점수를 입력해주세요");
	JPanel titlePanel = new JPanel();
	titlePanel.add(title);
	
	JPanel centerPane1 = new JPanel();	
	javaScore = new JTextField(10);
	sqlScore = new JTextField(10);
	centerPane1.add(new JLabel("자바 :"));
	centerPane1.add(javaScore);
	centerPane1.add(new JLabel("SQL :"));
	centerPane1.add(sqlScore);
	
	JPanel centerPane2 = new JPanel();
	
	calcbtn = new JButton("계산하기");
	calcbtn.addActionListener(new ActionHandler());
	centerPane2.add(calcbtn);
	
	
	
	
	JPanel centerPane3 = new JPanel();
	total = new JTextField(10);
	average = new JTextField(10);
	
	centerPane3.add(new JLabel("총점 :"));
	centerPane3.add(total);
	centerPane3.add(new JLabel("평균 :"));
	centerPane3.add(average);
	
	centerPane.add(titlePanel);
	centerPane.add(centerPane1);
	centerPane.add(centerPane2);
	centerPane.add(centerPane3);
	
	add(centerPane);
	
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int s1 = Integer.parseInt(javaScore.getText());
			int s2 = Integer.parseInt(sqlScore.getText());
			total.setText(String.valueOf(s1+s2));
			average.setText(String.valueOf((s1+s2)/2));
		}
	}
}