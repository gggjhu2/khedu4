package kh.java.oop.field;



//   
//
//	프로그램 
//  main -------------->main 끝
//			*변수별 생명주기*
//	지역변수		메서드호출시-->메서드리턴
//	멤버변수 	객체 생성시 ------>객체소멸시까지.(garbage collector 에의해소멸될때까지)
//	클래스변수  프로그램시작시------------->프로그램종료
//			(해당클래스최초호출시)
//
//
public class GalaxyNote20 {
	
	//전역변수 이자 멤버변수(static이없다) 이자 instance변수,non-static변수 라고도한다.
	private String owner;
	private String phonNumber;
	
	//클래스 변수 :static 변수
	//공유의 목적 :모든객체가 공유할 값
	//보통 공유하는 변수는 final을 붙여줘서 고정을하는경우가 대부분이다
	public static final int Width =15;
	public static final int heith =20;
	
	
	//					 매개변수도 지역변수이다.ㅔ
	public void heyBixby(String str) {
		//지역변수 : 접근제한자, static키워드 사용불가
		//a라는 변수명은 메스드블럭밖에서 사용및 접근 불가
		int a=10;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPhonNumber() {
		return phonNumber;
	}
	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}
		
	
}
