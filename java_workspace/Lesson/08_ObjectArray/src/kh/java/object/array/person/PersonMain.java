package kh.java.object.array.person;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
//		pm.test1();
//		pm.test2();
		pm.test3();

	
	}
	
	/**
	 * @실습문제
	 * 사용자 입력받아서 3명의 Person정보를 배열에 담고, 출력하세요
	 */
	public void test3() {
		
		//1.입력
		Scanner sc = new Scanner(System.in);
		Person[] arr =  new Person[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("---"+(i+1));
			System.out.print(i+1+"번. 이름 : ");
			String name = sc.next();
			System.out.print(i+1+"번. 나이 : ");
			int age = sc.nextInt();
			Person p =new Person(name, age);
			arr[i]=p;
		
		}
		System.out.println("============");
		
		for(Person p : arr)
			p.printPerson();
	}
	
	
	/**
	 * 초기화 객체 배열 선언
	 * 
	 */
	public void test2() {
		
		Person[] arr = {
				new Person("홍길동", 34),
				new Person("신사임당", 48),
				new Person("세종대왕", 67)
				 	
		};
		
		for(Person p : arr) {
			System.out.println(p.getName()+", "+p.getAge());
			//p.printPerson();
//			System.out.println(p); 이렇게하면 해당객체안에  스트링하고 인트가 담겨 제대로 출력이되지않는다.
		}
	}
	
	
	
	/**
	 * Person객체를 배열로 관리
	 */
	public void test1() {
		//1.객체 배열 선언
		Person[] arr = new Person[3];
		
//		for(int i=0; i<arr.length; i++)
//			System.out.println(arr[i]);
		
		//향상된 for문(for Each문) : index값 없이 요소에 바로 접근
		//for(Person p : arr) {
		//	System.out.println(p);
		//}	
		
		//2.객체를 각각 할당
		arr[0] = new Person("홍길동", 34);
		arr[1] = new Person("신사임당", 48);
		arr[2] = new Person("세종대왕", 67);
		
		
		//3. 출력
//		for(int i = 0; i < arr.length; i++) {
//			Person p = arr[i];
//			p.printPerson();
//		}
		//forEach문 사용
		//for(Person/*배열의 타입은 person으로 위에서 선언해주었다.*/
		//		p/*뒤 반복적으로담길 객체 퍼슨 p를만들어준다.*/ : arr/*반복적으로 접근할 객체*/) {
		//정리하면 다음과같다.
					for(Person p : arr) {
					//여기서p는 포이치문 안의 펴슨피 이며 
						//그것을 person 클래스의 printPerson 메서드를통해 출력하는 출력문이다.
						p.printPerson();
						
						System.out.println("▲퍼슨클래스의 프린스퍼슨 이용 출력	  	   |");
						System.out.println("|   			   	           |");
						System.out.println("|	       포이치문의변수명p를 단순 포이치문에서 출력  ▼");
						
//==>이부분질문입니다.선생님 	System.out.println(p);//그러나 위 예제에서 배열 값이 스트링과 인트를 같이 포함하고있기에 올바른 출력이되지않는다.	
//해결갑업은...??????
					}
		}
		
	
	
	
	
	public void test4() {
		
	
		
		
	}

}





