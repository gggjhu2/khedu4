package practice;

import java.util.Scanner;

public class gugudanmethod {

	public static void main(String[] args) {

		//구구단 중에 2단을 출력하기 위하여 메소드에게 일처리를 맡기고자 한다.

		
		for (int i = 2; i <=9 ; i++ ) {
			gugudan(i);
			
		}
		//스캐너로 정수를받아 구구단 메서드에 해당 인트를 기입하여 구구단출력
		Scanner sc =new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int sc3 =sc.nextInt();
		gugudan(sc3);
		
	}


    
	


	





	public static void gugudan(int n){

		System.out.println(n + "단");



		for (int i = 1; i <=9 ; i++ ){

			System.out.println(n + "*" + i + "=" + (n*i));

		}

		System.out.println();

	}

		
}

	

