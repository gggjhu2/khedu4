package kh.java.array.person;


//
//	data를 담을 용도의 클래스
//
//	VO value object class
//	Entity class (database)
//	Do class	 (domain object class)
//  Dto class	 (data transfer object class)
//  Bean
public class Person {
	
	private String name ;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println(name+" , " + age);
		
	}

}
