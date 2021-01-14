package method;


//
//	-static method : 클래스명.메소드명 호출
//	static 자원(field , method)만 접근가능하다
//
//
//
//	-non-static method : 객체.메서드명 호출
//	non-static,static 자원 모두접근가능하다.
//
//
//
//
//
public class MethodTest {

		private int num =100;
		private static int snum =99;
		
	
	public static void main(String[] args) {
		
		//스태팃 메서드 호출방법
		MethodTest.a();
		
		//넌스태틱 메서드 호출방법
		MethodTest m =new MethodTest();
		m.b();
		
		
	}
	
	
	//스태틱있으면 스태틱 메서드 (=클래스메서드,인스턴스메서드,멤버메서드 다같은말)
	public static void a() {
		
		System.out.println("a!");
//		System.out.println(num);//에러가난다. ->num은 넌스테틱 필드변수이기떄문이다
		System.out.println(snum);//static 필드인 snum은 접근가능
	}
	
	//넌 스태틱메서드
	public void b() {
		
		System.out.println("b!");
		System.out.println(num); //넌스태틱 메서드는 스태틱 필드 넌스태틱필드 다 접근할수잇다
		System.out.println(MethodTest.snum);
		//넌스태틱은 스태틱 넌스태틱다접근가능하다
	}

}
