package com.oop.constructor;

import java.util.Date;

public class UserMain {

	public static void main(String[] args) {

		//1. 기본 생성자 생성후 + setter 를 이용하여 유저필드에 값을대입하는거다.
					//클래스명이아니라 생성자 를호출하는것이다.
					//생성자작성을안해줄시에는 jvm에서 기본생성자를 자동으로 작성하여
					//호출이가능하다.but 파라메터 생성자가 하나라도있다면 자동생성되지않기에
					//직접작성해줘야하낟.
		User u = new User();
		u.setUserID("honggd");
		u.setPassword("1234");
		u.setRegDate(new Date());
		u.printUser();
		
		
		
		//2. 파라미터 생성자  =>파라매터생성자를이용하면 기본생성자 로이용했을때보다 본문 작성 문이 간결해진다w
		User u2 =new User("신사임당"," 5678", new Date());
		u2.printUser();
		
		User u3 =new User("ususu");
		u3.printUser();
		
		User u4 = new User("hojae" ,"7878");
		
		u4.printUser();
		
		
		
	}

}
