package kh.java.polymorphism.animail;

public class Eagle extends Animal implements Flyable {

	
	 @Override
	public void attack() {
		 System.out.println("부리공격합니다");
	}
	
	@Override
	public void say() {
		System.out.println("저는 독슈리입니다.");
	}
	
	@Override
	public void fly(String dsad) {
		
		System.out.println("푸다닥 납니다." +dsad);
	}
	
	
}
