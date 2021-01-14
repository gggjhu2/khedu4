package kh.java.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {
public static void main(String[] args) {
	NetworkTest n =new NetworkTest();
	//InetAddress 사용법
//	n.test1();
	
	n.test2();
}

	

	//	InetAdresss
	//	IP주소에 대한 정보를 가진 클래스
	//		예제)
	//	-ip :10.1.0.10.10 4바이트로 이루어진 실제주소
	//	-hostname : naver.com ,iei.or.kr
	//
	// 모든 메소드가 static ==>객체 생성이 필요없다.
	public void test1() {
		try {
			//싸이트의 아이피주소를 알아내는방법.
			//DNS (Domain Name Server) 에 naver.com이라는 도메인이름의 ip가뭔지 물어보는과정이다.
			InetAddress naver =InetAddress.getByName("naver.com");
			System.out.println("===naver.com ip어드래스");
			System.out.println(naver.getHostAddress());
			System.out.println("");
			
			InetAddress[] google =InetAddress.getAllByName("google.com");
			System.out.println("===google.com ip갯수");
			System.out.println(google.length);
			System.out.println("");
			
			InetAddress[] naver2 =InetAddress.getAllByName("naver.com");
			System.out.println("===naver.com ip갯수");
			System.out.println(naver2.length);
			System.out.println("===naver.com 의 모든 ip 갯수에 대한 ip주소");
			for(InetAddress ip : naver2)
				System.out.println(ip.getHostAddress());
			System.out.println("");
			
			//내컴퓨터의 ip주소
			InetAddress localhost =InetAddress.getLocalHost();
			System.out.println("======나의 ip주소=======");
			System.out.println(localhost.getHostAddress());
			//==>cmd에서봤던 ip가출력됨
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//
	//	URL
	//	protocol + hostname +port + 자원path  이모든게 필요하다.
	//
	// 이모든것을 관리해주는 클래스를 연습해본다.
	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	public void test2() {
		
		
	}

}
