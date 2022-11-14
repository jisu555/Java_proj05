package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> do while문으로 무한 루프를 돌립니다.
		//			if or switch
		//	스캐너에서 1 을 넣으면 "1.평균출력" 으로 출력
		//  스캐너에서 2 을 넣으면 "2.합계출력" 으로 출력
		//  스캐너에서 3 을 넣으면 "3.이름출력" 으로 출력
		//	4번을 넣으면 do while 문을 빠져나옴 " 프로그램 종료" 
		
		
		Scanner sc = new Scanner(System.in);
		int select;
		
		do {
			System.out.println("==========================");
			System.out.println("1. 평균출력 | 2. 합계출력 | 3. 이름출력 | 4. 프로그램 종료");
			System.out.println("==========================");
			System.out.println("위 번호를 선택하세요>>>");
			select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("1.평균출력 \n");
				break;
				
			case 2:
				System.out.println("2.합계출력 \n");
				break;
				
			case 3 :
				System.out.println("3.이름출력 \n");
				break;
			
			case 4 :
				break;
				
			default : 	
				System.out.println("잘못된 입력입니다. 1~4까지만 넣어주세요 \n");
			}
			
			if (select==4) {
				System.out.println("프로그램종료");
				break;
			}
			
		} while (true);
		
		System.out.println("do while 문을 빠져 나왔습니다.");
		
		/* if문 사용할 경우
		 
		 if (a==1){
		 	System.out.println("1.평균출력");
		 } else if (a==2) {
			 System.out.println("2.합계출력");
		 } else if (a==3) {
			 System.out.println("3.이름출력");
		 } else if (a==4) {
			 System.out.println("4.프로그램종료");
			 break;
		 } else {
			 System.out.println("잘못된입력입니다. 1~4만 입력하세요");
		 }
		*/
	}

}
