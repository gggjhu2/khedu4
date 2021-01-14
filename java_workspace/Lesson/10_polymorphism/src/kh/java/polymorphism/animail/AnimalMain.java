package kh.java.polymorphism.animail;

public class AnimalMain {

	public static void main(String[] args) {

		AnimalMain am = new AnimalMain();
		// am.test1();
		// am.test2();
		// am.test3();

		// 다형성의 활용
		// 1.매개변수 선언부
		// am.test4();

		// 2.리턴값 처리
		// am.test5();

		// 동적 바인딩
//		am.test6();
		
		//추상 메소드
//		am.test7();
		
		//인터페이스 사용
		
		am.test8();
		
		
	}

	//
	// 자식 객체를 부모타입의 참조변수에 담아 제어할 수 잇다.(다형성)
	// 단, 자식클래스에 선언된 자원은 사용할 수 없다.
	//
	//
	//
	private void test1() {

		Cat cat = new Cat();

		cat.say();
		cat.punch();

		Animal animal1 = cat;

		System.out.println("cat ==animal1"); // 주소값 비교
		System.out.println(animal1);
		animal1.say();
//		animal1.punch();// 펀치는 쓸수없다. 부모타입 변수에담으면 자식클래스의 선언된 자원(필드,메소드)를 사용할수없다.

		Object obj1 = cat;
//		
//		obj1.say();		//이경우도 오브잭트 클래스안의 메서드만이 사용가능하므로
//		obj1.punch();	// 자식클래스의 선언된 메서드밑 필드를 사용할수없다.

		System.out.println(obj1.hashCode());

		// hashCode 는 오브젝트 클래스안의 메서드라 사용가능하다.

		// 다시 자식타입의 변수에 담으면 자식타입의 자원 사용가능.

		Animal animal2 = (Animal) obj1;

		animal2.say(); // 애니멀 타입에 담으면 애니멀 타입의 필드메서드를사용할수있게된다.

		Cat cat2 = (Cat) animal2;

		cat2.punch();
		cat2.say();

		// 이렇게하면 다사용가능하다.

		((Animal) obj1).say(); // 이럿게도 한줄로 줄여서 사용할수있따.

		((Cat) obj1).punch();

	}

	//
	// 객체 형변환의 두가지경우가잇따.
	//
	// -upCasting 부모타입으로 형변환을 업케스팅 암묵적 형변환(자동형변환)
	//
	// -downcasting 자식타입으로 형벼환을 다운캐스팅 (묵시적 형변환)
	//
	public void test2() {

		Animal animal = new Dog(); // Animal 타입으로 업캐스팅

		Dog dog = (Dog) animal; // down castigng 명시적 형변환

		dog.kick();

	}

	// Animal a =new Dog();
	//
	// Animal []
	//
	// 부모타입의 배열에 자식객체를 담을수 있다.
	//
	public void test3() {

		Animal[] arr = new Animal[3];

		arr[0] = new Cat();
		arr[1] = new Dog();
		//arr[2] = new Animal();
		arr[2] =new Cat();
		//Cannot instantiate the type Animal 
		//abstract 추상화 메소드 작성후 에러뜬다.
		//instantiate 추상화 =>추상클래스는 객체로만들어쓸수없다라는 에러메세지.

		// 출력문으로도 사용할수잇다 해당배열의 객체가 어드객체인지 판별할때 사용가능하다.
		//
		System.out.println(arr[0] instanceof Cat); // t
		System.out.println(arr[0] instanceof Dog); // f
		System.out.println(arr[0] instanceof Animal); // t
		System.out.println(arr[0] instanceof Object); // t

		// Animal anml =new dog();와같다.
		for (Animal anml : arr) {

			anml.say();
//			anml.punch();
//			anml.king();  //형변환후에만가능하다

//			((Cat)anml).punch();  

//			((Dog)anml).kick();  //이경우는 오류간난다
//kh.java.polymorphism.animail.Cat cannot be cast to kh.java.polymorphism.animail.Dog

			// instanceof 해당 타입의 객체인경우 true 리턴
			// true 가 리턴된 경우 , 해당 타입으로의 안전한 형변환 보장
			//
			// Cat 객체인 경우는 false
			//
			if (anml instanceof Cat) {

				((Cat) anml).punch();
			} else if (anml instanceof Dog) {

				((Dog) anml).kick();
			}

		}

	}

