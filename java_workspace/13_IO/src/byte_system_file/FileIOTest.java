package byte_system_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {
public static void main(String[] args) {
	FileIOTest ft= new FileIOTest();
	ft.test1();
	
//	ft.test2();
	System.out.println("===정상종료되었습니다====");
}




	//========================test1 메서드=======================
	public void test1() {
		
		String filePath ="test.txt";
		String copyPath = "byte/test_copy.txt";

		FileInputStream fis =null; //읽어오는스트림
		//바이트기반의 입출력스트림
		FileOutputStream fos =null;//파일을 내보내는스트림
		
		try {
			 fis= new FileInputStream(filePath);
			 fos = new FileOutputStream(copyPath);
			 int data =0;//읽어온 데이터를 담을 변수
			 
			 //읽어온데이터가 -1일떄까지 계속담아라
			 //add catch cluse to surrounding try 로 예외 처리 
			 while((data =fis.read()) != -1) {
//				 System.out.print(data + " ");
				//읽어온 내용 출력하기
				 System.out.print((char)data );
				 
				//파일 작성문 
				 fos.write(data);
				 
			 }
			 System.out.println("==========문자로 읽어오기 한글은 1바이트로 표현이안되어 깨진다=====");
			 
			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		//위의 두 캐치절 예외 처리를 io익셉션하나로 합칠수잇다.
	
		}catch(IOException e) {
			e.printStackTrace();
		}
			 
			 
			
		finally {
				try {
					fis.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			try {
				fis.close();//널포인트익셉션이떴다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	//========================test2 메서드=======================
	// 내컴퓨터의 이미지파일을 복사해서 byte폴더 하위에 위치시킬것.
	// 경로상의 한글사용 하지말것.
	public void test2() {
		String fileName ="C:\\1\\1.jpg";
		String destName = "byte/test_copy23.jpg";
		FileInputStream fis =null;
		FileOutputStream fos =null;
		
		try {
			 fis= new FileInputStream(fileName);
			 fos = new FileOutputStream(destName);
			 int data =0;//읽어온 데이터를 담을 변수
			 
			 while((data =fis.read()) != -1) {
				 fos.write(data);
				 
			 }
			 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					fis.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			try {
				fis.close();//널포인트익셉션이떴다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일복사완료");
	}
	
	
	
}
