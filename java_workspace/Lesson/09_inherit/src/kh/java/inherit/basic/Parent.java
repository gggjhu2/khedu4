package kh.java.inherit.basic;

//	상속 Inheritance
//
//	부모 클래스가 가지고있는 member 필드 (변수,메소드)
//	를 자식 클래스에서 선언하지않고 사용할수있게 하는것
//
// -public class 자식 클래스이름 extends 부모클래스 {  } :확장한다.
//	
//	이점 	
//	-중복을 제거해서 효율적으로 코드를 관리할수있다.
//	-공통적인 코드를 부모 클래스에서 관리할 수 있다.
//	
//	
//	특징
// 1.부모 클래스의 필드, 메소드는 자식클래에서 선언업싱 접근가능.
// (extend 클래스 이름 적기로 자식 부모 관계를 클래스명에 적어줘야가능하다.)
// 2.모든 클래스의 최상위 부모 클래스는 object
//   -아무 클래스도 상속하지 않았다면 ,extends object 가생략된것
//   -object 의 메소드를 모든 클래스에서 사용가능 toString 드으등등등
// 3.부모 클래스의 생성자 , 초기화 블럭은 상속안됨.	
//	-부모 클래스 생성자 호출 supier();
//
// 4. 부모 클래스의 메소드는 자식클래스에서 재작성해서 사용할 수 있다.
//		(overridding)
//
// 5. 부모 클래스의 private 필드/ 메소드는 상속은된다.  직접 접근할수없다.	
//		-게러 세터 사용하는방법
//		-값대입시에 부모 생성자를 호풀해서 필드에 부모 클래스안에서 값대입을하면된다.
//
//
//public class Parent extends Object {  <== extends object 가 생략된것.
public class Parent extends Object{

	String name;
	int age;
	String sayso;

	public Parent() {// 기본생성자
		System.out.println("부모 클래스 생성자 호출");

	}

	public void say() {

		System.out.println("제가 애빕니다.");
	}

	public void printinfo() {

		System.out.println(name + " , " + age);
	}

	public void age2(int String) {

		System.out.println();

	}

}
