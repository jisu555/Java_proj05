package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		
		Scanner sc = new Scanner(System.in);
		int select;
		int a;
		
		do {
		System.out.println("======================================================");
		System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 빼고 저장 후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수만 빼고 저장 후 출력 ");
		System.out.println("4.프로그램 종료");
		System.out.println("=======================================================================");
		
		System.out.println("위 번호를 선택하세요");
		select = sc.nextInt();
		
		if (select==1) {
			System.out.println("방의 갯수를 입력하세요");
			a = sc.nextInt();
			int[] arr1 = new int[a];
			
			for(int i=1; i<3000; i++) {
				if(i%7==0 || i%8==0) {
					arr1[a] = i;
					a++;
				}
			}
			for (a = 0 ; a <arr1.length ; a++) {
				System.out.print(arr1[a] + " ");
			}
				
			} else if (select==2) {
				System.out.println("방의 갯수를 입력하세요");
				a = sc.nextInt();
				int[] arr2 = new int[a];
				
				for(int i=1; i<arr2.length; i++) {
					if(i%4==0) {
					} else {
						System.out.print(i+" ");
					}
				}
			} else if (select==3) {
				System.out.println("방의 갯수를 입력하세요");
				a = sc.nextInt();
				int[] arr3 = new int[a];
				
				for (int i=1; i<arr3.length; i++) {
					if(i%3==0 && i%6!=0) {
						System.out.print(i+" ");
					} 
					}
			} else if (select==4) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 1~4까지만 넣어주세요");
			}
		
		
		} while (true);
		System.out.println("프로그램을 종료합니다. (do while문 종료)");
		sc.close();

	}

}
