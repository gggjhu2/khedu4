package byte_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  byte기반의 표준 입출력
	//	System.in : 사용자 키보드 입력
	//	System.out: 콘솔 출력
	//	
	//
	//
public class SystemIOTest {

	public static void main(String[] args) {
		SystemIOTest s =new SystemIOTest();
		
//		s.test1();
		s.test2();
		
	}
	
	
	
	
//  ==================test1 메서드=================================	
	
	//system.in 단독 사용 예제
	//
	//System.in.read():int를리턴하는메서드 -> 대상으로부터 1byte 읽어와서 int로 리턴하는 메소드
	//256가지 (0~255)+ 1(-1 : 읽어올값이 없는경우)
	//				+1은 -1을 뜻한다	
	//이클립스에서는 컨트롤 +Z를 입력하면 -1을 리턴한다. =>종료 할수있다.
	//
	public void test1() {
		
		System.out.println("키보드로 입력값을 주세요:");
		int data = 0;//읽어온 값을 처리할 변수
		
		
		
		
		try {
		
		while((data = System.in.read()) != -1) {
		
			System.out.println("input = " +data);
			
		}
	}catch(IOException e) {
		e.printStackTrace();
	}

		//a 하고 엔터키를 눌렀을시에는 이렇게 출력이된다.
//		키보드로 입력값을 주세요:
//			a
//			input = 97  //'a'의 아스키코드
//			input = 13	//개행  /r 을출력 
//			input = 10	//개행  /n 을출력
			//즉 우리가 a를 눌렀더라도 인풋에는 a+ /r,+/n이 입력된것을 출력하느것이다.
			//엔터는 프로그래밍적언어로 /r , /n이다 윈도우는 두가지를다한다.
}
//  ==================test2 메서드=================================	
	
	
	
	//
	// 2004sus JDK 1.5 버전이 나오기전
	// Scanner 클래스가 등장전의 사용자 입력값 처리는 다음과 같다.
	//
	//
	public void test2() {
		
		//보조 스트림  : 기본스트림에 연결해서사용.보조스트림 여러개를 연결할수있다.보조스트림 단독사용불가
		//마지막 연결된 보조스트림으로 입출력 제어 및 자원 반납을 한다.
												//바이트기반
		//BufferedReader br =new BufferedReader(System.in);
								//문자기반
		//The constructor BufferedReader(InputStream) is undefined
		//시스템 인은 바이트기반 버퍼드리더는 문자기반
		//다음과같이 사용할수있다.
		//System.in ->브릿지스트림(보조) ->보조스트림
		
		//InputStreamReader isr =new InputStreamReader(System.in);
		//BufferedReader br =new BufferedReader(isr);
			//위의 두줄을 아래 한줄로 표현한것이다.
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
					//4          3                         2           1
					//순서이므로 최종적으로는  BufferedReader 로 움직이기때문에 위두줄로푼곳에 isr과같은 객체를사용할일이없기떄문에
					//한줄로 표현한다. => isr객체를 만들필요자체가없다.
		//버퍼드리더는 분자기반 입력 보조스트림이다.
		
		
		// 사용자입력값 문자열 입력값 출력
//		String data = "";
//		System.out.println("키보드로 입력하세요!: ");
//		try {
//		
//		while((data = br.readLine()) !=null) {
//		System.out.println(data);
//		}
//		//표준 입출력을 사용하는 스트림클래스는 반납하면 안된다.
//		//한번 닫힌 표준입출력은 재사용할수는 없다.
//	
//	
//      }catch(IOException e) {
//		
//		e.printStackTrace();
//	}
			
		
		// 숫자로 입력받아서 더하고싶을경우
			
		
			String data = "";
			System.out.println("키보드로 입력하세요!: ");
			try {
			
			long sum =0;	
			while((data = br.readLine()) !=null) {
			System.out.println(data);
				//sum+=data;//문자형이라서 안된다.
				sum +=Long.parseLong(data);
				System.out.println(sum);
			}
			//표준 입출력을 사용하는 스트림클래스는 반납하면 안된다.
			//한번 닫힌 표준입출력은 재사용할수는 없다.
		
		
	}catch(IOException e) {
		
		e.printStackTrace();
	}finally {
		//자원반납  파이널리절도 예외처리를해준다 
//		try {
//			br.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//표준 입출력을 사용하는 스트림 클래스는 반납하면안된다.
		//이유는 버퍼드리더를 사용하지만 해당 클래스를닫으면 그에연관된하위 클래스들도 종료가되기떄문에
		//결국은InputStreamReader도 닫히고 System.in 도모두 닫히기떄문에 사용을할수없게된다.
		//그렇기에 이같이 사용이빈번한 프로그램들은 닫히면 프로그램 실행중에 다시는 사용할수없어지기에
		//기본적으로 종료를하지않는다.
		//한번닫힌 표준입출력은 재사용을할수없기에 닫지않는다.
	}
}
}