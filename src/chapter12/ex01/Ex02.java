package chapter12.ex01;

abstract class Calc2{
	abstract void add(int a, int b);
	abstract void diff(int a, int b);
	abstract void mul(int a, int b);
	abstract void div(int a, int b);
	
}

class Calc_Impl2 extends Calc2{
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
	}
	@Override
	void diff(int a, int b) {
		System.out.println(a-b);
	}
	@Override
	void mul(int a, int b) {
		System.out.println(a*b);
	}
	@Override
	void div(int a, int b) {
		System.out.println((double)a/b);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		//1. 구현한 클래스의 메소드 호출 후 출력
		System.out.println("=========구현한 클래스의 메소드 호출 후 출력==============");
		Calc2 c2 = new Calc_Impl2();
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);
		
		//2. 익명 클래스로 메소드 호출 후 출력
		System.out.println("=========익명 클래스의 메소드 호출 후 출력==============");
		Calc2 c3 = new Calc2(){
			@Override
			void add(int a, int b) {
				System.out.println(a+b);
			}
			@Override
			void diff(int a, int b) {
				System.out.println(a-b);
			}
			@Override
			void mul(int a, int b) {
				System.out.println(a*b);
			}
			@Override
			void div(int a, int b) {
				System.out.println((double)a/b);
			}
		};
		
		c3.add(a, b);
		c3.diff(a, b);
		c3.mul(a, b);
		c3.div(a, b);
		
		
	}

}
