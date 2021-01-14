package kh.java.polymorphism.animail;

public class Dog extends Animal implements Runnable , Bitable{

	
	
	public void kick() {
		
		System.out.println("개 발차기!");
		
	}
	@Override
	public void say() {
		System.out.println("안녕하세요 , 저는 개입니다.");
		
	}
	@Override
	public void attack() {
		kick();
	}
	
	@Override
	public void run() {
		System.out.println("개가 걷는다.");
		
	}
	
	@Override
	public void bite(String sound) {
		
		System.out.println("개가 짖습니다."+sound);
	}
}
