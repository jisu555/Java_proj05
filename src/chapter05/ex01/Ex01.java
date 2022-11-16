package chapter05.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>  
		// 배열 선언 4가지 방법 : 
		// 1. 배열 변수 이름 : arr1, 정수로 방3개로 지정, 40,50,60 넣고 출력 <<배열선언1>>
		// 2. 배열 변수 이름 : arr2, 실수로 방5개로 지정, 40.0, 50.0, 60.0... 넣고 출력 <<배열선언2>>
		// 3. 배열 변수 이름 : arr3, 문자열 3, "오늘", "날씨", "흐림"  <<배열선언3>>
		// 4. 배열 변수 이름 : arr4, 문자 3, 'A', 'B', 'C'  <<배열선언4>>
		
		System.out.println("========배열선언1==============");
		
		int[] arr1 = new int[3];
		arr1[0] = 40;
		arr1[1] = 50;
		arr1[2] = 60;
		System.out.println("0번째 방의 값 :" + arr1[0]);
		System.out.println("1번째 방의 값 :" + arr1[1]);
		System.out.println("2번째 방의 값 :" + arr1[2]);
		
		
		System.out.println("========배열선언2==============");
		
		double arr2[] = new double[5];
		arr2[0] = 40.0;
		arr2[1] = 50.0;
		arr2[2] = 60.0;
		arr2[3] = 70.0;
		arr2[4] = 80.0;
		System.out.println("0번째 방의 값 :" + arr2[0]);
		System.out.println("1번째 방의 값 :" + arr2[1]);
		System.out.println("2번째 방의 값 :" + arr2[2]);
		System.out.println("3번째 방의 값 :" + arr2[3]);
		System.out.println("4번째 방의 값 :" + arr2[4]);
		
		
		System.out.println("========배열선언3==============");
		
		String[] arr3 = new String[] {"오늘", "날씨", "흐림"};
		System.out.println(arr3[0] +""+ arr3[1] +""+ arr3[2]);
		
		
		System.out.println("========배열선언4==============");
		char[] arr4 = {'A', 'B', 'C'};
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		
		
		
	}

}
