package method;
//
//
//	call by value :  값을 전달(기본형)
//		
//
//	call by reference:	주소값을 전달(참조형)
//
//
public class CallByTest {
public static void main(String[] args) {
	
	
	int a=10;
	int[]arr= {1,2,3,4,5};
	
	CallByTest c =new CallByTest();
	c.test1(a); //callby value 
	System.out.println(a);
	c.test2(arr);//call by reference
	System.out.println(arr[0]);
	
	String s ="안녕";
	c.test3(s);  //call by reference  
	//스트링은 참조형이지만 리터럴풀떄문에 콜바이벨류처럼 작동한다
	
	System.out.println(s);
	
	Sample sp =new Sample();
	sp.num =99;
	c.test4(sp);   //call by reference  //실제값이 변경되면 콜바이레퍼런스
	System.out.println(sp.num);
}						

					//인자를받습니다.
	public void test1(int x) {
	System.out.println(x);
	x=20;
	System.out.println(x);
	}
	
	public void test2(int[] arr) {
		
		arr[0]*=100;
		
	}
	
	public void test3(String str) {
		str="잘가";
		
	}
	public void test4(Sample s) {
		
		s.num*=100;
	}
}

class Sample{
	
	int num;
}