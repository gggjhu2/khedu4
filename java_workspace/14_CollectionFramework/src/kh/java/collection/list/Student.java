package kh.java.collection.list;

import java.util.Objects;
					//test6을하기위한 정렬 기능 추가
public class Student implements Comparable <Student> {
							//인터페이스 comparable
									//===>컴페어러블안의 compareto 메서드를 완성해서사용한다.
									//최하단 컴페어투 오버라이드구문삽입 line 92작성
	private int no;
	private String name;

	public Student() {
		super();
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

	
	
	// 필드값이 동일하면 true 가 나올수 있도록 재작성한다.
	//
	// 필드값 no ,name
	//
	// equals & hashCode 는동시에 오버라이딩한다.
	// equals 결과가 true라면 hashcode값도 동일해야한다.(동일한 객체처럼 작동할 수있도록 오버라이딩한다)
	//
	//equals에 사용한 필드를 똑같이 이용해서 hashcode를 생성할것.
	@Override
	public boolean equals(Object o) {
		// Student 형변환전 타입 검사
		if (!(o instanceof Student))
			return false;

		Student other = (Student) o;
		//현재 no     other.no
		if (no != other.no)
			return false;

//		if (!name.equals(other.name))
//			return false;
		if(name !=other.name)
			return false;

		return true;
	}
	
	// 필드값이 동일하면 true 가 나올수 있도록 재작성한다.
		//
		// 필드값 no ,name
		//
		// equals & hashCode 는동시에 오버라이딩한다.
		// equals 결과가 true라면 hashcode값도 동일해야한다.(동일한 객체처럼 작동할 수있도록 오버라이딩한다)
		//
		//equals에 사용한 필드를 똑같이 이용해서 hashcode를 생성할것.
	@Override
	public int hashCode() {
		
		//hashcode 생성매소드 (jdk1.7)
		return Objects.hash(no, name);
		
	}
	
	
	//학번오름차순
	//기본정렬
	//양수 : 자리유지
	//0  : 자리유지
	//음수 :자리바꿈
	@Override
	public int compareTo(Student other) {
		
		
		
		return this.no - other.no ;
	}
	
}
