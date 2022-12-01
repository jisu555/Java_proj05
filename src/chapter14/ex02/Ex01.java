package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		//try ~ catch - finally 구문을 사용해서 예외 처리
		
		int[] arr = new int[] {1,2,3,4} ;
		
		//실행 시 예외 발생 : ArrayIndexOutOfBoundsException
		
		try {
			
			System.out.println(arr[5]);
			System.out.println("try 블락의 코드");
			
		} catch (ArrayIndexOutOfBoundsException e){
			// try 블락에서 ArrayIndexOutOfBoundsException 발생이 되면 작동 
			System.out.println("5번방은 없습니다.");
		} finally {
			// 무조건 작동되는 블락
			System.out.println("반드시 실행되는 블락");
		}
		
		System.out.println("프로그램 종료");
	}

}
