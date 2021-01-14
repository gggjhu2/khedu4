package kh.java.collection.list;

import java.util.Comparator;
									//컴페어러터 인터페이스를 구현체화한다
public class StudentNameAscending implements Comparator<Student> {
	
	
	
	
	//이름 오름차순 정렬  (String) 	스트링은이미 비교메서드를갖고있다.
	//
	@Override
	public int compare(Student s1, Student s2) {
		
		
		//스트링은이미 비교메서드를갖고있다. 그렇기에 스트링안에잇는 컴페어투 기능을 그대로사용하면된다
		return s1.getName().compareTo(s2.getName()) ;
	}

}
