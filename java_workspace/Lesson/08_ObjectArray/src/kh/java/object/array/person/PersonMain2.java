package kh.java.object.array.person;

public class PersonMain2 {
	
	public static void main(String[] args) {
		
		
		PersonManager pm = new PersonManager();
		pm.inputPerson();
		pm.printPerson();
	}
}

//
//
//public void InputPerson() {
//    for(int i = 0; i < arr.length; i++) {
//          System.out.println("------"+ (i + 1) + "------");
//          System.out.print("이름 : ");
//          String name = sc.next();
//          System.out.print("나이 : ");
//          int age = sc.nextInt();
//          arr[i] = new Person(name, age);
//      }
