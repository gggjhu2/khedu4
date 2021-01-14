package kh.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTest at = new ArrayListTest();
		
		//배열의 문제점을 알아보는 메서드
//		at.test0();
		
		//LIST활용 방법 강의 메서드
		//list.add remove 사용하여 원하는 객체를 지우고 생성가능
//		at.test1();
		
		// GENERICS 타입제한 설명 강의 메서드
//		at.test2();
		
		//test0 번을 ArrayLsit 사용버전으로 변경하기
		//실습문제list만들기 연습
//		at.test3();
		
		//list의 추가적인방식들을 공부하는 메서드
//		at.test4();
		
		//정렬 을 공부해보는 메서드
//		at.test5();
		
		//커스텀 클래스 정렬하기 공부 메서드
//		at.test6();
		
		//20강쓰레드 시작전 다시 돌아와서 공부한 부분
		//concurrentModificationException
		at.test7();
		
	}

	//
	//
	// 배열의 문제점
	//
	//
	public void test0() {

		
		Student[] arr = new Student[3];
		arr[0] = new Student(1, "홍길동1");
		arr[1] = new Student(2, "신사임당");
		arr[2] = new Student(3, "세종대왕");
		System.out.println("================어레이즈 투스트링 arr배열출력=========================================================");
		System.out.println(Arrays.toString(arr));
		System.out.println("================어레이즈 투스트링 arr배열출력끗========================================================");
		System.out.println("");
		
		
		// 1. 학생 2명 추가 상황을 예시로 들어보자.
		System.out.println("====================학생 두명을 arr2에추가하기 1-1 추가할 배열10칸객체만들기=================================================================================================");
								//추가할 공간을 넉넉히만든다.
		Student[] arr2 = new Student[10];
					//arr 0번지 부터 arr2 영번지 에 arr의 전체를옮겨라(arr.length) 
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.out.println(Arrays.toString(arr2));
		//빈공간은 null로 표시해준다
		System.out.println("=================학생 두명을 arr2에추가하기 1-1 추가할 배열10칸객체만들기끗==============================================================================================");
		System.out.println("");
		
		
		System.out.println("====================arr1을 arr2로복사하고 10칸으로늘린후 실제  2명의 학생을 추가해본다===========================================================================================================");
		// 10개의 공간을만들었따 기존의 데이터를 복사해 넣고 값이없는 나머지 빈자리를 넉넉히만들어두고 데이터를추가한다.
		arr2[3] = new Student(4, "장영실");
		arr2[4] = new Student(5, "이황");
		System.out.println(Arrays.toString(arr2));
		System.out.println("=======================arr1을 arr2로복사하고 10칸으로늘린후 실제  2명의 학생을 추가해본다끗=========================================================================================");
		System.out.println("");
		System.out.println("=================================================arr 와  arr2 비교하기위해 출력시작============================================================================================================================");
		System.out.println("arr  ==> "+Arrays.toString(arr));
		System.out.println("arr2 ==>"+Arrays.toString(arr2));
		System.out.println("========================================arr 와  arr2 비교하기위해 출력끗==========================================================================================================");
		System.out.println("");
		
		
		
		// 2. 중간의 학생 1명 삭제
		// 데이터는 중간의 빈자리 없이 관리해야된다. 하지만 이런식으로하면 앞뒤의 데이터는그대로이고
		// 널 처리한 데이터자리만 널이된다.
//		arr2[2] =null;//이 런 공백 빵꾸 방식을 안하려면 다음과같이복잡한 수작업으로 처리해야한다.
		System.out.println("===================================중간의 학생 1명[3]번자리 삭제 시작==========================================================================================================");
		//예제 세종대왕 이 전학을간상황
		//arr[2] =null;
		//이렇게하면 0, 1 은데이터가있고 그뒤 2자리는 null을 출력하고 뒤에는 그대로다
		//이렇게 데이터는 중간에비었을때 null이아닌 빈자리를 있는데이터들이 땡겨와야한다.
		//그를위해 다음과같은과정이필요하다
		arr2[2] = arr2[3];
		arr2[3] = arr2[4];
		arr2[4] = null;
		//데이터를지우기위한 부분을 맨뒤로옮기고 널을넣어서 전학처리한다.
		System.out.println(Arrays.toString(arr2));
		System.out.println("===================================중간의 학생 1명 삭제 끗==========================================================================================================");
		System.out.println("");
		
		
		// 3. 중간에 학생 1명 추가 : new Student (6,"뻉덕어멈"); 6번째뻉덕어멈이 0번째자리에들어가고싶다고가정해보자.
		arr2[4] = arr2[3];
		arr2[3] = arr2[2];
		arr2[2] = arr2[1];
		arr2[0] = new Student(6, "뺑덕어멈");
		System.out.println(Arrays.toString(arr2));

	}

	
	
	//LIST활용 방법 강의 메서드
	
	//
	//JAVA.UTIL.LIST 인터페잇
	//JAVA.UTIL.ArratList 구현클래스
	//
	public void test1() {

		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList();
		Collection list3 = new ArrayList();

		
		// 맨마지막에 요소 추가 add
		list1.add("안녕");
		list1.add("123");
		list1.add("123.456");
		list1.add(true);
		list1.add(new Date());
		list1.add(new Student(1, "고주몽"));
		list1.add("123");
		// 중복 저장 가능
		// toString override 되어있음. 중복허용한다.

		
		//list1츨력
		System.out.println("============list1출력시작==============");
		System.out.println(list1);
		System.out.println("============list1출력끗==============");
		System.out.println("");
		
		
		// 저장된 요소의 개수
		System.out.println("============리스트내의 객체 숫자 출력시작==============");
		System.out.println(list1.size() + "개가저장되어있습니다.");
		System.out.println("============리스트내의 객체 숫자 출력끗==============");
		System.out.println("");

		
		// 중간에 요소 추가
					//중간 3번에 false를 추가한다
		list1.add(3, false);
		// 반복문을 통해 요소에 접근가능 " 인덱스 사용가능
		//리스트는 배열로  인덱스접근이가능하다
		System.out.println("===============반복문을통한 요소접근시작==========");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + " : " + list1.get(i));
		}
		System.out.println("===============반복문을통한 요소접근끗==========");
		System.out.println("");

		
		// 삭제 remove
		//true가날라가고 false가 앞당겨온다
		list1.remove(3);
		System.out.println("===============요소3번제거후 반복문을통한 요소접근시작==========");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + " : " + list1.get(i));
		}
		System.out.println("===============요소3번 제거후 반복문을통한 요소접근끗==========");
		System.out.println("");
		//요소3번을 지우고 빈자리를 존재하는 데티어로땡겨오는 역할까지 수행
		
		//중간에 요소 추가
		//제거했던 3번요소 false를 다시추가하면 역시나 3번에 끼워넣고 뒤엣데이터들은 쭊밀린다
		list1.add(3, false);
		System.out.println("===============요소3번제거후다시 추가후 반복문을통한 요소접근시작==========");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + " : " + list1.get(i));
		}
		System.out.println("===============요소3번 제거후다시 추가 반복문을통한 요소접근끗==========");
		System.out.println("");
	}
	

	//
	// Generics 타입 제한
	//
	// 기본형을 사용할 수 없다.
	//
	// int 사용못한다 Integer사용해야된다.
	// .
	// .
	private void test2() {
		//List is a raw type. References to generic type List<E> should be parameterized리스트에뜨는 밑줄 
			//LIST는 < > 제네릭 타입제한을 < > 을통해 사용해야되는데 그렇게 사용하지않으면 경고문구가 뜬다  <  >  =>타입 파라미터 ,타입변수라고한다
			//제네릭타입작성필요한 클래스 사용시에 작성핮비않으면 최상위 object타입으로반환을하게된다
		List list1 = new ArrayList();
//		List<object> list1 =new ArrayList(); 타입을안쓴건 이와같다.
		list1.add("안녕");
		list1.add("123");
		
						//LIST.GET 해당요소를 꺼내올수있다. 반환값은 object이다
		Object e1 = list1.get(0);
		Object e2 = list1.get(1);
							//e1.length 는 오브젝트타입이기 때문에 하위 String 을 사용하고싶으면 하위 형변환을해주어야된다.
		System.out.println(((String) e1).length());
		//일엏게쓰는 방식은 사실 좋은방식은아니다.

		
		// 다형성 적용(여러타입을 막담지않으려고 사용하는것이 제네릭이다 = >아래문구에선 String을 담겠다는것이다.
		//<String>===> 요소의 타입을 타입변수 String으로 제한하느것이다.
		List<String> list2 = new ArrayList<String>();
		// 제네릭의 사용 예 <String>타입 변수 지정 :요소의 타입 제한

		list2.add("안녕");
//		list2.add(123);//스트링이아닌요소를 넣으면 컴파일오류가난다. ->>제네릭을 String타입으로 제한했기떄문이다.

		list2.get(0);
						//get메서드의 반환값이 object였지만 제네릭 변수값을 <String>으로 강제화해주었기떄문에 
						//반환값이 String 으로 변하였다.
		String s1 = list2.get(0);
						//위와달리 리턴타입이 object가아닌 String 이기떄문에 우리는 해당 객체를 바로 s1.length를통해 사용가능하다
		System.out.println(s1.length());

		
		// Wrapper Class
//		List<int> list3 = new ArrayList<int>();//안된다.
		List<Integer> list3 = new ArrayList<Integer>();// 안된다.
		list3.add(31);// 31->new Integer(31) ; auto -boxing
		int num = list3.get(0); // new Integer(31) -> 31: aouto -unboxing
		System.out.println(list3);
	}
	
	
	
	public void test3() {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "홍길동"));
		list.add(new Student(2, "신사임당"));
		list.add(new Student(3, "세종대왕"));

		// 1.학생 2명 추가

		list.add(new Student(4, "장영실"));
		list.add(new Student(5, "이황"));

		// 2. 중간의 학생 1명 삭제.

		//=========================이부분 테스트4 번하다 다시와서 강의하는내용===============
		//list.remove(new Student(6, "뺑덕어멈"));// 이렇게하면 지워지진않는다.
		// 객체를 전달해 삭제하려면, 전달한 객체와 저장된 객체의 동등성을 인정받아야한다.
		// 두객체의 equals비교 결과가 true가 나오도록 equals 오버라이딩해야한다.
		// 두객체의 equals 비교 결과가 true 여야 한다.
		System.out.println("===========");
												//이퀄즈는 두객체가 동일한지를 true ,false의 불리언값으로 반납한다.
												//그냥이퀄즈를 사용하면 object의 이퀄즈를 사용하는것이다. 그렇기에
												//우리는  object의 이퀄즈를 오버라이딩하여 사용해주면 문제가해결된다.
												//
		System.out.println(new Student(3, "세종대왕").equals(new Student(3, "세종대왕")));
		// 같은지아닌지를 출력하는 구문  booleadn 값을 반환하여 이경우 true  가발생
		System.out.println(list.remove(new Student(3, "세종대왕")));
		//리무브가 true값을 반환하면 삭제하게 되어있다. 그래서여기서도 결국 true반환
		
		//해싀 코드가 기본적으로는다르다 그러나 hashcode도 오버라이드 하여 이경우도수정해준다.
		//Student.java 안에 hashcode 메서드 오버라이딩 수정
		System.out.println(new Student(3, "세종대왕").hashCode());
		System.out.println(new Student(3, "세종대왕").hashCode());
		
		
		//  								오브젝트 이퀄즈를 Student.java 클래스에서 오버라이딩해주어서 정상작동한다.
		System.out.println(list);
		//=========================이부분 테스트4 번하다 다시와서 강의하는내용===============

		// 3. 중간에 학생 1명 추가 :new Student(6,"뺑덕어멈");
		list.add(0, new Student(6, "뻉덕어멈"));

		for (Student s : list) {

			System.out.println(s);
		}
	}

	
	//list의 추가적인사용 기능 연습 메서드
	public void test4() {
		// 객체 할당부(우항) 제네릭 타입은 샌략이 가능 //이부분 인티저는 생략가능 :이유는 좌항의 제네릭이있어 생략가능
		// JDK1.7이상에서 추가된기능.
		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(4);
		System.out.println(list);
		System.out.println("");
		
		System.out.println("=====1번자리에 100을 추가하기=====");
		// 두번째자리에 채워넣고싶을때
		list.add(1, 100);
		// 인덱스 , new Integer(100)으로 오토박싱이되어 들어간다.
		System.out.println(list);
		System.out.println("=====1번자리에 100을 추가하기끗===");
		System.out.println("");

		// 삭제메소드
		// (remove)
		//
		// 1.index 로 삭제
		list.remove(3); // 3번 인덱스삭제
		System.out.println("======3번지 3 삭제======");
		System.out.println(list);
		System.out.println("=====3번지 3 삭제=====");
		System.out.println("");

		// 2. 동등 객체로 삭제 : 객체가 가진 값이 동일한 객체 (equals 가동일한 객체)
							//인티저 100을 삭제하는것이다
		list.remove(new Integer(100));
		// 0인덱스부터 끝까지가면서 처음만난 100를 날려준다
		// 수정 :해당인덱스의 객체를 제공된 매개인자로 대체
		System.out.println("====Integer 100 삭제======");
		System.out.println(list);
		System.out.println("====Integer 100 삭제======");
		System.out.println("");
		
		
		//수정 : 해당인덱스의 객체를 제공된 매개인자로 대체  1번자리에있던 2가 888로바뀌었다.
		System.out.println("=======기존 1번자리의 2를 888로 수정한다.=====");
		list.set(1, 888);
		System.out.println(list);
		System.out.println("=======기존 1번자리의 2를 888로 수정한다.=====");
		System.out.println("");
		
		
		// 다른 Collection 객체 추가
					//어나더라는 객체를 위의 list 에추가해본다.
		List<Integer> another = new ArrayList<>();
		another.add(7);
		another.add(8);
		another.add(9);
		
		System.out.println("===기존 list 출력값===\n"+list);
		System.out.println("=====새로운 another출력값====");
		System.out.println(another+"\n=====새로운 another출력값====");
		System.out.println("");

		//list에 another객체를 모두 추가하는 메서드이다 (addAll)
		list.addAll(another);
		System.out.println("=====list에 another객체의 요소를 전부추가한값 출력======");
		System.out.println(list);
		System.out.println("=====list에 another객체의 요소를 전부추가한값 출력종료======");
		System.out.println("");
		
		// 매개인자 요소를 포함하고 있는가.(동등객체조건이 가춰져야된다,) :boolean 리턴
		System.out.println("=====contais(9) list안에 9를 포함하는가 트루 폴스 리턴 ======");
		System.out.println(list.contains(9));
		System.out.println("");
		
		// 매개인자 요소가 몇번지에 있는가 :index값을 리턴하는것이 indexof
		// 9라는 매개인자요소가 몇번지에있니 8번째에있다 출력
		System.out.println("======indexOf(9) 9가 몇번 인덱스에있는가===========");
		System.out.println(list.indexOf(9)+"번지 안에있습니다.");
		System.out.println("");
		
		// 없다면 -1 을 뱉어낸다
		System.out.println("========indexOf(900) 이 몇번에있는가 =>없으므로 -1을 뱉어낸다. ==========");
		System.out.println("("+list.indexOf(900)+")<==indexOf(900) 괄호안의 숫자(900)가 없을시에 -1을 뱉어냅니다.");
		System.out.println("");
		
		// 모든요소를 열람한다.
		// 기존포문 포이치문 iterator방식가능
		// iterator 방식 실습
								//list를 이터레이터방식으로 만든다
		Iterator<Integer> iter = list.iterator();
		System.out.println("====iterator 방식을 시험해봅니다 ========================");
		System.out.print("iterator의 결과==>   ");
		while (iter.hasNext()) {
				//있으면 true 없으면 false
			Integer i = iter.next();
			System.out.print(i + " / ");
		}
		System.out.println("");
		
		//리스트가 비어있는가?
		System.out.println("");
		System.out.println("=====list.isEmpty() 리스트안의 요소가비어있는가를 질문하는 메서드 (반환값은불리언)========");
		System.out.println(list.isEmpty());
		System.out.println("");
		
		// 모든요소 삭제
		System.out.println("=========모든 요소를 삭제해본다 list.clear() ========");
		list.clear();
		System.out.println("삭제완료");
		System.out.println("========모든요소 삭제후 isEmpty()를통해 비어있는지를 확인해보자======");
		System.out.println(list.isEmpty()+"<======모두비어져있다는 뜻");
		System.out.println("");
		   System.out.println("===========test4 부가기능들 공부 끗=======================");

	}

	
	
	//	정렬 관련 메소드 (list)
	//		두가지 방식의 정렬 규격이있따.
	//	 
	//	 1. Comparable 인터페이스
	//		-기본정렬(한가지) 클래스에서 구현. CompareTo메소드 오버라이딩
	//	 2. Comparator 인터페이스
	//		-기본정렬외에 추가적으로 정렬기준을 제시해야할때.
	//			별도의 컴페어러터 구현 클래스를 작성한다. =>갯수제한 X
	//			내부적으로 Compare 메소드 오버라이딩하게된다.
	private void test5() {
		//리스트에는 정렬이중요하다 이유는 리스트만 정렬 기능이가능하다. 제일중요한기능
		List<String> list =new ArrayList<>();
		list.add("허허허");
		list.add("가버려");
		list.add("다나가");
		list.add("나나나~");
		list.add("b");
		list.add("a");
		list.add("z");
		list.add("1");
		list.add("4");
		list.add("6");
		list.add("2");

		System.out.println("=====기본정렬없이 그냥 출력해본다===================================");
		System.out.println(list);
		System.out.println("");
		
		
		//정렬 메소드 호출
		System.out.println("======Collections.sort 를이용하여 사전등재순에따라 기본정렬을할수잇다=========");
		Collections.sort(list);//기본 정렬 기준에 따라 정렬
								//사전등재순 가나다순 abc순...
		System.out.println(list);
		System.out.println("");
		
		
		//사전 등재 역순 :별도의 정렬 기준객체를 만들어줘야한다.
		Comparator<String>comp =Collections.reverseOrder();
								//컬랙션의 기본 뒤집 기능 reversOder()
		//컬랙션의 기본 뒤집 기능 reversOder()의 기능을갖는 comp를 참조해서 list를 렬하라는 뜻
		System.out.println("======위에 올바르게 정렬된 list를 다시 뒤집어서 역순으로 출력해본다.======");
		Collections.sort(list,comp);
	   System.out.println(list);
	   System.out.println("===========test5정렬공부 메서드 끗=======================");
	}

	
	
	// 커스텀 클래스 정렬하기
	//
	public void test6() {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(3, "세종대왕"));
		list.add(new Student(2, "신사임당"));
		list.add(new Student(5, "이황"));
		list.add(new Student(4, "장영실"));
		list.add(new Student(1, "홍길동"));
		System.out.println("===========================정렬안된 리스트 그대로 출력하기============================");
		System.out.println(list);
		System.out.println("");
		
		
		//정렬 기본정렬
		//1. 학번오름차순
		//Collections.sort(list);//오류가난다.
