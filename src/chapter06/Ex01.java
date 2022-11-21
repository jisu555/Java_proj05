package chapter06;

class Man {
	//필드
	String name = "홍길동" ;
	int age = 30 ;
	String phone = "010-1111-1234";
	String addr = "서울 종로구 인사동";
	double weight = 70.5;
	
	//기본 생성자는 생략됨 : A () {}
	
	//메소드 :
	void add1 () {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력
		int[] arr2 = new int[100];
		for(int i=0, j=2; i<100; i++,j+=2) {
			arr2[i]=j;
			System.out.print(arr2[i]+" ");
			if (i>100) {
				break;
			}
		}
		int sum =0;
		int j=0;
		sum += j;
		System.out.print(sum);
		
	}
	
	void add2() {
		// 1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값을 출력
		int i=0;
		int[] arr = new int[500];
		
		for (int a=1; a<500; a++) {
			if (a%3==0 || a%4==0) {
				arr[i] = a; 
				i++;
			}
			if (i>500) {
				break;
			}
		}
		for (int a=0; a<500; a++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	void add3() {
		// 1 ~ 1000 까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력
		int i=0;
		int[] arr1 = new int[1000];
		int a=0;
		
		for(a=0; i<1000; a++) {
			if(a%4==0) {
				continue;
			}
			arr1[i] =a;
			a++;
			if (i == 1000) {
				break;
			}
		}
		for (a=0; a<1000; a++) {
			System.out.println(arr1[i]);
		}
		
		
	}
	
} 


public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성 및 객체의 필드의 값이나 메소드 호출
		
		Man a = new Man();
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.phone);
		System.out.println(a.addr);
		System.out.println(a.weight);
		
		
		a.add1();
		
		a.add2();
		
		a.add3();
		
		
		
		

	}

}
