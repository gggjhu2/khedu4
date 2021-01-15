package kh.java.email.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kh.java.email.vo.Email;

//파일에 직접 접근하는 성격의 코드를 작성
//관련 메서드
public class EmailIO {
	
	//emailList.txt에 Email 객체 추가하기
	//
	public void insertEmail(Email email) {
		File f =new File("emailList.txt");
		try (
				ObjectOutputStream oos =
				new ObjectOutputStream
				(new BufferedOutputStream
						(new FileOutputStream(f)));
				)
		{
			oos.writeObject(email);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
}
}
