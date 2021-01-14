package kh.java.oop.access.modifire.field.run;

import kh.java.oop.access.modifire.field.Kiwi;

//
//접근제한자 Access Modifier(점근제어자)
//
//	field/method
//	1.public	  =>다른패키지, 다른클래스 모두가능
//	2.protected	  =>같은패키지 다른패키지라도 상속관계는 ok
//3.default	  =>같은 패키지에서만 접근가능
//	(작성안하면 자동으로디폴트)
//	4.private     =>같은클래스
//
//	Class =>클레스앞에 붙일수있는경우는 두가지 접근제어자가잇다.
//	1. public 다른패키지 다른클래스 사용가능
//	2. default(작성금지) 같은패키지
//

public class KiwiRun {

	public static void main(String[] args) {

		 Kiwi kw =new Kiwi();
		 System.out.println(kw.publicNum);
		//System.out.println(kw.protectedNum);	//같은패키지접근가능 이지만 지금키위는 다른 패키지라 접근불가,상속관계에있다면 접근가능
		 //자식클래스인경우는 ok해준다
		//System.out.println(kw.defaultNum);		//같은패키지 접근가능이지만 지금키위는 다른 패키지라 접근불가
		//System.out.println(kw.privateNum);//프라이빗이라 다른클래스에서 접근불가
		
		
	}

}
