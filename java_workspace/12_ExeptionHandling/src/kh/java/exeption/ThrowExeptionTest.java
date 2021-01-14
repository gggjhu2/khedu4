package kh.java.exeption;

import java.util.Scanner;

public class ThrowExeptionTest {

	public static void main(String[] args) {

		ThrowExeptionTest tet = new ThrowExeptionTest();
//		tet.test1();
		tet.test2();

	}

	//
	//
	// 성인인증해야 가능한 게임 구현
	// 1.성인인증 기능이 구현
	// 2.게임시작 으로 보내기 아니면 돌려보내기
	//
	public void test1() {

		boolean isAdult = checkage();

		if (!isAdult) {
			System.out.println("성인이아닙니다. 게임을종료합니다.");
			return;
		}

		System.out.println("성인 고스톱 게임 시작합니다.");

	}

	public boolean checkage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요. >");
		int age = sc.nextInt();
		if (age < 20)
			return false;
		else
			return true;

	}

	
	
	
	//
	// 예외를 통한 프로그램 흐름분기
	private void test2() {

//		try {
//		checkAgeAndThrowExeption();
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("성인 고스톱 게임 시작합니다.");
		try {
		
			
			checkAgeAndThrowExeption();
		
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("미성년자 안됩니다");
			return;
		}
		
		System.out.println("성인 고스톱 게임 시작합니다.");

		
		
		
		
	}
	
	
	
	//
	//	나이를 입력받고 , 미성년자인경우에는 예외를 던지는 메소드
	private void checkAgeAndThrowExeption() throws UnderAgeExeption{

			Scanner sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요. >");
			int age = sc.nextInt();
			
			if(age<20) {
//				throw new RuntimeException("미성년자 : " + age);//이렇게하면 오류가없다.
//				throw new UnderAgeExeption(String.valueOf(age));//이렇게하면 위에 메서드이름 +thhrows UnderAgeExeption 해야한다.
//				throw new Exception("미성년자 :" +age);
				// 의미가 확실한 예외 이름의 클래스를 새로우리가 만들어던지면 예외처리문구 출력시 가시성이좋아질수있다.
				//우리가 사용하는 부분은 이부분이다.(UnderAgeExeption 클래스에 구현해놓은 생성자사용)
				throw new UnderAgeExeption(String.valueOf(age));
										//String.valueOF(  ) 괄호안의 인자를 스트링 문자열로바까준다
										//해당안의 메세지는 항상 문자열이여야된다.
				
				////==========================================
				//우리가 사용하는 부분은 이부분이다.(UnderAgeExeption 클래스에 구현해놓은 생성자사용)
				//public UnderAgeExeption(String message) {
				//	super(message);
					// TODO Auto-generated constructor stub
			   //============================================		
			}
		
	}
}
