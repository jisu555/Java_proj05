package chapter10.ex01;

class Animal{		//Animal클래스를 상속해서 Tiger, Eagle, Lion 클래스를 생성
						//자식 클래스에서는 필드1, 메소드1 정의
					 //LionChild클래스는 Lion클래스를 상속해서 필드1, 메소드1
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}

class Tiger extends Animal {
	int tigerID;
	void play() {
		System.out.println("호랑이는 놉니다.");
	}
}

class Eagle extends Animal {
	int eagleID;
	void fly() {
		System.out.println("독수리는 날아다닙니다.");
	}
}

class Lion extends Animal {
	int lionID;
	void study() {
		System.out.println("사자는 공부합니다.");
	}
}

class LionChild extends Lion {
	int lionChildID;
	void shower() {
		System.out.println("어린사자입니다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("======Tiger 클래스 객체 생성=========");
		
		Tiger t1 = new Tiger();
			
		//부모의 필드와 메소드 출력 
		System.out.println("===부모의 필드와 메소드 출력===");
		t1.name = "호순이";
		t1.age = 5;
		t1.color = "orange";
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.color);
			
		t1.eat();
		t1.sleep();
			
		//자식의 필드와 메소드 출력
		System.out.println("===자식의 필드와 메소드 출력===");
		t1.tigerID = 1111;
		System.out.println(t1.tigerID);
		t1.play();
			
		System.out.println("======Eagle 클래스 객체 생성=========");
			
		Eagle e1 = new Eagle();
		//부모클래스의 필드와 메소드
		e1.name = "독순이";
		e1.age = 7;
		e1.color = "black";
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.color);
		e1.eat();
		e1.sleep();
			
		//자신의 클래스의 필드와 메소드 출력
		e1.eagleID = 2222;
		System.out.println(e1.eagleID);
		e1.fly();
			
		System.out.println("======Lion 클래스 객체 생성=========");
			
		Lion l1 = new Lion();
					
		//부모의 필드와 메소드 출력 
		System.out.println("===부모의 필드와 메소드 출력===");
		l1.name = "사순이";
		l1.age = 13;
		l1.color = "brown";
		System.out.println(l1.name);
		System.out.println(l1.age);
		System.out.println(l1.color);
					
		l1.eat();
		l1.sleep();
					
		//자식의 필드와 메소드 출력
		System.out.println("===자식의 필드와 메소드 출력===");
		l1.lionID = 3333;
		System.out.println(l1.lionID);
		l1.study();
			
		System.out.println("==============");
			
		LionChild l2 = new LionChild();
			
		//Lion 의 필드와 메소드 출력
		l2.name = "사돌이";
		l2.age = 1;
		l2.color = "white";
		System.out.println(l2.name);
		System.out.println(l2.age);
		System.out.println(l2.color);
			
		l2.eat();
		l2.sleep();
		System.out.println("=========");
		//Lion의 필드와 메소드 호출
		l2.lionID = 5555;
		l2.study();
			
		//Student2의 필드와 메소드 호출
		l2.lionChildID = 7777;
		l2.shower();
		

	}

}