	// 매개 변수 선언부에서 다형성 활용하기.
	public void test4() {

		Cat cat = new Cat();
		Dog dog = new Dog();

		attack(dog);
		attack(cat);

	}

	public void attack(Animal animal) {

		if (animal instanceof Dog) {
			((Dog) animal).kick();
		} else if (animal instanceof Cat) {
			((Cat) animal).punch();
		}

	}

	//
	// 리턴값을 다형성 이용해서 처리하기.
	//
	public void test5() {

		makeCat();// 가능
		Animal cat = makeCat();
		Animal dog = makeDog();

		Animal[] arr = new Animal[100];

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();

		}

		for (Animal anm : arr)
			attack(anm);
	}

	public Cat makeCat() {
		return new Cat();

	}

	public Dog makeDog() {
		return new Dog();

	}
	

	
	// 동적 바인딩
	// 1. 상속& 부모클래스의 메소드 오버라이딩say
	// 2. 자식 객체 캣하고 도그를 부모타입으로 해당 메소드 호출하기.
	// ->자동으로 자식타입의 재작성한 메소드가 호출된다.
	//
	// 정적 바인딩
	//	동일한 타입의 메소드를 호출한다.
	//
	//
	public void test6() {
		
		
		Animal a1 =new Cat();
		Animal a2 =new Dog();
		
		a1.say();
		a2.say();
		
		//다형성을 활용한 attck
		makeCat();// 가능
		Animal cat = makeCat();
		Animal dog = makeDog();

		Animal[] arr = new Animal[100];

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();

		}

		
		//실행
		for(Animal anm: arr)
			anm.attack();//동적 바인딩 자식클래스의 오버라이드한 메소드가 호출됨.
		
	}

	
	// 추상 클래스 Animal 
	//
	//
	public void test7() {
		
		//Animal a =new Animal();//추상클래스는 객체로 사용불가.
		Animal a= new Cat();
		Animal b= new Dog();
		Animal c= new Panda();
		//추상 클래스 animal을 상속한 자식 클래스는 무조건 추상메소드 attack구현을 보장받는다.
	
		a.attack();
		b.attack();
		c.attack();
		
	
	}

	
	
	//  인터페이스는 객체화 할 수 없다.
	//  인터페이스는 역시 부모타입으로 다형성을 적용할 수 잇다.
	//	
	//
	//
	public void test8() {
		
//		Runnable r = new Runnable();// 이렇게안된다는것이다.
		//Cannot instantiate the type Runnable
		
		Runnable r1 =new Dog();
		Runnable r2 =new Cat();
		
		r1.run();
		r2.run();
		
		//r1.sat();			// Animal 의 재작성 메소드(오버라이드) say
		//r1.attack();		// Animal 의 재작성 메소드(오버라이드) attack
		//r1.kick():		// Dog의 kick	
		
		((Dog)r1).say();
		((Dog)r1).attack();
		((Dog)r1).kick();
		
		System.out.println("===================");
		//상수
		
		System.out.println(Runnable.LEGS);
		
		
		Bitable b1 =new Dog();
		Bitable b2 =new Cat();
		b1.bite("멍멍");
		b2.bite("냐옹옹옹");
		
		System.out.println("==================");
		
		Dog d1=(Dog)b1;
		d1.attack();
		d1.bite("멍멍");
		d1.kick();
		d1.attack();
	
		System.out.println("================");
		
		Animal a1= d1;

		a1.attack();
		a1.say();
		
		
		System.out.println("=========독수리만들기==========");
		Eagle e1=new Eagle();
		Flyable e2 =new Eagle();
		Animal e3 = new Eagle();
		e2.fly("푸다닥푸다닥납니다");
		e1.attack();
		e3.attack();
		
		
	
	
	
	
	
	}


















}

