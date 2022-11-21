package chapter07.ex03;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 가변 길이 배열 문제
		/*
		 		values[0] : 값이 정수 1 ~ 9 이 들어올 때 "파워레벨 1 [9]입니다."
		 		values[1] : 값이 정수 1 ~ 9 이 들어올 때 "스피드레벨 1 [9]입니다."
		 */
		arrayFlexible(7,8);
		
		
	}
	
	public static void arrayFlexible(int...values) {
		System.out.println("파워레벨"+ values[0] +"입니다.");
		System.out.println("스피드레벨"+ values[1] +"입니다.");
	}
	
	
}
