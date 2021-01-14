package kh.java.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class NetworkTest {
public static void main(String[] args) {
	NetworkTest n =new NetworkTest();
	//InetAddress 사용법
//	n.test1();
	
	//url 의 구성및 url의 요소 출력 방법.
//	n.test2();
	
	n.test3();
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
	//	프로토콜	
	//
	// 이모든것을 관리해주는 클래스를 연습해본다.
	//
	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	//
	//https://	==>프로토콜
	//==>docs.oracle.com	==>hostname	
	//앞에는 443 이라는 기본포트가 숨겨져있다. =>프로토콜에 대한 기본포트는 생략 가능 
	// https -443 , http-80  , ftp -20 ....등등등			=>포트
	//javase/8/docs/api/java/util/ArrayList.html ==> 는 폴더구죠.==>폴더구조일수도있고 아닐수도있지만
	//	==>자원path															구조내용은이렇다.
	//
	//protocol : 통신 규약 http, https ,ftp ...등등등
	//
	//port : 서비스 번호 . 컴퓨터 내에 특정프로그램을 가리키는 논리적인 번호,.
	public void test2() {
											//여기에 :443 으로 포트번호를 추가한다.
		try {
			URL url =new URL("https://docs.oracle.com:443/javase/8/docs/api/java/util/ArrayList.html") ;
			
			// 프로토콜 , 호스트 네임 , 포트 , 패스 를 가져온다.
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getDefaultPort()); //우리가 위에 직접 포트를 써주지않으면 -1이뜬다.
													//포트를 지우고 실험해본다.
			URL url2 =new URL("https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html") ;
			System.out.println("");
			System.out.println(url2.getPort());
								//디폴트 포트는 그대로 나온다.
			System.out.println(url2.getDefaultPort());
			//역시 -1이나온다.
			//조건문으로 겟포트가 -1 즉, 없다면  디펄트포트로 출력해달라는 3항연산자 구문을 통해 출력가능하다.
			System.out.println(url.getPort() != -1 ? url.getPort() : url.getDefaultPort());
			
			URL url3 =new URL("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=gui%EC%9E%90%EB%B0%94&oquery=gui&tqi=U%2F%2F%2FmsprvN8ss4SbOwNssssstCo-164508");
			System.out.println(url3.getQuery());		
			//이같이 짤라서 호출하는것을 url을 파싱했다고 말한다.
			
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//
	//URL 연결요청
	//->파일로 저장
	//
	public void test3() {
		
//		//검색결과 담기
//		String adress="https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=gui%EC%9E%90%EB%B0%94&oquery=gui&tqi=U%2F%2F%2FmsprvN8ss4SbOwNssssstCo-164508" ;
//		
//		try {
//			URL url =new URL(adress);
//			URLConnection conn =url.openConnection();
//			
//			//conn 에받아온 정보를  br 객체에 담아서 썻다.
//			BufferedReader br =new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			//br로 받은 부분을 이제 쓰는걸해본다.
//			BufferedWriter bw =new BufferedWriter(new FileWriter("naverSearch_result.html"));
//			
//			
//			String data ="";
//			while((data=br.readLine())!=null) {
////				System.out.println(data);
//				bw.write(data);
//				bw.write("\n");
//			}
//			System.out.println("검색 완료!");
//			
//			
//		} catch ( IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
		//클로즈 까지해보기위해 코드를 변경해본다.
		String adress="https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=gui%EC%9E%90%EB%B0%94&oquery=gui&tqi=U%2F%2F%2FmsprvN8ss4SbOwNssssstCo-164508" ;
		BufferedReader br =null;
		BufferedWriter bw =null;
		try {
			URL url =new URL(adress);
			URLConnection conn =url.openConnection();
			//conn 에받아온 정보를  br 객체에 담아서 썻다.
			br =new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//br로 받은 부분을 이제 쓰는걸해본다.
			bw =new BufferedWriter(new FileWriter("naverSearch_result.html"));
			
			
			
			String data ="";
			while((data=br.readLine())!=null) {
//				System.out.println(data);
				bw.write(data);
				bw.write("\n");
			}
			System.out.println("검색 완료!");
			
			
		} catch ( IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
}
