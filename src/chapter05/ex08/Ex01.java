package chapter05.ex08;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		//		args :  합계 40 77 99 100 200
		
		// 합계 : <정수를 더한 값을 출력>
		String s = args[0];
		int sum = 0;
		for (int i=1; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.print(s+":");
		System.out.print(sum);
		
		System.out.println("\n===================");
		
		System.out.println("합계"+ 1 + 2 + 3);  //합계123
		

		/*
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		String e = args[4];
		String f = args[5];
		
		System.out.println(a + b + c + d + e + f);
		
		int h = Integer.parseInt(b);
		int i = Integer.parseInt(c);
		int j = Integer.parseInt(d);
		int k = Integer.parseInt(e);
		int l = Integer.parseInt(f);
		
		System.out.println(a + ":" + (h+i+j+k+l));		
		*/

		
	}

}
