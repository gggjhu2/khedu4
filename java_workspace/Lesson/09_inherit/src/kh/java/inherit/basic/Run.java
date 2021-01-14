package kh.java.inherit.basic;

public class Run {

	public static void main(String[] args) {

		Parent p =new Parent();
		p.age=90;
		p.name="애미애비입니다.";
		p.sayso="애미애비입니다.";
		p.printinfo();
		
//		p.game();//부모클래스는 자식클래스에 접근할 수 없다.
		
		
		
		Child1 ch1 =new Child1();
		ch1.name = "홍길동";
		ch1.age = 30;
		ch1.printinfo();
		ch1.say();
		ch1.game();
		System.out.println("===========================");
		
		Child2 ch2= new Child2();
		ch2.name = "마이콜";
		ch2.age = 32;
		ch2.printinfo();
		ch2.say();
		ch2.listenToMusic();
		
		System.out.println("===========================");
		
		GrandChild Gc= new GrandChild();
		Gc.name="홍길동할아버지";
		Gc.age=60;
		Gc.printinfo();
		Gc.say();
		

		
	}

}
