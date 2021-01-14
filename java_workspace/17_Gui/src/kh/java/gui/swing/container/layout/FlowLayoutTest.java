package kh.java.gui.swing.container.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;


public class FlowLayoutTest extends JFrame{

	private JTextField id;
	private JPasswordField pw;
	
	
	
	public FlowLayoutTest(int w , int h, String title) {
		MyUtil.init(this, w, h, title);
		//layout 무효화
		setLayout(null);

	//아이디 라벨 만들기 (글자)
	JLabel labelid =new JLabel("아이디 : ");
	labelid.setBounds(50,100,60,50);
	
	//아이디 텍스트필드 입력 칸만들기(입력공간)
//	JTextField id =new JTextField();//내부클래스에서의 접근을 하기위해 지역변수가아닌
	//필드변수로 변환시켜준다.
	id =new JTextField();
	id.setBounds(110,113,150,26);
	
	//패스워드 라벨만들기(글자)
	JLabel labelpw =new JLabel("비밀번호  : ");
	labelpw.setBounds(50,140,60,50);
	
	//패스워드텍스트필드 입력 칸만들기(입력공간)
//	JTextField pw =new JTextField();////내부클래스에서의 접근을 하기위해 지역변수가아닌
	pw=new JPasswordField();
	pw.setBounds(110,150,150,26);
	
	JButton btn =new JButton("로그인");
	btn.setBounds(280,100,100,110);
	
	add(labelid);
	add(labelpw);
	add(id);
	add(pw);
	add(btn);
	
	//버튼 btn에  밑의 loginListener 를 담는방법은다음과같다(다형성)
	btn.addActionListener(new LoginListener());
	//굉장히 중요한부분.

	
	//사용자 로그인버튼을 클릭했을때 , 입력한 id , pwd값을 가져오기
	//사용자 Event + EventHandling -> 이벤트핸들링 처리 객체를 만들어서 관리한다.
	//1.이벤트 처리객체 생성(클래스작성)
	//2.btn컴포넌트와 연결(binding)
	}
	
	
	
	//event handler
	//event listener
	public class LoginListener implements ActionListener{
		
		
		
		//JButton 의 ActionEvent 가 발생시 자동호출되는 메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			
//			System.out.println("버튼을 클릭하셨습니다.");
			//여기서 사용자 입력 id, password가져오기.
			System.out.println("아이디는" +id.getText() +"입니다");
			System.out.println("비밀번호는" +new String(pw.getPassword())+"입니다");
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
	
	new FlowLayoutTest(500,500,"로그인").setVisible(true);
	
	
	
}
}
