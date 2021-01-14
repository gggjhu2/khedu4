package kh.java.jdk.api;

import java.util.Random;
import java.util.Scanner;

//
	//	== 동등비교 연산자.
	//	1. 기본형의 값 비교
	//	2. 참조형의 주소값 비교
	//		-true 같은객체를 가리키고 있다,
	//		-false 다른 객체를 가리키고 잇다.
	//
	//	String 참조형
	//	
	//  String 의 값(실제내용 예) "안녕" == "안녕"같은비료를원할때)비교 equals 를 사용해야 한다.
	//  1.기본형
	//	2.참조형
	//	
	//





public class StringTest {

	public static void main(String[] args) {
		
//		int a =10, b= 20;
//		
//		System.out.println(a==b);
//		
//		String s ="아" , s3="아";
//		
//		System.out.println(s.equals(s3));
//		
//		StringTest s1 =new StringTest();
//		StringTest s2 =s1;
//		
//		System.out.println(s1==s2);
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		s2= new StringTest();
//		
//		System.out.println(s1==s2);
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
		
//		
//		//문자열 값 비교 
//		
//		String s1 ="java";
//		String s2 =new String("java");//원래는 참조형의 올바른사용법이다 하지만 워낙자주사용하기에 기본자료형처럼쓸수있게 설정되어있다.
//		
//		System.out.println(s1==s2);// 값 비교가아니라 주소값을 비교하므로 false가나오게된다.
//		
//		System.out.println(s1.equals(s2));// 스트링참조형의 값비교는 .equals(비교할변수)를 해야 값비교가된다.
//		
//		System.out.println("java" =="java");
//		
//		String s3 ="java";
//		
//		System.out.println(s1==s3);//true
//		//왜트루가나오는지
//		
//		
//		int[] no={100,97,89}; 
//		int[][]count={{3,4,6,},{7,4,5}};
//		
//		System.out.println(no.length);
//		System.out.println(count.length); 
//		System.out.println(count[1].length); 
//		System.out.println(no[2]);
//		System.out.println(no[2]+count[1][2]);
		
	    Scanner sc = new Scanner(System.in);

        System.out.println("가위 바위 보 게임을 시작합니다.");

    do {
        System.out.println("가위 바위 보중 한개입력");
        String input = sc.nextLine();
        System.out.println("당신은" + input + "를 냈다");


        int random = (int)(Math.random() *3);
        String computer = "";

        switch(random) {
        case 0 : computer = "가위"; break;
        case 1 : computer = "바위"; break;
        case 2 : computer = "보"; break;
        }

    System.out.println("컴퓨터는" + computer + "를 냈다");

    if(computer == input) {
        System.out.println("비겼다. 다시 시작");
        
    }else {
        boolean win = true;   //포르를 트루로바꿨다

        if(computer == "가위") {
            if(input == "바위") {
                win = true;
            }
        }else if(computer == "바위") {
            if(input == "보") {
                win = true;
            }
        }else{
            if(computer =="보") {
            	System.out.println("비겼습니다..");
                break;
            }
        }

        if(win) {
            System.out.println("당신이 이겼습니다");
            break;
        }else {
            System.out.println("당신이 졌습니다.");
            break;
        }
    }



    } while(false);


    } 
}
	
