package kh.java.email.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kh.java.email.vo.Email;

//파일에 직접 접근하는 성격의 코드를 작성
//관련 메서드
public class EmailIO {
	

	
	//읽고 쓰기에 다같이쓰이므로 필드로낸다.
	File f =new File("emailList.txt");
	
	
	//emailList.txt에 Email 객체 추가하기
	//
	public void insertEmail(Email email) {

		//기존정보 읽어오는 기능
		List<Email>list =loadEmailList();
		list.add(email);
		System.out.println("list@io.insertEmail = " +list);
		
		
;		try (
				ObjectOutputStream oos =
				new ObjectOutputStream
				(new BufferedOutputStream
						(new FileOutputStream(f)));
				)
		{
	
	//기존정보 에 새로운정보 추가하기 
//			oos.writeObject(email);
			for(Email e :list)
				oos.writeObject(e);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
}

	public List<Email> loadEmailList() {
		
		List<Email> list =new ArrayList<>();
		//파일읽어오기작성
		try(
			ObjectInputStream ois =new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));	
				){
			//조건문 들어간다.
			while(true) {
				Email email =(Email)ois.readObject();
				list.add(email);
			}
			
			//이부분이없으면 최초 실행시 에러가뜬다 
		}catch(FileNotFoundException e) {
			//최초 등록시 파일 생성하기.
			try {
				f.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			
		}catch(EOFException e) {
//			e.printStackTrace();//출력하지않는다 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
			
		return list;
	}
}
