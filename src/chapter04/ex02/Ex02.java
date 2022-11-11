package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// <문제02> switch문을 사용하여 프로그램 하세요.
		//	  스캐너로 문자열 gold을 인풋 받으면 "금메달입니다"출력
		//				silver를 인풋 받으면 "은메달입니다"출력
		//				bronze을 인풋 받으면 "동메달입니다"출력
		//				그 외 값을 인풋 받으면 "메달이 없습니다"출력
		
		String medal;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메달을 입력하세요.");
		medal = sc.next();
		
		switch (medal) {
		case "gold" : case "Gold" : case "GOLD" :
			System.out.println("금메달입니다.");
			break;
		case "silver" : 
			System.out.println("은메달입니다.");
			break;
		case "bronze" :
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
		}
		
		sc.close();
	
	}

}
