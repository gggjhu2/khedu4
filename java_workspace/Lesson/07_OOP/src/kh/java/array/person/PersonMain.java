package kh.java.array.person;

public class PersonMain {
	public static void main(String[] args) {
		
		PersonMain pm =new PersonMain();
		pm.test1();
		
	}
	
	
	
	public void test1() {
		
		//1.객체 배열 선언
		
		Person[] arr =new Person[3];
		
		//2.객체를 각각 할당
		
		arr[0] =new Person("홍길동",34);
		arr[1] =new Person("신사임당",48);
		arr[2] =new Person("세종대왕",67);
		
		
		//3. 출력
		
		for(int i =0 ; i <arr.length ; i++) {
			
			Person p =arr[i];
			p.printPerson();
		}
	}
}
