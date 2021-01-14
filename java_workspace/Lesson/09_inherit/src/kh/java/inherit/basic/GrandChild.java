package kh.java.inherit.basic;

public class GrandChild extends Child1{
	
	

	public GrandChild() {
		super();//작성은안되있지만 자동 생성 ==>차일드1생성자로간다
		System.out.println("GrandChild 생성자호출!");
		
	}

	public void say() {
		
		System.out.println("제가 할애비입니다.");
	}
	
	
	
}
