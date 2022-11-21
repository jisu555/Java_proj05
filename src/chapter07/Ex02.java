package chapter07;

class Student {
	
	//필드선언
	String stuName;   //학생이름
	int stuNum;		  //학번을 저장
	String stuAddr;	  //학생의 주소
	String stuPhone;  //학생의 전화번호
	double weight ;	  //학생의 몸무게 
	
	//생성자 오버로딩
	//기본생성자
	Student () {};
	
	//매개변수 3개인 생성자
	Student (String stuName, int stuNum, String stuAddr){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
	}
	
	//매개변수 5개인 생성자
	Student (String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
	}
	
	//필드의 값을 출력하는 메소드 void print() {필드의 값을 출력}
	void print () {
		System.out.println("학생이름 : " + stuName);
		System.out.println("학번 : "+ stuNum);
		System.out.println("학생주소 : "+ stuAddr);
		System.out.println("학생번호 : " + stuPhone);
		System.out.println("학생몸무게 : " + weight);
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		// 1. 기본 생성자로 객체 생성
		Student stu1 = new Student ();
		stu1.print();
		
		System.out.println("==================");
		
		// 2. 매개변수 3개인 생성자 호출
		Student stu2 = new Student("홍길동",2015,"서울시");
		stu2.print();
		
		System.out.println("===================");
		
		//3. 매개변수 5개인 생성자 호출
		Student stu3 = new Student("홍길순",2012,"경기도","010-1234-5678",50.0);
		stu3.print();
	}

}
