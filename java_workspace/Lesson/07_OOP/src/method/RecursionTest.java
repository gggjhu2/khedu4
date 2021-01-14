package method;



//
//
//	재귀 함수 Recursion
//
//	함수가 함수자신을 다시 호출하는것을 말한다
//
public class RecursionTest {

	public static void main(String[] args) {

		RecursionTest r =new RecursionTest();
		int result =r.factorial(5);
		System.out.println("result ="+result);
		
		

	}
	
	
	// 
	// 5! = 5*4*3*2*1
	//
	//	재귀함수는 반드시 종료조건을 기술해야 한다.
	//
	//
	public int factorial(int x) {
		System.out.println(x);
		
		if(x==1)
			return 1;
		return x+ factorial(x-1);
		
		
	}
}
