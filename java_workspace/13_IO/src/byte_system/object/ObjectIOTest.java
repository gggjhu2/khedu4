package byte_system.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectIOTest {

	public static void main(String[] args) {

		ObjectIOTest o = new ObjectIOTest();
		o.test1();// 쓰기
		o.test2();// 읽ㄱ
	}

	private void test1() {

		File f = new File("object/user.ser");

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(f)));) {

			User u1 = new User("honggd", 1234, "홍길동", 15, Calendar.getInstance());
			User u2 = new User("sinsa", 1234, "신사임당", 15, Calendar.getInstance());
			User u3 = new User("sejong", 1234, "세종대웡", 15, Calendar.getInstance());

			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(u3);

			System.out.println("객체쓰기완료!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	//읽기 메서드
	public void test2() {
		File f = new File("object/user.ser");

		try (

				ObjectInputStream ois = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(f)));) {
			while(true) {
			System.out.println(ois.readObject());
			
			
			}
		}catch(EOFException e) {
			System.out.println("파일 읽어오기 완료!\n(에러지만에러아니다)");
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("객체불러오기완료");

	}

}
