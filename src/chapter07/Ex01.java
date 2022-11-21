package chapter07;

class Calc{
	
	
	// 두 정수의 값을 받아서 더해서 값을 던져줌
	int add (int a, int b) {
		return a + b;
	}
	
	// 빼기 (diff)
	int diff (int a, int b) {
		return a - b;
	}
	
	//곱하기 (mul)
	int mul (int a, int b) {
		return a * b;
	}
	
	//나누기 (div) : double
	double div (double a, double b) {
		return a / b;
	}
	
	//면적 (Rec) (가로 : x 세로:y)
	double Rec (double a, double b) {
		return a*b;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();
		
		//int k = calc.add2(10,20);
		//System.out.println(k);
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.diff(60, 20));
		System.out.println(calc.mul(5, 9));
		System.out.println(calc.div(15, 5));
		System.out.println(calc.Rec(6, 8));
		
	}

}
