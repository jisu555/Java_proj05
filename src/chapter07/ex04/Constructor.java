package chapter07.ex04;

// 생성자 오버로딩 : 생성자 호출 시 시그니처에 따라서 다른 생성자를 호출 
	//시그니처 (매개변수의 갯수,데이터타입)

class Ab{
	//필드 : 인스턴스필드 : 객체를 생성 후 호출
	int m;
	int n;
	int l;
	
	//this 키 : 자신의 객체의 필드
	
	//생성자 : //기본생성자
	Ab() {
		System.out.println("매개변수 정수 0개인 생성자" + m + " " + n + " " + l );
	}		
	Ab(int m){			//매개변수 정수 1개
		this.m = m ;
		System.out.println("매개변수 정수 1개인 생성자 : " + this.m + " " + n + " " + l );
	}
	Ab(int m,int n) {
		this.m = m ;
		this.n = n ;
		System.out.println("매개변수 정수 2개인 생성자 : " + this.m + " " + this.n + " " + l );
	}
	Ab(int m,int n, int l) {
		this.m = m ;
		this.n = n ;
		this.l = l ;
		System.out.println("매개변수 정수 3개인 생성자 : " + m + " " + n + " " + l );
	}
}

public class Constructor {

	public static void main(String[] args) {
		// 1. 기본 생성자 호출
		
		Ab ab1 = new Ab();
		
		// 2. 매개변수 1개인 생성자 호출
		Ab ab2 = new Ab(5);
		
		// 3. 매개변수 2개인 생성자 호출
		Ab ab3 = new Ab(5,6);
		
		// 4. 매개변수 3개인 생성자 호출
		Ab ab4 = new Ab(5,6,7);

	}

}
