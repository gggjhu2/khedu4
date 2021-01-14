package kh.java.api.string;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {

		StringTest st =new StringTest();
//		st.test1();
//		st.test2();
		st.test3();
		
		
	}

	
	
	//
	// String 은 immutable (변경불가) 이다.
	//
	public void test1() {
		
		String s1 = "java";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1+=" oracle";
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1+=" javascriipt";
		System.out.println(s1);
		s1+=" html";
		System.out.println(s1);
		s1+=" css";
		System.out.println(s1);
	}
	
	
	// StringBuilder mutable(변경가능)  =>싱글 스레드용
	// StringBuffer  mutable(변경가능)  =>멀티쓰레드용 동기화를 지원
	//											동기화는 순서를 정해서 딱맞게충돌나지않게만들어주는것
	public void test2() {
		StringBuilder sb =new StringBuilder("java");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		//문자열을더해주는메서드
		sb.append(" oracle");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		print(sb.toString());
		
	} 
		public void print(String s) {
			System.out.println(s);
		}
	
		
	//
	//	CSV 데이터 처리하기
	//  Comma Seperated Value
	//	ex> "java, oracle , html , javascript , css"
	//	
	//   구분자는 실제 데이터에 사용되지 않는 어떠한 문자도 좋다.
	//	java /oracle /html / spring / maven/ 
	//	java §oracle §html § spring § maven§ 
	//	
	//  1.String 의 Split
	//  2.String Tokenizer
	//
	//
	public void test3() {
		String data = "java §oracle §html § spring § maven§ hk/java/html";

			//1.split
				String[] arr =data.split("§");
		for(String s :arr) {
			
		
			System.out.println("["+s+"]");
		
		System.out.println("====스플릿 끗=====");	
			
			//2.StringTokenizer tokenizer
																//구분자
			StringTokenizer tokenizer =new StringTokenizer(data,"§");
			
		
			System.out.println(tokenizer.countTokens());
			while(tokenizer.hasMoreTokens()) {
				String s3 =tokenizer.nextToken();
				System.out.println("<"+s3+">");
			}
			System.out.println(tokenizer.countTokens());
		
			System.out.println("=====토커나이저 끝========");
		//구분자 처리 다른점
		//1.StringTokenizer  은 빈문자열은 요소로 취급하지않는다.
		//2.StringTokenizer 구분자문자열을 문자단위로 인식처리
		//3.split도 정규표현식을 사용하면 문자단위로 처리
		
		
		//정규표현식(ragular expression)
		String[] arr2 =data.split("§");

		//스트링 토커나이저 예시1
		data ="a ,b,,c,d";
		arr2 =data.split("[, ]");
		System.out.println("============");
		for(String s2 :arr2) {
			System.out.println("["+s2+"]");
		}			
			System.out.println("토커나이저 스트링 예시1끗");
			
			//',' or '' 두개의 구분자로 인식
			
			//스트링 토커나이저 예시2
		tokenizer = new StringTokenizer(data,",");
		while(tokenizer.hasMoreTokens())
			System.out.println("<"+tokenizer.nextToken()+">");
	
		}
		System.out.println("토커나이저 스트링 예시2끗");
		}
	}

		

