package kh.java.oop.field;

public class Main {
public static void main(String[] args) {
		GalaxyNote20 ph1 =new GalaxyNote20();

		ph1.setOwner("장호재");
		ph1.setPhonNumber("0101010");
		System.out.println(ph1.getOwner()+" : " +ph1.getPhonNumber());
//		System.out.println("폰의 가로길이는:"+ph1.Width+"\n폰의 세로길이는: "+ph1.heith);
		//The static field GalaxyNote20.heith should be accessed in a static way
		//스태틱 변수는 클래스명으로 접근해야한다
		System.out.println("폰의 가로길이는:"+GalaxyNote20.Width+"\n폰의 세로길이는: "+GalaxyNote20.heith);
		//이렇게접근해야맞다
		
		GalaxyNote20 ph2 =new GalaxyNote20();
		
		ph2.setOwner("김한성");
		ph2.setPhonNumber("03213123101010");
		System.out.println(ph2.getOwner()+" : " +ph2.getPhonNumber());
		System.out.println("폰의 가로길이는:"+GalaxyNote20.Width+"\n폰의 세로길이는: "+GalaxyNote20.heith);
		
		
		//jdk static 변수 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
		//등등이 전역변수 스테틱 파이널 변수이다
		
		
		
		
		
		
		
		
}	


}
