package kh.java.collection.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	//		=map의 일종 이다=
	//	Properties 옜방식의 키맵 그러나 아직도 잘쓰고있는기능이다.
	//				=특징=(아직도쓰이는이유)
	//	K ,V 을  타입을 String ,String 으로 제한한 map클래스.
	//	-파일 입출력메소드를 지원 
	//  -설정정보 표현에 최적의 형태 
	public static void main(String[] args) {
		
		PropertiesTest p =new PropertiesTest();
		//프로퍼티 값을담고 출력해보는 연습 공부 메서드.
		//프로퍼티 확장자명 및 xml확장자명 을갖는 파일을작성하고 생성해보고 출력까지해본다.
		p.test1();
		
		
		//test1에서 만든 파일들을 읽어오는 메서드를 공부해본다.
		//설정파일의 내용을 읽어서 프로퍼티 객체로만들기를 해본다.
		p.test2();

		
	}
	
	
	
	//프로퍼티 값을담고 출력해보는 연습 공부 메서드.
	public void test1() {
		Properties prop =new Properties();
		prop.setProperty("url", "http://localhost:9090/kh-java");
		prop.setProperty("userName", "honggd");
		prop.setProperty("passWord", "123!@#$");
		System.out.println("=====Properties prop 에 값을 대입해본다====== ");
		System.out.println("기본방식은 다음과같다 ㅇㅇ.setProperty(\"ㅁㅁㅁ\", \"ㄴㄴㄴ\");");
		System.out.println("=====Properties prop 에 값을 대입해본다====== ");
		System.out.println(prop);
		System.out.println("=========대입한 값이 그대로들어갔고 출력된걸 확인했다.=====");
		System.out.println("");
		
		
		//파일에 저장
		//.PROPERTIES
		//.XML ==>사용자정의 태그로 구성되어잇다.
		System.out.println("======프로퍼티스 파일으로 생성해보기.=======");
		try {
			//프로포티 파일 생성									//이부분은 주석이다(설명하는부분이다.
			prop.store(new FileWriter("userInfo.properties"),"userInfo.properties");
			//xml 파일 생성 사용자 정의 태그
//			prop.storeToXML(new FileOutputStream("userInfo.xml"), "userInfo.xml");
			System.out.println(prop);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=userInfo.properties 생성완료=");
		System.out.println("");
		
		
		//같은 방식으로 xml 확장자명으로 파일을 생성해본다.
		System.out.println("==========xml확장자명으로 파일을 생성해본다.============");
		try {
			//xml 파일 생성 사용자 정의 태그
			prop.storeToXML(new FileOutputStream("userInfo.xml"), "userInfo.xml");
			System.out.println(prop);
		} catch (IOException e) {
			e.printStackTrace();
	}
		System.out.println("=userInfo.xml 생성완료=");
		System.out.println("");

	}
	
	
	
	
	
	//입력
	public void test2() {
		Properties prop2 =new Properties();
		Properties prop3 =new Properties();
		System.out.println("=======pro2에 userInfo.properties 파일의내용을담아본다====");
		try {
//			프로퍼티 부러오기   userInfo.properties 파일을 prop2객체에 담아주세요.
			prop2.load(new FileReader("userInfo.properties"));
			System.out.println("==>prop2객체에 내용담기성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==prop2출력==");
		System.out.println("prop2 => "+prop2);
		System.out.println("");
		
		
		System.out.println("=======pro3에 userInfo.xml 파일의내용을담아본다====");
		try {
//			프로퍼티 부러오기  userInfo.xml 파일을 prop3객체에 담아주세요.
			//xml불러오기  xml 파일내용을 프로퍼티 객체 prop3안에 담기
			prop3.loadFromXML(new FileInputStream("userInfo.xml"));
			System.out.println("==>prop3객체에 내용담기성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==prop3출력==");
		System.out.println("prop3 => "+prop3);
		System.out.println("");
		
		
		//1.요소가져오기
		System.out.println("=======prp2 에 입력된 키 벨류값을 키값을 불러와서 요소를 꺼내본다======");
									//  찾으려는 키값을 입력한다.
		String url =prop2.getProperty("url");
		String userName =prop2.getProperty("userName");
		String password =prop2.getProperty("password");
		System.out.println("url = :" +url+"\nuserName : "+userName+"\npassword = :" +password);
		System.out.println("======키값들을 받아와서 요소 벨류값 불러서 객체에담고 호출하는것 성공========");
		System.out.println("");
		

		//2.전체열람메소드 Enumeration	<===열거형 타입이라는뜻이다 이뉴머레이션타입이다.
				  //?는 모든 타입을다처리할수있다는것을 나타낸다 (object라고생각하면된다)
		Enumeration<?> en =prop3.propertyNames(); //name(KEY)모음 ,이터레이터랑 비슷한방식으로사용
				//키값을 NAME에담았다. 
		System.out.println("====이뉴머레이션을 사용해서 키값을 NAME에넣고 그걸이용하여 키값과 벨류값모두 출력가능===");
		while(en.hasMoreElements()) {
			String name =(String)en.nextElement();
			String value =prop3.getProperty(name);
			System.out.println(name + " = " +value);
		}
		System.out.println("");
		
		
	}
}
