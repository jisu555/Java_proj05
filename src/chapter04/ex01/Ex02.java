package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <<스캐너에서 번호를 입력 받아서 아래 내용을 작동시키는 프로그램을 작성해주세요.
		// IF 문을 사용
		int select;	   //프로그램을 선택
		
		int kor ;
		int eng ;
		int math;
		
		int num ;
		
		String aName;
		String bName;
		
		System.out.println("========================================");
		System.out.println("1.학점의 합계/평균 | 2. 홀수/짝수 | 3.같은 이름식별");
		System.out.println("========================================");
		System.out.println("위의 변호를 선택하세요.>>>");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("프로그램을 선택하세요");
		select = sc.nextInt();	
		
		if (select == 1) {
			int sum;
			double avg;
			
			System.out.println("========================================");
			System.out.println("kor 학점을 입력해주세요 : ");
			kor = sc.nextInt();
			System.out.println("eng 학점을 입력해주세요 : ");
			eng = sc.nextInt();
			System.out.println("math 학점을 입력해주세요 : ");
			math = sc.nextInt();
			
			sum = kor + eng + math;
			avg = Math.round(sum/3.0);
			System.out.println("학점의 합계는 " + sum + "이고");
			System.out.println("평균은 " + avg + "입니다");
		} else if (select==2) {
			System.out.println("정수 값을 입력하세요.");
			num = sc.nextInt();
			System.out.println(num+ "는" + (num%2!=0 ? "홀수" : "짝수"));
		} else if (select==3) {
			System.out.println("a의 이름을 입력해주세요 : ");
			aName = sc.next();
			System.out.println("b의 이름을 입력해주세요 : ");
			bName = sc.next();
			System.out.println(aName.equals(bName)? "같은이름입니다." : "다른이름입니다." );
		} else {
			System.out.println("1~3까지만 입력해주세요");
		}

		
		
		
	}

}
