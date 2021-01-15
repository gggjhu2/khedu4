package kh.java.inner.class_;

import kh.java.gui.swing.event.OuterClass;

public class Main {

	public static void main(String[] args) {
		OuterClass outer =new OuterClass();
		OuterClass.A a =outer.new A(); //멤버 내부클래스.
		a.aaa();
		
						//스태틱 메서드이기떄문에 클래스명.클래스 로접근을하는것이다.
		OuterClass.B b =new OuterClass.B();
		b.bbb();
		
		//지역 내부클래스는 외부 에서 절대 접근할수없다.
		outer.test();
		
	}
}
