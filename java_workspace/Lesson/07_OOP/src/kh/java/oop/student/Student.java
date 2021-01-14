package kh.java.oop.student;



//
// class -> new연산자를 통해 객체(object(개념)),instence(메모리조각)
//
// 를 , 설계도
//
// 클래스를 프로그램의 지향하는 바에 따라 설계하는것을 추상화(anstraction)라고한다.
public class Student {
	
	//field :클래스 영역에 작성 
	//학생객체의 속성 (정적인data) 클래스 영역에 작성
				//고정되어있는것 (예를들어 키 몸무게 등등 ,상수와는다르다.)
	private String Name;
	private int point ;
	
	//method : 학생객체의 기능
	public void printStudentInfo() {
		//method 에서는 field를 참조할수있따.
//		System.out.println("이름 :" +setName);
//		System.out.println("점수 :" +point);
		System.out.println(this.Name+"님의 점수는"+this.point+ " 입니다.");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
}
