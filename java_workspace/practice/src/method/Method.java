package method;

public class Method {
	public static void main(String[] args) {
		
		Method mt = new Method();
		
//		mt.test1();
		//사칙연산 메소드 구현및 출력
		mt.test2();
		//구구단 출력 메소드 사용
		
	
	
	
	}
		
		
		
		private void test2() {
		MyMath mm =new MyMath();
		
		mm.printgugudan(10);
			
			
			
			
	}


		
		public void test1() {
		//사칙연산 메소드 사용하기
		
		//메서드 객체생성
		MyMath mm =new MyMath();
		
		
		//매서드 호출
		long result1 =mm.add(5L, 3L);
		long result2 =mm.subtract(5L, 3L);
		long result3 =mm.multiply(5L, 3L);
		long result4 =mm.divide (5L, 3L);
		long result5 =mm.max(3L, 5L);
	
		//값 출력
		System.out.println("add(5L,3L)="+result1);
		System.out.println("subtract(5L,3L)="+result2);
		System.out.println("multiply(5L,3L)="+result3);
		System.out.println("divide(5L,3L)="+result4);
		System.out.println("큰값비교(3L,5L)큰값은="+result5 +"입니다");
	
	
	}
	public static class MyMath{
		//구구단 메서드
		void  printgugudan(int dan) {
			if((2<=dan && dan <=9))
				
			
			for(int i =1; i <=9 ; i++) {
				
				System.out.printf("%d*%d =%d %n" ,dan,i,dan*i);
				
			}else {
				System.out.println("2단부터 9단까지만가능합니다.");
			}
		}
		
		
		//사칙 연산 메서드
		long add(long a, long b) {
			
			long result =a+b;
			return result;
		}
		long subtract(long a, long b ) { return a-b;}
		long multiply(long a, long b ) { return a*b;}
		long divide(long a, long b ) { return a/b;}
		
		//두값을 받아서 둘중에 큰값을 반환하는 메서드 작성하시오
//		long max(long a, long b) {
//			
//			long result =0;
//			if (a>b) {
//				
//				result= a;
//			}else {
//				
//				result=b;
//			}
//		return result;
//		
//	}		
		//3항연산자로 바꿔보자
		//두값중 큰 숫자 알려주는 메서드
		long max(long a, long b) {
			

			return a>b ? a: b;
	}
}
		
		
	}


