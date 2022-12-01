package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3개의 예외를 하나의 try ~ catch 블락에 넣고, 
			// 각각의 예외에 대해서 catch 블락
			// 3개의 예외를 한꺼번에 처리
		
		System.out.println("====1. 모든 예외를 하나의 try 블락에 넣고 예외를 각각 다르게 처리=====");
		
		try {
			System.out.println(3/0);	//실행 예외 : ArithmeticException
		
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);  //실행 예외 : ArrayIndexOutOfBoundsException

			int num = Integer.parseInt("20A");  //실행 예외 : NumberFormatException
			
		} catch (ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("5번방은 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가합니다.");
		} 
		
		
		System.out.println("====2. 모든 exception을 한번에 처리=====");
		
		try {
			System.out.println(3/0);
		
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);

			int num = Integer.parseInt("20A");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("세 개의 예외가 한꺼번에 발생했습니다.");
			
			System.out.println(e.getMessage());	 //예외의 간단한 정보를 출력
			e.printStackTrace();				 //예외의 세부적인 정보를 출력
		}
		
		System.out.println("======3. 각각의 try 블락에서 처리=============");
		
		try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			System.out.println("3. 0으로 나눌 수 없습니다.");
		}
		
		try {
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3. 배열의 방을 넘겼습니다.");
		}
		
		try {
			int num = Integer.parseInt("20A");
		} catch (NumberFormatException e) {
			System.out.println("3. 숫자를 변경할 수 없습니다.");
		}
		
	System.out.println("프로그램 종료");
		
	}

}
