package practice;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1~100사이ㅢ 정수를 입력하세요:");

		int num = sc.nextInt();

		if (num >= 1 && num <= 100) {

			if (num == 1) {

				System.out.println("1은소수가 아닙니다.");

			} else {

				if (num % 2 == 0) {
					System.out.println(num + "은 소수가아닙니다.");
				}
				System.out.println("");
			}
		} else {
			System.out.println("1부터 100사이의 정수를 입력하세요!");
		}

	}

}
