package kh.java.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//
	// collection - set - hashset
	//	중복을 허용하지않는다. 저장된 순서를보장하지않는다.
	//
	//	LinkedHashSet : 중복허용하지 않는다. 저장된 순서 유지   
	//	TreeSet 	  : 중복혀용하지 않는다. 오름차순 정렬 유지
	//
	//
	//
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSetTest hs =new HashSetTest();

		//해쉬셋 사용하기 첫 공부 메서드
//		hs.test1();
		
		//리스트의 중복을 리스트를 셋으로바꿈으로 해결할수있는방법 공부 메서드
//		hs.test2();
		
		//중복제거관련해서 추가적으로연습을해보는 메서드이다. (커스텀클래스 처리)
//		hs.test3();
		
		//lenkedhash set =중복허용안함
		//treeset 		==오름차순정렬 중복허용안함
//		hs.test4();
		
		//실습문제 로또숫자 출력하기 1~45 사이의 중복없는 난수 6개를 오름차순정렬해서 출력하세요.
		hs.test5();
		
		
	}

	private void test1() {
		
		//다형성을 적용해서 만들수있다.
		HashSet<Integer> set1 =new HashSet<>();
		Set <String> set2 =new HashSet();
		Collection<Double> set3 = new HashSet<>();
		

		//요소 추가
		set2.add("안녕");
//		set2.add(123);//제네릭 덕분에 다르타입의 오소는 추가가 불가능하다. ==>set2는 스트링만 받게 제네릭스트링설정되어잇따.
		set2.add("hello world");
		set2.add("zzz");
		set2.add("zzz");
		set2.add("ㅋㅋㅋ");
		set2.add("123"); //숫자가아니라 문자열이다
		
		
		//저장된 요소 개수 확인
		System.out.println("======set 사용해보기(set2에요소추가) 첫 시도=====");
							//요소의 갯수를 알려주는 메서드
		System.out.println("요소는 모두 "+set2.size()+"개입니다.");
		System.out.println(set2);
		System.out.println("==========================");
		System.out.println("");
		
		
		//인덱스 통한 요소 가져오기는 지원하지 않는다.
		//가져올때는 반복문을 통한 전체열람만 가능하다.
		//일반포문은 사용불가.
		//1.포이치문은 가능하다.
		System.out.println("===포이치문을통한 접근만 가능하다 객체 일반포문사용불가.===");
			//포이치문사용 
		for(String s : set2) 
		System.out.println(s);
		System.out.println("=======================");
		System.out.println("");
		
		
		//2.iterator 객체
		//	(순차적접근가능하게만들어놓은 전통적인 메서드)
		
		System.out.println("=====이터레이터사용=====");
							   // ㅁㅁ .iterator();를 우항에 대입해서 사용할수있다.
		Iterator <String> iter =set2.iterator();
		//해스모어 토커나이저와 사용방식이비슷하다. 포인트를가르켜다음거를 출력하는방법이다
		while(iter.hasNext()) 
			{
			String s =iter.next();
			System.out.println(s);
			}
		System.out.println("=========단순 총 출력 set2그냥출력==========");
		System.out.println(set2);
		System.out.println("=====================================");
		System.out.println("");
		
		//삭제  :동등한 객체를 찾아 삭제   (동등한객체를 찾아 삭제하고 인덱스를통한 접근의 삭제가 불가하다.)
		//(equals &hashCOde override 가필수)
		System.out.println("===============\"zzz\" 삭제하기===========");
		set2.remove("zzz");
		System.out.println(set2);
		System.out.println("=============\"zzz\" 삭제 성공 ===============");
		System.out.println("");
		
		
		//전체삭제
		System.out.println("==========전체삭제(인덱스를통한삭제는존재하지않는다.)========");
		set2.clear();
		System.out.println(set2);
		System.out.println("=========요소 전체삭제 성공============================");
		System.out.println("");
	
		
		//비어있는지 검사
		System.out.println("=========비어있는지 검사 ㅁㅁ.isEmpty()사용하여 실행===========");
		System.out.println(set2.isEmpty());
		System.out.println("==================비어있으므로 true출력 성공 ===============");
	}

	
	//   List 와Set은 서로공통된조상 collection을 가지고있다.
	//  서로 변환해서 사용할수있다.
	//	List -> set		=> 중복을 제거할때 사용한다.
	//					
	//	Set  -> List	=> 정렬을 하기위해 사용한다.
	public void test2() {
		
		
		List <Integer> list =new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println("============list에 1,3,2,1,3,2,를대입한다. 중복 요소 저장이가능하고\n============저장순서가 유지된다.===============");
		System.out.println(list);
		System.out.println("=========list여서 모든요소가 입력한그대로의 순서대로 중복도 포함 다 들어가있다.============");
		System.out.println("");
		
		
		//겹치는것 제거 하기위해 SET으로 변환
						//해쉬셋 에 list를넣어서 list를 해쉬셋으로 변환할수있다.
									//값대입 list값요소를 전체 대입해서 set으로변환한다
		Set <Integer> set =new HashSet<>(list);
										//해당메서드에 리스트를 넣는다.
		System.out.println("=========[중복제거 를위해 셋으로 변환해본다]============");
		System.out.println(set);
		System.out.println("===============중복제거 성공하였다 => list가 셋으로된것이다.=======\n");
		//중복제거 성공
		
		
		
		//list변환 :내림차순 정렬
		System.out.println("========오름차순 정렬 컬랙션스.소트. 리버스오더로 내림차순으로정렬해본다.=========");
										//위에 생성해놓은 set을 그대로 전달해준다.
		List <Integer> list2 = new ArrayList<>(set);
				//소트는 오름차순정렬
		System.out.println("==오름차순==");
		Collections.sort(list2);
		System.out.println(list2);
		//소트를 통해 오름차순정렬을한것을 리버스오더로 뒤집어서 내림차순으로바꾼다.  
		/*sort를통한 오름차순출력===>*/System.out.println("===내림차순==");
		Collections.sort(list2, Collections.reverseOrder());
		/*내린차순 출력===>*/		System.out.println(list2);
		//list.sort ~~~~도 같은결과 다.
		System.out.println("");
		System.out.println("===list의 형변환 공부 예제 메소드 끗 =====");
		System.out.println("list는 중복도 다 요소가들어간다 해당부분에서 중복된부분을\n제거하고싶을때는 set으로바꿔서해결할수있다.");
		
	}

	
	
	//
	// 커스텀 클래스 중복처리
	public void test3() {
		//퍼슨 이없으므로 만들어준다 같은패키지에 Person.java 클래스생성==>작성해준다 따라가서 퍼슨클래스를 작성해본다.
		
		Set<Person> set =new HashSet<>();
		
		Person hong = new Person("홍길동");
		set.add(hong);// 밑밑 줄의 홍길동과는 전혀다른 주소값을가지는 "홍길동" 값만똑같은  별도의 객체이다.
		System.out.println(hong.hashCode());
		Person sin = new Person("신사임당");
		set.add(sin);
		System.out.println(sin.hashCode());
		System.out.println(sin.equals(hong));
		
		Person hong2 = new Person("홍길동");
		System.out.println(hong2.hashCode());
		set.add(hong);//==>set은 중복이안되므로 중복 요소삽입이안된다. 그러나 위의 홍길동과 밑의 홍길동은 다른별개의 객체이다.
		System.out.println(set.hashCode());
									  //이럴때 홍길동 들이 같을때 해쉬코드도 동일하게해주는 hashcode &equals 오버라이드를 통해서 해결해준다.
									  //==>Person.java 파일로 가서 오버라이드 문을 작성해주어 해결해본다.
		//홍길동이 중복되어 삽입이된다.
		//SET이면 중복이안되는데 삽입이되는이유는. 외부적으로는 값이같지만
		//내부적 해시코드를봤을때는 다른 참조변수(필드값) 스트링이기때문이다.
		//이를 해결하기위해서는 펄슨의 이퀄즈 해쉬코드를 오버라이드하여야한다. 퍼슨 클래스에서이어서진행
		//hashcode 오버라이딩을 하지않았다.
		//이또한해줘야한다.
		
		System.out.println(set);
	
	}
	
	//
	// LinkedHashSet
	// TreeSet
	//
	public void test4() {
		
		Set <Integer> set1 =new LinkedHashSet<>();
		set1.add(34);
		set1.add(25);
		set1.add(100);
		set1.add(1);
		set1.add(34);
		//저장한 순서 그대로유지되나 인덱스접근은 여전히안된다.
		System.out.println("====se1에 임의의 숫자저장 인덱스접근불가=====");
		System.out.println(set1);
		System.out.println("");
		
		
										//요소 입력대신 set1을 그대로 사용한다.
		Set <Integer> set2 = new TreeSet<>(set1);
		//정렬이 필요하여 트리셋을 이용하였다 (오름차순정렬지원)
		System.out.println("========treeset 으로정렬을 해보았다.========");
		System.out.println(set2);
		System.out.println("=======treeset은 오름차순 정렬을 지원한다.======");
	}

	
	
	//@실습문제
	//
	//	로또 숫자 출력하기
	//
	//	1~45 사이의 중복없는 난수를 오름차순 정렬해서 출력하세요.
	public void test5() {
		
		Set<Integer> set = new TreeSet<>();
		System.out.println("==========학생들 푼거 참조한 방식======");
		while(true) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
			if(set.size()==6) {
				break;
			}
		}
		System.out.println(set);
		System.out.println("");
		
		
		System.out.println("========선생님 코드=========");
		Set<Integer> lotto = new TreeSet<>();

		while(lotto.size()<6)
			lotto.add((int)(Math.random()*45)+1);
			System.out.println(lotto);
	}

		
	}

