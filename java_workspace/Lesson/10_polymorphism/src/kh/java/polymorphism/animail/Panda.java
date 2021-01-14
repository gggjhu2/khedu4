package kh.java.polymorphism.animail;

public class Panda extends Animal {

	
		public void eat() {
		
		System.out.println("대나무먹기!");
		
	}
	@Override
	public void say() {
		System.out.println("안녕하세요 , 저는 퐌다입니다.");
		
	}
	@Override
	public void attack() {
		System.out.println("대나무먹기 공격!");
	}
}
