package kh.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kh.java.collection.set.Person;

/**
 *
 * Map
 * key, value 한쌍으로 요소를 구성한다.
 * key를 통해서 value를 접근해 사용.
 * key는 중복을 허용하지 않는다. value는 중복되어도 좋다.
 * 
 * 동일한 key로 추가 저장하면, 나중 value로 치환된다.  <====set 하고 다른점이다. 이부분을주의한다.
 *
 */
public class HashMapTest {

	public static void main(String[] args) {
		HashMapTest h = new HashMapTest();
		//맵의 사용방법과 다양한 기능들 공부 메서드	
//		h.test1();
		
		//전체 요소 열람하기 공부 메서드.
		//map을 set에 넣어서 출력 , entryset을 이용하여출력하는 방법을 공부해본다.
		h.test2();
	}
	
	

	private void test1() {
		
		
		//<K, V> 두개의 제네릭을 사용
		//key로 Integer만 허용.
		//value로 String만 허용.
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, Character> map2 = new HashMap<>();
		//요소추가
		//============ㅁㅁㅁㅁ.put( x, y )   와같은방식으로 값을 넣을수이싿 x는 인트만되고 y는 스트링만되며 
														//		x는 키 값이고  y는 벨류값이다.
		map1.put(1, "홍길동");
		map1.put(2, "신사임당");
		map1.put(3, "세종대왕");
		System.out.println("======map1에 요소 3개를 추가해봤다. =========");
		System.out.println(map1);
		System.out.println("");
		
		
		//요소가져오기		//ㅁㅁ.get(1)==>1번 키값을 가져온다.
		String s1 =map1.get(1);
		System.out.println("======aa.get( * ) 괄호안의 키값을넣어서 해당키와 짝인값을 가져온다.=======");
		System.out.println(s1);
		System.out.println("");
		
		//동일한 키값으로 요소 추가하면 어떻게되나.
		//동일한 카로 추가저장하면 나중 벨류로치환된다.
		System.out.println("=========2번 키에 신사임당이있는상황에서 장영실값을넣어본다.==================");
		map1.put(2, "장영실");
		System.out.println(map1);
		System.out.println("=========2번 키에 기존값이잇덯라도 바뀐다. 결국 신사임당은 장영실이된다.=========");
		
		
		HashMap<Character, Person> map3 = new HashMap<>();
		Map<Character,Person> map4 = new HashMap<Character, Person>();
		map4.put('a', new Person("Aida"));
		map4.put('b', new Person("Bob"));
		map4.put('c', new Person("Clain"));
		map4.put('d', new Person("David"));
		
		System.out.println("==========map4 를 출력해본다=======");
		System.out.println(map4);
		System.out.println("");
		
		
		//equals &hashcode overriding 을 전제로한다.
		//특정 키 값이 존재하는가? 기능매서드
		System.out.println("=========해당맵에 ( 'a' ) 의 키값이존재하는가 ===========");
		System.out.println(map4.containsKey('b'));//	==> 'b' 키값이 존재하는가 존재하면 true==>true
		System.out.println("=========해당맵에 ( 'x' ) 의 키값이존재하는가 ===========");
		System.out.println(map4.containsKey('x'));//	==> 'x' 키값이존재하는가 존재안하면 false==>false	
		System.out.println("=========ㅇㅇㅇ.containsKey( 'ㅁ') 명령어로 구분가능 ======");
		
		
		//특정 value가 존재하는가.
		System.out.println("=====mp4안에 \"David\"가 존재하는가===========");
									//이부분 위에서는 그냥 확인하고 이부분은 new Person하는이유는 "David"가 참조형 스트링 객체라서그런건가요...?
		System.out.println(map4.containsValue(new Person("David")));  // ==> "David" 가존재하는가 존재하면 true==>true
		System.out.println("=====mp4안에 \"chals\"가 존재하는가===========");
		System.out.println(map4.containsValue(new Person("chals")));  // ==> "chals" 가존재하는가 존재하면 false==>false
		System.out.println();
		
		Person p1 =map4.get('b');
		System.out.println(p1 + ", " +p1.hashCode());
		map4.put( 'b' , new Person("bill"));
		System.out.println(map4.get('b'));
		System.out.println("==========값을바까도 이퀄즈 해싀코드에의해 해싀코드는 그대로이다...?======");
		System.out.println(p1 +", " +p1.hashCode());
	}
	
	
	//전체요소 열람하기 공부메서드
	//1.key 값을 set에 담기
	//2.key,value 한쌍을 set에담기.
	// 1 , 2 와같이 하는이유는 맵에는  순서를정하거나 일정한규칙에의 해 요소들을 보여주는 기능이없다.
	// ==> 그래서 map의 k값 or key,value값을 쌍으로 가져와서 set에담아서 set의 열람기능 메서드를 활용하면
	//	   map의 의 값들도 set의 기능을 빌려 열람이가능하다.
	public void test2() {
		
		//Map 에 키 벨류값  대입하기.
		Map<String, Person> map =new HashMap<>();
		map.put("honggd" ,    new Person("홍길동"));
		map.put("sinsa" ,	 new Person("신사임당"));
		map.put("sejong" ,   new Person("세종대왕"));
		map.put("jys" ,		  new Person("장영실"));
		
		//순서대로 꺼내오는방식을 사용하고싶을때 사용예시  두가지 방식을해본다
		//1.keySet : key 집합
		Set<String> keySet =map.keySet();
			//iterator 사용방식
		Iterator<String> iter =keySet.iterator();
		System.out.println("=======키 밸류  값대입 출력을 해보자.=========");
		while(iter.hasNext()) {
							//순차 출력을위한 이터레이터 사용방식 ==>숙달 공부
			String Key =iter.next();
							//키값 받는변수 
			Person value =map.get(Key);
			System.out.printf("Key = %s, value =%s%n" ,Key,value);
		}
		System.out.println("");
		
		
		//KetSet +forEach 방식을이용하여 출력해보자
		System.out.println("=========KetSet +forEach 방식을이용하여 출력해보자========");
		for(String key: keySet) {
			Person value =map.get(key);
			System.out.printf("Key = %s, value =%s%n" ,key,value);
		}
		System.out.println("");
	
		
		//2 . Map.Entry(Ket.value 한쌍) Set 방식 사용방법
				//java.Map.Entry 임포트해본다.
		Set<Entry<String, Person>> entrySet = map.entrySet();
		  //E~~~~~~~~~~~~~~~~~~~~> 여기까지가 요소이다.
		//entrySet + forEach
		System.out.println("===================\nMap<String, Person> map =new HashMap<>();\r\n" + 
				"		map.put(\"honggd\" ,    new Person(\"홍길동\"));\r\n" + 
				"		map.put(\"sinsa\" ,	 new Person(\"신사임당\"));\r\n" + 
				"		map.put(\"sejong\" ,   new Person(\"세종대왕\"));\r\n" + 
				"		map.put(\"jys\" ,		  new Person(\"장영실\"));"+"\nmap 을"+
				"Set<Entry<String, Person>> entrySet = map.entrySet();\n"+
				"이런사용법으로 엔트리셋을이용하여 요소를 foreadch문을이용하여 전부출력해본다\n"+"======================");
		System.out.println("");
		System.out.println("==>아래와같이 출력이가능하다.");
		for(Entry<String,Person>entry : entrySet) {
			//여기부터 여기까지가 전부요소이다	//			
			String key =entry.getKey();
			Person value=entry.getValue();
			System.out.printf("Key = %s, value =%s%n" ,key,value);
		}
		
		
		//entrySet +iterator 를 이용해서 처리해본다.
		Iterator<Entry<String,Person>>iter2 =entrySet.iterator();
			///entrySet +iterator 를 이용해서 처리해본다.
		System.out.println("\n=========== entrySet +iterator 를 이용해서 처리해본다.===========");
		System.out.println("=========================================================");
		while(iter2.hasNext()) {
			Entry<String, Person> entry = iter2.next();
			String key =entry.getKey();
			Person value =entry.getValue();
			System.out.printf("Key = %s, value =%s%n" ,key,value);

			
		}
	
		
		
		
	
	}

	
	
}
