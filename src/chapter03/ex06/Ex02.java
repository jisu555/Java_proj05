package chapter03.ex06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제2> 스캐너로 3,6,9의 배수이면 "3,6,9의 배수입니다"
			//그렇지 않으면 "3,6,9의 배수가 아닙니다"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int value1 = sc.nextInt();
		System.out.println(value1 + "은" + ((value1%3==0 || value1%6==0 || value1%9==0)? "3,6,9의 배수입니다" : "3,6,9의 배수가 아닙니다"));
	
	}

}
