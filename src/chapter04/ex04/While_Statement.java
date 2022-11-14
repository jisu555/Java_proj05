package chapter04.ex04;

public class While_Statement {

	public static void main(String[] args) {
		//While문 : 반복문, 조건이 true 동안 반복, 조건이 false 이면 실행블락을 빠져나온다.
		/*
		  for (초기식; 조건; 증감식){
		  	실행블락;
		  }
		*/
		
		/*
		  초기값
		  while (조건) {
		  	실행블락;
		  	증감식;
		  } 
		  
		 */
		
		//1. While문의 기본 문법 구조 (증감식을 처리하지 않으면 무한루프)
		System.out.println("===While문으로 출력=====");
		int a = 0;
		while (a < 10) {
			System.out.print(a+" ");
			a++ ;
		}
		System.out.println();
		
		//2.For문으로 변환
		System.out.println("=====For문으로 출력=======");
		for (a=0; a<10; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		System.out.println("======While문 처리===================");
		
		// while문 vs for문으로 처리 ; 100 부터 1까지 2씩 감소해서 출력
		
		int b = 100;
		while (b > 0) {
			System.out.print(b + " ");
			b-=2;
		}
		System.out.println();
		System.out.println("======For문 처리======");
			
		for (b = 100; b > 0 ; b-=2) {
			System.out.print(b +" ");
		}
		
		System.out.println();
		System.out.println("======while에서 무한루프==============");
		
		boolean ab = true;
		int d = 0 ;			//기본 자료형은 반드시 초기값이 할당되어있어야한다.
		while ( ab ) {
			System.out.println("무한루프" + d);
			
			if (d>100) {
				break;
			}
			d++;
		}
		System.out.println("while문 빠져나옴");
		
		
		
		
		}
	}

