package kh.java.oop.access.modifire.class_;




//
// 접근제한자 Access Modifier(점근제어자)
//
//	1.public	  =>다른패키지, 다른클래스 모두가능
//	2.protected	  =>같은패키지 다른패키지라도 상속관계는 ok
//  3.default	  =>같은 패키지에서만 접근가능
//	(작성안하면 자동으로디폴트)
//	4.private     =>같은클래스
//
//	Class =>클레스앞에 붙일수있는경우는 두가지 접근제어자가잇다.
//	1. public 다른패키지 다른클래스 사용가능
//	2. default(작성금지) 같은패키지
//

public class FruitRun {
	public static void main(String[] args) {
		
		new Apple();
		new PineApple();
		
}
}