package byte_system_file.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIoTest {

	public static void main(String[] args) {

		DataIoTest d = new DataIoTest();
		//파일작성 과정메서드 
//		d.test1();
		 
		//읽어오는 과정 메서드
		d.test2();

	}

	//
	// 파일작성 2진수라서 우리가 해당파일을직접보면 올바른 출력이안된
	//
	public void test1() {

		File f = new File("data/sample.dat");

		try (	//try(     내용에 한번에넣어서 예외처리와 종료를 간소화한다.)
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
				) {

			// 자바 자료형별로 작성 가능
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeDouble(3.14);
			dos.writeChar('병');
			dos.writeChar('신');
			dos.writeUTF("병세눈나병새누나");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("dataoutput stream 작업ㅇ완료");
	}

	// 읽어오기
	public void test2() {

		File f = new File("data/sample.dat");

		try (DataInputStream dis = new DataInputStream(new FileInputStream(f));) {

			// 쓰여진 자료형 순서대로 읽어올것!
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
//			dis.readChars(String);//2byte 식대로나열
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
