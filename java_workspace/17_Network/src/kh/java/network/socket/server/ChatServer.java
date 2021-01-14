package kh.java.network.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//
//ip :자동으로 server computer 의 ip가 할당
//port ":직접지정
//
public class ChatServer {

	
	
	public static final int PORT =7777;
	
	
	
	public static void main(String[] args) {
		new ChatServer().init();
	}
	
	
	//서버프로그램 시작
	public void init() {
		
		try {
			//1. Server Socket 생성
			ServerSocket serverSocket =new ServerSocket(PORT);
			System.out.println("["+InetAddress.getLocalHost().getHostAddress()+" : "+PORT+"] 에서 연결대기중...");
	
			
			//2. Client 연결요청이 있을떄 , 소켓을 새로 생성해 통신
			Socket socket =serverSocket.accept();
			
			
			//3.소켓용 입출력 스트림 준비.
								//보조스트림                      브릿지스트림                              기본스트림
			BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw =new PrintWriter(socket.getOutputStream());
			
			//4. welcome message
			pw.println("환영합니다.");
			pw.flush();//버퍼가 가득 차지 않아도 전송하기  .버퍼내용을 즉시 쓰기
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		}
}
