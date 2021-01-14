package kh.java.polymorphism.animail;

public class Cat extends Animal implements Runnable , Bitable{

	
	public void punch() {
		
		System.out.println("냥냥 펀치!");
		System.out.println("앙냥냥");
	}
	@Override
	public void say() {
		
		System.out.println("안냥냥냥.");
		
		
	}
	@Override
	public void attack() {
	
	punch();
}
	@Override
	public void run() {
		
		System.out.println("냥냥 걷기");
	}
	
	@Override
	public void bite (String sound) {
		
		System.out.println(" 냐용냐옹 웁니다."+sound);
	}
	
}
