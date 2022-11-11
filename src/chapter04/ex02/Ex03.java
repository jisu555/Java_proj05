package chapter04.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// <문제> 스캐너로 1월 ~ 12월까지 월을 인풋 받아서 해당월의 일수를 출력해 주세요.
		// 출력 : 1 월은 31일 입니다. 
		//		2 월은 28일 입니다.
		// 		month 월은 day 일 입니다.
		// switch 문으로 작성 
		int month ;
		int day = 30 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println(month + "월은" + (day+1) + "입니다.");
			break;
		case 2 : 
			System.out.println(month + "월은" + (day-2) + "입니다." );
			break;
		case 4 : case 6 : case 9: case 11 :
			System.out.println(month + "월은" + day + "입니다.");
			break;
		default :
			System.out.println("1~12까지만 입력해주세요.");
		}
		
		sc.close();
		
	}

}
