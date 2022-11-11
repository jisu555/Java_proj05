package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 	//<문제1> 스캐너로 정수값을 인풋받고 인풋받은 정수값이 홀수이면 "홀수"라고 출력하고
			//인풋받은 값이 짝수이면 "짝수"라고 출력
			//<<3항 연산잔를 사용>>
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int value1 = sc.nextInt();
		System.out.println(value1 + "은" + (value1%2==0? "짝수" : "홀수"));
		
		
	}

}
