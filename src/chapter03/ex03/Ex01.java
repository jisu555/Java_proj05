package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <실습 문제>    p.jangwoo@gmail.com 
		// 정수 2개를 Scanner로 인풋 받고 두 값이 같으면 true를 출력 다르면 false 출력
		// 이름 2개를 Scanner로 인풋 받고 두 값이 같으면 true를 다르면 false를 출력 
			// 등가연산자 사용.
			//기본자료형 : ==
		//참조자료형 : aName.equals(bName)
		
		int a ;
		int b ;
		
		String aName;
		String bName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 값을 입력해주세요 : ");
		a = sc.nextInt();
		System.out.println("a의 값을 입력해주세요 : ");
		b = sc.nextInt();
		
		System.out.println("a의 이름을 입력해주세요 : ");
		aName = sc.next();
		System.out.println("b의 이름을 입력해주세요 : ");
		bName = sc.next();
		
		System.out.println("기본자료형 : " + (a == b));
		System.out.println("참조자료형 : " + aName.equals(bName));
		
	
	}

}
