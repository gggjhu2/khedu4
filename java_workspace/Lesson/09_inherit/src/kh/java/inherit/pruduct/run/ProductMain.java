package kh.java.inherit.pruduct.run;

import kh.java.inherit.pruduct.model.vo.Desktop;
import kh.java.inherit.pruduct.model.vo.SmartPhone;
import kh.java.inherit.pruduct.model.vo.TV;

public class ProductMain {

	public static void main(String[] args) {

		Desktop d =new Desktop("삼성" , "삼성대땅" , 1_000_000, "Windows10","UHD커브드","기계식키보드");
		
		System.out.println(d.getDesktopInfo());
		System.out.println(d.toString());//to 스트링을쓰면 우리가원하는 출력값과 같이나오게하려면
		// to스트링 메소드를 오버라이드하여 원하는형태로 수정하여 사용할수잇다.
		SmartPhone s = new SmartPhone("애플","iphon12" ,500_000,"ios14", "KT");
		
		System.out.println(s.getSmartPhoneInfo());
		
		TV tv =new TV("LG","LG롤러블",1_000_000_000 , 30 , 60 );
		
		System.out.println(tv.getTVInfo());
		
		
		
	}

}
