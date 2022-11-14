package chapter04.ex03;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 2중 For문을 사용해서 1단 ~ 19단까지 출력
		// 3의 배수단
		
		/*for (int i = 3; i <20; i+=3) {
			for(int j =1; j<10; j++) {
				System.out.println(i + "*" + j+ "=" + i*j);
				
			}
			System.out.println();
		}
		*/
		
		for (int i=1; i<20; i++) { //19번 루프
			//단을 출력
			System.out.println(i + "단 출력");
			for (int j=1; j<20; j++) {	// i일때 19번 루프
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		System.out.println("=====3의 배수단만 출력============");
		for (int i=3; i<20; i+=3) { //19번 루프
			//단을 출력
			System.out.println(i + "단 출력");
			for (int j=1; j<20; j++) {	// i일때 19번 루프
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		
	}

}