//The method sort(List<T>) in the type Collections is not
//		applicable for the arguments (List<Student>)	
		//정렬기준이없어서 오류가난다.
		//====>sTUDENT가 기본정렬 기능을가지고있지않기떄문에 오류가난다 해당부분을 수정해주기위해 Student.java파일의 클래스명을 수정해준다
		
		System.out.println("======================================학번 오름차순-=======================");
		Collections.sort(list);
		System.out.println(list);
		list.sort(null);
		//기본 정렬인 경우 Comparator 객체 필요치 않게됬다.
		System.out.println(list);
		System.out.println("");
		
		//학번 내림차순
		System.out.println("==================================--학번 내림차순-========================-");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println("");
		
		
		//커스텀 정렬을 하고싶다. 의경우 예제
		//추가적인 정렬기준 생성하기
		//1.이름 오름차순차순
		System.out.println("================================이름오름차순 가나다순=============================");
		Comparator<Student> comp =new StudentNameAscending();
										//해당 클래스 직접 만들어준다 =>컴페어러터 구현채만들기다
		Collections.sort(list,comp);
		System.out.println(list);
		System.out.println("");
		//2. 이름 내림차순
		System.out.println("==============================이름 내림차순 가나다 역순=========");
		Comparator<Student> comp2 =new StudentNameAscending().reversed();
		
		Collections.sort(list,comp2);
		System.out.println(list);
		System.out.println("");
		System.out.println("================================정렬메서드 사용 test6메서드 종료==================================");
		
	}
	
	//concurrentModificationException 동시적 수정예외
	public void test7() {
		
	List<Student> list = new ArrayList<>();
		
		list.add(new Student(3, "세종대왕"));
		list.add(new Student(2, "신사임당"));
		list.add(new Student(5, "이황"));
		list.add(new Student(4, "장영실"));
		list.add(new Student(1, "홍길동"));
		System.out.println("===========================정렬안된 리스트 그대로 출력하기============================");
		System.out.println(list);
		System.out.println("");

//		System.out.println("======forEach문으로 리스트를 출력해본다======================");
			//5번학생을지우고싶은상황인데 아래와같이는 할수없다.  ==>5번 학생의 인덱스를 알아내면 과정해결가능하다.
//	//		for(Student s:list) {
//			if(s.getNo()==5)
//			System.out.println(s);
//			//이렇게하면 에러가난다
//			//java.util.ConcurrentModificationException
//			//이유는 리스트를 전체적으로 순회하고있는데 리스트값을변경하면 에러가발생한다.  이렇게 할순없다.
//			list.remove(s);
//		}
		
		//5번학생 제거
//		int idx =-1;
//		for(Student s :list) {
//			if(s.getNo()==5)
//				idx=list.indexOf(s);
//		}
//		System.out.println("5번학생의 인덱스는 :"+idx+" 입니다.");
			//===>위해당구문을 일반포문으로 바꿔본다. =>이유는 일반포문이더 깔끔하고직관적이다.
		System.out.println("===========5번학생의 인덱스를 찾아본다===========");
		int idx =-1;
		for(int i =0 ; i<list.size();i++) {
			if(list.get(i).getNo()==5)
				idx=i;
		}
			System.out.println("5번학생의 인덱스는 :"+idx+" 번 입니다.");
			System.out.println("5번학생 이황을 삭제했습니다.");
			list.remove(idx);
			System.out.println("======5번학생 삭제후 리스트출력======");
			System.out.println(list);
	}



}