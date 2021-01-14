package kh.java.collection.set;

//HashSetTest.java 의 test3(); 에 서 퍼슨객체를 생성한다.
//필드  String name 을만들고 기본생성자, 파라매터생성자, 게터세터 ,투스트링 오버라이드를 작성하고 본문 으로넘어간다.
//test3() 진행중 홍길동과  홍길동의 객체가다를때 해쉬코드도 당연히다르므로 해당부분을 문자열 이같을때 해쉬코드도 같게하기위한 해쉬코드이퀄즈 오버라이드를작성해준다
// 																				*해당구문은 37번줄부터 시작한다.*
public class Person {
	
	
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
// HashSetTest.java 의 test3()메서드 진행중 홍길동의 객체 두개생성시 둘의 해쉬코드가 다른 객체이다 해당부분을 같은객체로 만들기위한 오버라이드수정부분이다.
// 해싀코드 이퀄즈 커스텀 클래스 오버라이드
//	@Override		//작성방법은 외워서 숙지 숙달해보자...방법이없다...이해하기는 아직너무 힘들다
					//TODO : 해당부분에대한 각 객체가가리키는 게무엇인지 이해가 없는상황..해당부분 학우들에게 질문혹은 선생님꼐질문통해 해결해보자
	
	
	//오브젝트를매개변수로받는다.
//	public boolean equals(Object o) {
//		
	//객체를 비교하는부분
//		//이부분이 뭔지모르겟다.
//		if(this ==o)
//			return true;
//		
	
	// 비정상코드를 걸러내기위한 이프문
//		if(o==null || !(o instanceof Person))
//		return false;
//		
//		
	
	//필드값을 비교하는것  ==> 타입캐스팅이 필요하다.   
//		Person other = (Person)o;
//		if(name ==null) {
//			if(other.name !=null)
//				return false;
//		}else {
	
			//결국은 이부분이 필드값비교하는것이다.
//			if (!name.equals(other.name))
//				return false;
//			
//		}
//		return true;
//	}
//	

//	@Override
//	public int hashCode() {
			//이퀄즈가 트루가나오면 hash코드가같게만들어주는 메서드이다.
//		return Objects.hash(name);
//	}
	
}
