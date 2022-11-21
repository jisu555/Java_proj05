package chapter07.ex01;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Ex01 {
	

	public static void main(String[] args) {
		
		//객체 생성, 메소드 호출 : Main method에서 호출
		
		//sum1, sum2 객체 생성 없이 바로 호출 : static메소드
		
		sum1(1,2,3);
		int a=sum1(1,2,3);
		System.out.println(a);
		
		System.out.println(sum1(2,3,4));
		System.out.println("=====================");
		
		
		System.out.println(sum2(1.1,2.2,3.3));
		System.out.println("=========================");
		
		//sum3 :인스턴스 메소드 : static키가 붙어있지 않는 메소드, 객체화 해야 호출이 가능
	//	String c = sum3 ("제품이름", "제품수량", "제품가격");  //오류발생, 객체화 해야 호출
		
		//객체화
		Ex01 ex01 = new Ex01() {};
		String d = ex01.sum3("제품이름", "제품수량", "제품가격");
		System.out.println(d);
		
		System.out.println(ex01.sum3("제품이름", "제품수량", "제품가격"));
		
		//ex01.print("핸드폰", 10, 150);
	}
	
	//정수값 3개를 인풋 받아 더한값을 정수로 리턴하는 메소드 (static)
	public static int sum1(int a, int b, int c) {
		return  a + b + c;
	}
	
	//실수 3개를 인풋 받아 더한값을 실수로 리턴하는 메소드 (static)
	public static double sum2 (double d, double e, double f) {
		return d + e + f ;
	}
	
	//문자열을 연결해서 출력하는 메소드 (인스턴스메소드 :static을 사용하지 않는 메소드)
	  //"제품이름", "제품수량", "제품가격"
	  // 객체를 생성해서
	
	public String sum3 (String a, String b, String c) {
		return a + " " + b + " " + c;
	}
	
	
	public void print(String a, int a1, int a2) {
		System.out.println("제품명 : " + a );
		System.out.println("제품수량 : " + a1);
		System.out.println("제품가격 : "+ a2);
	}
	
}
