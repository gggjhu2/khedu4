package init.block;


//
//	필드 값대입 순서
//	멤버변수 필드 값대입순서
//	1.명시한 값이 없다면, type별 기본값이 대입.
//	2.명시한 값
//	3.초기화 블럭에서 대입한 값
//	4.생성자에서 대입한 값
//
//
//	클래스변수수 필드 값대입순서
//1.명시한 값이 없다면, type별 기본값이 대입.
//2.명시한 값
//3.static초기화 블럭에서 대입한 값
//
//
public class Sample {
	
//	private int num=100;
//	
//	public int getNum() {
//		return num;
//	}
	
	private int  num;
	public static String s;
	
	static {
		System.out.println("----static 초기화블럭 시작====");
		System.out.println(s);
		s="안녕,나스태틱이야";
		System.out.println(s);
		System.out.println("----static 초기화블럭 끝====");
		
	}
	
	//멤버변수용 초기화 블럭
	{
		System.out.println("초기화블럭 시작");
		System.out.println(num);
		num=78;
		s="helo world";
		
		System.out.println("초기화블럭 끝");
		
	}
	
	//생성자 :메소드 변형
	//객체생성시 자동으로 호출되는 메서드
	public Sample() {
		System.out.println("생성자 시작");
		System.out.println(num);
		num=99;
		System.out.println("생성자 끝");
		
	}
	
	//static 초기화 블럭
	//클래스 변수용 초기화블럭
	public int getNum() {
		return num;
	}
}
