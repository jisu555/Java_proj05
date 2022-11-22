package chapter07.ex05;

class Student{
	//필드선언
	String stuName;		//학생이름 : 학생이름없음 
	int stuNo;			//학번 	: 0
	String stuPhone;	//핸드폰번호 : 000-0000-0000
	String stuAddr;		//주소 		: "서울"
	int stuAge;			//나이 		: 0
	double stuWeight;	//몸무게 		: 0.0
	
	Student (){	   //기본생성자에서 초기값을 할당 : this()메소드를 사용해서 각 필드의 값을 적용
		stuName = "학생이름없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;
	}
	
	Student(String stuName){
		this ();
		this.stuName = stuName;
	}
	
	Student(String stuName, int stuNo){
		this (stuName);
		this.stuNo = stuNo;
	}
	
	Student(String stuName, int stuNo, String stuPhone){
		this (stuName, stuNo);
		this.stuPhone = stuPhone;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr){
		this (stuName, stuNo, stuPhone);
		this.stuAddr = stuAddr;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge){
		this (stuName, stuNo, stuPhone, stuAddr);
		this.stuAge = stuAge;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge, double stuWeight){
		this (stuName, stuNo, stuPhone, stuAddr, stuAge);
		this.stuWeight = stuWeight;
	}
	
	
	void print() {
		//필드의 내용을 출력
		System.out.println("학생의 이름 : " + stuName);
		System.out.println("학생의 학번 : " + stuNo);
		System.out.println("학생의 번호 : " + stuPhone);
		System.out.println("학생의 주소 : " + stuAddr);
		System.out.println("학생의 나이 : " + stuAge);
		System.out.println("학생의 몸무게 : " + stuWeight);
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		// 
		
		// 기본 생성자
		System.out.println("===Aa 클래스의 기본생성자 호출===");
		Student stu1 = new Student();
		stu1.print();
				
		//매개변수 1개인 생성자 호출
		System.out.println("===Student 클래스의 매개변수 정수 1개인 생성자 호출===");
		Student stu2 = new Student("김땡땡");
		stu2.print();
				
		//매개변수 2개인 생성자 호출
		System.out.println("===Student 클래스의 매개변수 정수 2개인 생성자 호출===");
		Student stu3 = new Student("이땡땡", 2015);
		stu3.print();
		
		//매개변수 3개인 생성자 호출
		System.out.println("===Student 클래스의 매개변수 정수 3개인 생성자 호출===");
		Student stu4 = new Student("박땡땡", 2016, "010-1111-1111");
		stu4.print();
		
		//매개변수 4개인 생성자 호출
		System.out.println("===Student 클래스의 매개변수 정수 4개인 생성자 호출===");
		Student stu5 = new Student("최땡땡", 2017, "010-2222-2222", "경기도");
		stu5.print();
		
		//매개변수 5개인 생성자 호출
		System.out.println("===Student 클래스의 매개변수 정수 5개인 생성자 호출===");
		Student stu6 = new Student("황땡땡", 2018, "010-3333-3333", "인천", 20);
		stu6.print();
		
		//매개변수 6개인 생성자 호출
		System.out.println("===Student 클래스의 매개변수 정수 6개인 생성자 호출===");
		Student stu7 = new Student("정땡땡", 2019, "010-4444-4444", "강원도", 20, 50.0);
		stu7.print();


	}

}
