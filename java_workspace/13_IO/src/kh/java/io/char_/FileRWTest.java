package kh.java.io.char_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWTest {

	public static void main(String[] args) {

		FileRWTest f = new FileRWTest();
		 f.test1();
//		f.test2();

	}

	
	
	
	//======================메서드1===========================
	//
	// 문자기반 스트림
	//
	// char 2byte
	//
	private void test1() {

		// 경로상의 실제파일(없을수잇다)을 가리키는 자바객체
		//경로상에 존재하지않는다면 자동으로 생성해준다.
	//	File f = new File("FILE Ftest.txt");
		//ㅅㅂ 생성안해주는데뭔개소리지
		
		//버퍼드리더와달리 이방식은 한글자씩 불러오는것이라 깨지지않는다.
		//즉 , 텍스트 파일을 읽어오는용도에 특화되어있는 스트림이다.
		File f = new File("te2222st.txt");
		FileReader fr = null;
		try {

			fr = new FileReader(f);

			int data = 0;

			while ((data = fr.read()) != -1) {
				System.out.print((char) data +":");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//=====================================메서드2===========================
	// try ....whith ... resource 구문 (jdk 1.7)
	// 보조스트림을 이용한처리
	//
	//
	public void test2() {

		File f = new File("test2.txt");
		File dest =new File("char/test_copy31231333.txt");
		//BufferedReader br = null;
		//BufferedReader b = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(f));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
				//트라이( ) 안에 스트링객체를 선언하면 자동 클로스까지해준다.
				//jdsk1.7부터 추가된기능이므로 버젼에 주의한다.
	){
			String data =null;
			
			while((data = br.readLine()) !=null) {
				
				System.out.println(data + ":");
				
				
				//br.readLine 이읽어온 문자는 개행문자가없다.
				bw.write(data );
							//그래서 \n을 붙여서 개행을 직접넣어준다
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
