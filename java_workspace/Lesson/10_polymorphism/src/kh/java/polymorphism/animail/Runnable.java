package kh.java.polymorphism.animail;



	//
	// 컴파일 된 결과는 Runnable.class로 클래스와 동일하다.
	//
	//
public interface Runnable {

	//상수  public static final 이 자동 추가
	
	int LEGS =4; //PUBLIC STATIC FINAL INT LEGS =4; 와 동일하다 자동으로 상수로 정해진다.
	
	//public static final int Legs =4;와공일하다
	
	
	
	//추상 메소드 PUBLIC ABSTRACT가 자동 추가
		
	void run();// public abstract void run(); 과같이 자동으로 추상메소드로 작성이된다.
	
//	public abstract void run();
	//자동생성 public abstract 는 자동생성되니 안써줘도무방하다
	
	
	
}
