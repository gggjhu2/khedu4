package kh.java.gui.swing.event;

//	내부클래스 사용방법
//1.static 내부클래스
//2.non-static 내부클래스
//3.지역 내부클래스
//변수처럼사용가능하다.
//
// 목적
// -외부클래스 안에서만 사용할때.
// -외부 클래스의 자원 (private자원에도) 에 쉽게 접근할수있고접근하기위해사용.
public class OuterClass {

	private int num=100;
	private static int snum=99;
	
	//아우터클래스 생성자만들기 최하단의 main 메서드를 활용하기위한절차
	public OuterClass() {
		
		//내부 클래스 그냥 사용가능
		new A().aaa();
		
		//스태틱 내부클래스도 그냥 사용가능
		new B().bbb();
		
		//테스트 내부클래스 
		test();
		
		//즉 외부에서 별도의 메인 메소드를 만들경우 코드가길어지고 복잡해진다.
		//내부 클래스 를 사용할경우는 코드가간결해지고 짧아진다.
		
	}
	
	
	public class A{
		public void aaa() {
			System.out.println(num);
			System.out.println(snum);
			
		}
	}
	
		//스태틱자원들만 접근가능하다.
	public static class B{
		public void bbb() {
						//non-static  변수에 접근불가능하다.
//			System.out.println(num);
			System.out.println(snum);
			
		}
		
	}
	
	
	
	//지역내부 클래스는 지역변수와 마찬가지로
	//접근제한자를 가질수없다.
	//
	public void test() {
		//지역 클래스는 접근제한자를쓸수없다.
		class C{
			public void ccc() {
				System.out.println(num);
				System.out.println(snum);
			}
		}
		C c=new C();
		c.ccc();
	}
	
	public static void main(String[] args) {
		new OuterClass();
		
		
		
		
	}
	
}
