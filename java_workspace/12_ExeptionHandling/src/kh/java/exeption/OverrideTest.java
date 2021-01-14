package kh.java.exeption;

import java.io.IOException;
import java.sql.SQLException;

//  OVERRIDE 상속받은 메소드를 고쳐쓸수 있따.
//
//	1.메소드명 , 파라미터 선언부 , 리턴타입 모두 동일해야한다.
//	-@override annotation
//
//	2.접근제한자는 더넓은 범위로 수정이가능
//	-private (x) - default(x) -protected -public
//	-private 메서드는 오버라이드 불가
//	-default메서드는 거의 없음
//
//	3.메서드가 던지는 예외클래스는 줄이거나, 자식클래스로 변경가능
//
//
public class OverrideTest {

	class parent{
		
		public void test() throws SQLException , IOException{
			
			
			
		}
		
		class child extends parent{
			
			
			
			@Override
			public void test() {}
//			public void test() throws SQLException{}
//			public void test() throws FileNotFoundException{}
//			public void test() throws IOException{}
			//이위의 네가지는다가능하지만
			
			
			//밑의 익셉션은 상위타입이기에 불가능하다. 
//			public void test() exeption{}
			
			
		}
	}
	
	
}
