package practice;

import java.util.Scanner;

public class calcul {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while(true) {
		System.out.println("계산기를 시작하려면 1번 중지하려면 2번을 누르세요");
		int start = sc.nextInt();
		
		if (start == 1) {

			calculstart(1);
		} else {

			System.out.println("프로그램을 종료합니다.");
			return;
		}
		}
	}

	static void calculstart(int on) {

		while (true) {
			System.out.println("원하는 연산을 선택하세요");
			System.out.println(
					"==========\n" + "1.더하기" 
			+ "2.빼기" + "3.곱하기" + "4.나누기" +
							"5.구구단출력하기\n" + 
			"6.나가기" + "=========");
			String firststep = sc.next();

			switch (firststep) {

				
			case "1":
				System.out.println("더하려는수 첫번째를 입력하세요");
				int a = sc.nextInt();
				System.out.print("입력하신수" + "(" + a + ")" + " ");
				System.out.println("하고 더하려는수 두번째를 입력하세요");
				int b = sc.nextInt();
				System.out.println("(" + a + ")" + "더하기" + "(" + b + ") 의결과는");
				System.out.println(a+b+ "입니다.");
				
			case "2":
				System.out.println("첫번째수 를 입력하세요");
				int a2 = sc.nextInt();
				System.out.print("입력하신수" + "(" + a2 + ")" + " ");
				System.out.println("에서 뺴고싶은 수를 입력하세요");
				int b2 = sc.nextInt();
				System.out.println("(" + a2 + ")" + "빼기" + "(" + b2 + ") 의결과는");
				
				System.out.println(a2 - b2 + "입니다.");

			
			case "3":
				System.out.println("첫번째수 를 입력하세요");
				int a3 = sc.nextInt();
				System.out.print("입력하신수" + "(" + a3 + ")" + " ");
				System.out.println("에서 곱하고싶은 수를 입력하세요");
				int b3 = sc.nextInt();
				System.out.println("(" + a3 + ")" + "곱하기" + "(" + b3 + ") 의결과는");

				System.out.println(a3 * b3 + "입니다.");

			case "4":
				System.out.println("나누기를 실행합니다.");
				System.out.println("무슨수를 나눠드릴까요?");
				int a4 = sc.nextInt();
				System.out.print("입력하신수" + "(" + a4 + ")" + " ");
				System.out.println("에서 나누고싶은 수를 입력하세요");
				int b4 = sc.nextInt();
				System.out.println("(" + a4 + ")" + "나누기" + "(" + b4 + ") 의결과는");

				System.out.println(a4 / b4 + "입니다.");

			case "5":
				System.out.println("구구단을 출력해드립니다");
				System.out.println("몇단을 출력해드릴까요?");
				
				int a5 = sc.nextInt();
				System.out.print("입력하신수" + "(" + a5 + ")" + " ");
				System.out.println("의 구구단입니다.");

				
				System.out.println("(" + a5 + ")" + "의 구구단 결과입니다.");
				for (int i = 1; i <=9 ; i++ ){
					
					System.out.println(a5 + "*" + i + "=" + (a5*i)+"\n입니다");
					
				}
				
				System.out.println();

				
			case "6":
				return;

			}
			
		}
	}
}
	

		
		
