package kh.java.api.string.wrapper;

import java.util.ArrayList;
import java.util.List;

//
	// Wrapper
	//	
	//	기본형에 대응한는 참조형 클래스,
	//	java.lang패키지에 존재
	//	기본형(값)을 감싼 형태이기 떄문에 Wrapper라고 부른다.	
	//
	//	1.기본형을 참조형으로 사용해야 할때.
	//	2.기본형 관련된 메소드 혹은 상수를 사용하고자 할때
	//	
	//
public class WrapperClassTest {

	public static void main(String[] args) {

		WrapperClassTest wc =new WrapperClassTest();
		//wc.test1();
		wc.test2();
		
		
	}
	//기본형    래퍼
	//bolean -Boolean
	//
	//char -Character
	//
	//byte- Byte
	//short-Short
	//int -Integer
	//ling -Long
	//
	//
	//float -Float
	//double -Double
	//
	
	public void test1() {
		
		int num =100;
		Integer i =new Integer(100);
		
		//aouto-boxing    => 기본형 -Wrapper
		//aouto-unboxing  =>Wrapper - 기본형으로바꾸는것
		
		
		// 
//		num+new WrapperClassTest()//말이안된다
		System.out.println(num + i);
		System.out.println(num + i.intValue());//사실은 이런과정으로 호출이된것이다.
		//자동으로 되기떄문에 이과정을 오토언빢씽이라고한다.
		
		Integer j =3;//내부적으로 
//		Integer j =new Integer(3);//와같다오토빢씽이다.
		//기본형을 인티저 제이에 담은것이므로 오토빢씽이다.
		
		System.out.println(j ==3);
		System.out.println(j.intValue()==3);
		System.out.println(j.hashCode());
		System.out.println(Integer.MAX_VALUE);
		
		
		//기본형이 아닌 참조형만 써야하는경우.
		
		//List<int> list = new ArrayList<>();//기본형은안된다.
			// <  >  이부분을 제네릭스라고한다 
		List<Integer> list = new ArrayList<>();//가능
		
		
	}
	//
	// WrapperClass 는 형변환 static 메소드 지원,
	// 문자열 데이터를 각각의 타입으로 변환
	//
	public void test2() {
		
		int i = Integer.parseInt("100");
		System.out.println(i*100);
		
		double d =Double.parseDouble("123.456");
		System.out.println(d*100);
		
		boolean bool =Boolean.parseBoolean("true");
		System.out.println(!bool);
		
		char ch ="abc".charAt(0);
		System.out.println((int)ch);
	}
}
