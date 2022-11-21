package chapter07.ex02;

public class Ex01_A {

	public static void main(String[] args) {
		// 메소드 매개 변수로 배열을 Argument로 인풋
		
		// 1 ~ 100 까지 3의 배수의 배열을 생성 후 메소드 호출, 정수:5호출
			//주의 : 100번 방까지가 아니라 100까지
		int [] a = new int[100/3];
		for(int i=0, j=3; i<a.length; i++, j+=3) {  
			a[i]=j;
		}
		System.out.println();
		
		
		//3의 배수 출력
		System.out.println("===3의 배수 출력===");
		System.out.println(a.length);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("============");
		
		//메소드 호출
		System.out.println("===3의 배수 배열에 각 방에 값을 *5");
		printArray(a,5);
		
		// 1 ~ 100 까지 7의 배수 배열을 생성 후, 정수:2 
		int [] b = new int[100/7];
		for(int i=0, j=7; i<b.length; i++, j+=7) {  
			b[i]=j;
		}
		
		System.out.println("===7의 배수 출력====");
		System.out.println(b.length);
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		//메소드 호출
		printArray(b,2);
		
		
		System.out.println("1부터 200까지 9의 배수만 저장 후 출력");
		int[]c = MultiArray(200,9);
		System.out.println("==200까지 9의 배수 출력 ==");
		for (int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
		// c배열의 각 방에 숫자를 넣어서 출력
		
	}
	
	
	public static void printArray (int[]a, int b) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]*b+" ");
		}
		System.out.println();
	}
	

	//방의 갯수에 따라 배수를 저장하는 배열을 리턴 시켜주는 메소드
		//maxCount : 100까지
		//multi : 배수를 저장하는 변수
	public static int[] MultiArray (int maxCount, int multi) {
		int[]a = new int[maxCount/multi];
		for(int i=0, j=1; i<a.length; j++) {	//j :배수를 저장하는 변수
			if(j%multi==0) {	// j / multi ==0	//multi배수일때 j값을 배열a에 저장
			a[i]=j;
			i++;
			}
		}
		return a;
	}
	
	
	
}
