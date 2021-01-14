package method;


//
//	Method overloading
//
// 메서드명은 직관적으로 작성할것.
//  동사(+명사)
//ex) -setUserName
//	  -getUserName
//	  -printInfo
//	  -addInt(int , int)
//	  -addDouble(double, double)	
//		//에드인트 에드 더블과같이 같은기능을하지만 매개변수에따라서 이름을달리해주자니
//		//번거롭기떄문에 이름이달라도 같은메서드를 사용하게 허용하기위해 오버로딩을한다
//
//   메서드 오버로딩 규칙
//
//	-메서드명은 동일
//	-매개변수 선언부는 달라야한다. 타입, 갯수, 순서//중요한규칙
//	-매개변수 명만달른건 인정안됨 접근제한자 다른것도 인정안됨 리턴타입은 상관 ㄴㄴ//중요함규칙
//
public class OverloadingTest {
	public static void main(String[] args) {
		
		
	System.out.println(123);      // 
	System.out.println(true);	  //
	System.out.println('a');	  //
	System.out.println(123.456);  //
	
	
}
	
	//같은메서드이름 다른 타입 
	public void test() {}
	public void test(int i) {}  //
	public void test(char i) {} //매개변수명은 중복되든 아니든상관않는다.
	public void test(char i , int j) {}	// 
	public void test(int j,char i) {} 	//매개변수이름과상관없이 순서가다르기떄문에 오버라이딩허용된다.
	
}
