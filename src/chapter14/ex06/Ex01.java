package chapter14.ex06;

//1. 예외 발생할 때 각 메소드 내부에서 예외를 직접 처리함.
class Aa {
	void abc() {	//bcd() 메소드 호출
		bcd();
	}
	void bcd() {	//메소드 블락에서 직접 예외 처리
		
		try {
		System.out.println(3/0);
		int[] arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
		} catch (ArithmeticException e) {
			System.out.println("나눌 수 없음");
		} catch (ArrayIndexOutOfBoundsException e) {
			
		} catch (InterruptedException e) {}
		
		
	}
}
//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class Bb {
	void abc() {
		try {
			bcd();
			} catch (ArithmeticException e) {
				System.out.println("나눌 수 없음");
			} catch (ArrayIndexOutOfBoundsException e) {
				
			} catch (InterruptedException e) {
				
			} catch (Exception e) {
				System.out.println("예외처리됨");
			}
		
		
		
	}
	void bcd() throws Exception  {	//예외를 미루는 것 : throws
		System.out.println(3/0);
		int[] arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aa a = new Aa();
		a.abc();

		Bb b = new Bb();
		b.abc();

	}

}
