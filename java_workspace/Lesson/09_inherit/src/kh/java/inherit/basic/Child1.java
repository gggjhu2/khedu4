package kh.java.inherit.basic;
		//자식 클래스가 페어런트 클래스를 확장한 상속 클래서 작성방법
public class Child1 extends Parent {
	
	
	
	
	//
	// super(); 부모생성자를 호출
	// 생략해도 jvm이 자동으로 생성해 호출
	// 맨첫줄에 작성되어야함.
	// this와 동시 사용불가.!
	public Child1() {
		super();//부모생성자를 홒출하는 코드 super(); 이것이 우리가
				//작성하지않아도 자동으로 실행된다.   ==>페어런트의 생성자로간다.
		
		
		System.out.println("Child1 생성자호출!");
//		super();// 수퍼는 this 처럼 맨첫줄에 작성되어야한다  첫줄이아닐시 오류발생
		
		
		
	}
	
	//
	// 메소드 재작성 Override
	//
	//
	public void say() {
		
		System.out.println("제가 첫째입니다.");
	}
	
	public void game() {
		
		System.out.println("첫째가 게임을 시작합니다.");
	}
	
	
	
}
