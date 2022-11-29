package chapter10.ex02;

class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}

class Student extends Human{
	String stuID ;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}

class Student2 extends Student{
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생2는 음식을 먹습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 업캐스팅 실습
		//1. Student 객체를 생성하면서 Human 타입으로 지정   : h1
		//2. Student 객체를 생성하면서 Student 타입으로 지정  : s1
		
		//3. Student2 객체를 생성하면서 Human 타입으로 지정 : h2
		//4. Student2 객체를 생성하면서 Student 타입으로 지정 : s2
		//5. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		
		
		Human h1 = new Student();	
					
		h1.name = "홍길동";
		h1.age = 15;
		System.out.println(h1.name);
		System.out.println(h1.age);
				
		h1.eat();
		
		System.out.println("=========================");
		
		Human s1 = new Student();
		
		s1.name = "홍길순";
		s1.age = 13;
		System.out.println(s1.name);
		System.out.println(s1.age);
				
		s1.eat();
		
		
		Human h2 = new Student2();
		
		h1.name = "홍길동";
		h1.age = 15;
		System.out.println(h1.name);
		System.out.println(h1.age);
				
		h1.eat();
		
		Human s2 = new Student2();
		
		h1.name = "홍길동";
		h1.age = 15;
		System.out.println(h1.name);
		System.out.println(h1.age);
				
		h1.eat();
		
		Human s3 = new Student2();
		
		h1.name = "홍길동";
		h1.age = 15;
		System.out.println(h1.name);
		System.out.println(h1.age);
				
		h1.eat();
		
		
		
		
	}

}
