package chapter11.ex04;

abstract class Car {	  //트럭T, 자가용C, 굴삭기E   <== 추상 메소드를 구현한 클래스 생성
	abstract void run();
	abstract void eat(); 
}

class T extends Car {  //모두 구현 : 콘크리트 클래스
	@Override
	void run() {
		System.out.println("트럭은 달린다.");
	}
	@Override
	void eat() {
		System.out.println("트럭은 기름을 먹는다.");
	}
}

abstract class C extends Car {  //일부만 구현 : 추상클래스
	@Override
	void run() {
		System.out.println("자가용은 달린다.");
	}
}

class E extends C{  //콘크맅트 클래스
	@Override
	void eat() {
		System.out.println("굴삭기는 먹는다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		//T를 객체화해서 Car타입으로 정의
		Car c1 = new T();
		c1.eat();
		c1.run();
		
		System.out.println("=====================");
		// T객체화해서 T타입으로 지정
		T t1 = new T();
		t1.eat();
		t1.run();
		
		System.out.println("=====================");
		// E객체화해서 Car타입으로 지정
		Car c2 = new E();
		c2.eat();
		c2.run();
		
		System.out.println("=====================");
		// E객체화해서 C타입으로 지정
		C c3 = new E();
		c3.eat();
		c3.run();
		
		System.out.println("=====================");
		// E객체화해서 E타입으로 지정
		E e2 = new E();
		e2.eat();
		e2.run();

	}

}
