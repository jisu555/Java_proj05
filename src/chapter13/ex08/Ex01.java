package chapter13.ex08;

interface Animal{
	void cry();
	void fly();
}

//인터페이스를 사용해서 4가지 형태로 출력
// 1. Animal을 구현한 Inner 클래스를 생성 후 메소드 출력
class A {
	
	//Animal을 객체화해서 B타입으로 선언
	Animal a = new B();

	//메소드 호출
	void k () {
		a.cry();
		a.fly();
	}
	
	//이너 클래스 : 인터페이스를 상속하는 이너 클래스
	class B implements Animal {
		@Override
		public void cry() {
			System.out.println("웁니다 1");
		}
		@Override
		public void fly() {
			System.out.println("납니다 1");
		}
	}
	
}


// 2. Animal을 익명 클래스로 생성해서 출력

class C {
	Animal a = new Animal() {
		@Override
		public void cry() {
			System.out.println("웁니다 2");
		};
		@Override
		public void fly() {
			System.out.println("납니다 2");
		}
	};
	
	void k () {
		a.cry();
		a.fly();
	}
}

//3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 생성

class D {
	void k (Animal a) {
		a.cry();
		a.fly();
	}
}




// 4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 없이 바로 출력


public class Ex01 {

	public static void main(String[] args) {
		
		// 1. 객체 생성 후 메소드 호출
		A a = new A ();
		a.k();
		
		System.out.println("==============");
		// 2. Animal을 익명 클래스로 생성해서 출력
		C c = new C ();
		c.k();
		
		System.out.println("===============");
		//3.객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 생성
		D d = new D ();
		
		Animal a1 = new Animal () {
			@Override
			public void cry() {
				System.out.println("웁니다 3");
			}
			@Override
			public void fly() {
				System.out.println("납니다 3");
			}
		};
		
		d.k(a1);
		
		System.out.println("====================");
		// 4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 없이 바로 출력
		
		d.k(new Animal() {
			@Override
			public void cry() {
				System.out.println("웁니다 4");
			}
			@Override
			public void fly() {
				System.out.println("납니다 4");
			}
		});
		
	}

}
