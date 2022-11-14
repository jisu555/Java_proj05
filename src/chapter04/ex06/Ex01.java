package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 스캐너로 인풋 받은 값을 선택시 해당 내용을 이중 for 문을 사용해서 출력하세요.
		// 4. 프로그램 종료시ㅣ까지 무한루프를 돌려서 작동 시키세요.
		// 1~4 번 외의 내용을 선택시 "잘못된 입력입니다. 1~4까지만 넣어주세요"
		
		Scanner sc = new Scanner(System.in);
		int select ;
		
		do {
		System.out.println("==========================");
		System.out.println("1. 구구단출력 | 2. 19단출력 | 3. 19단중 7배수단만 출력 | 4. 프로그램 종료");
		System.out.println("==========================");
		System.out.println("위 번호를 선택하세요>>>");
		select = sc.nextInt();
		if (select ==1) {
			System.out.println("1.구구단출력");
			for (int i =1; i<10; i++) {
				System.out.println(i+"단 출력");
				for (int j=1; j<10; j++) {
					System.out.print(i + "*" + j + "=" + i*j + "\t");
				}
				System.out.println();
			}
		} else if (select ==2){
			for (int i =1; i<20; i++) {
				for (int j=1; j<20; j++) {
					System.out.println(i + "*" + j + "=" + i*j );
					//System.out.printf("%d * %d = %d \t", i, j, i*j);
				}
				System.out.println();
			} 
		} else if (select ==3) {
			for (int i =7; i<20; i+=7) {
				for(int j=1; j<20; j++) {
					System.out.print(i + "*" + j + "=" + i*j +"\t");
				}
				System.out.println();
			}
		} else if (select ==4) {
			//System.out.println("프로그램 종료");   do while문 종료후에 써서 여기서 안써도됨
			break;
		} else {
			System.out.println("잘못된 입력입니다. 1~4까지만 넣어주세요");
		}
		
		 
		} while (true);
		System.out.println("프로그램을 종료합니다. (do while문 종료)");
		sc.close();
	}

}

