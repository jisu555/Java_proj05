package chapter10.ex08;

import chapter10.ex08.Animal;

class Animal {
	void run () {
		System.out.println("모든 동물은 달립니다.");
	}
}

class Man extends Animal {
	@Override	 
	void run() {
		System.out.println("남자는 달립니다.");
	}
}
class Woman extends Animal {
	@Override	 
	void run() {
		System.out.println("여자는 달립니다.");
	}
}
class Lion extends Animal {
	@Override	 
	void run() {
		System.out.println("사자는 달립니다.");
	}
}
class Tiger extends Animal {
	@Override	 
	void run() {
		System.out.println("호랑이는 달립니다.");
	}
}
class Cat extends Animal {
	@Override	 
	void run() {
		System.out.println("고양이는 달립니다.");
	}
}
class Dog extends Animal {
	@Override	 
	void run() {
		System.out.println("개는 달립니다.");
	}
}
class DogChild extends Dog {
	@Override	 
	void run() {
		System.out.println("강아지는 달립니다.");
	}
}



public class Ex01 {
	
	public static void main(String[] args) {
		// Animal : 부모클래스, run() 정의
		// 자식 클래스 : Man, Woman, Lion, Tiger, Cat, Dog, DogChild  <== 다형성
		//	 - 부모의 run 메소드를 재정의
		// arr 배열에 Animal 저장 후 For, Enhanced For문으로 출력, run()메소드 출력
		// 
		
		Animal a1 = new Animal();
		a1.run();
		
		
		System.out.println("=================");
		
		Animal a30 = new Animal();	
		Animal a31 = new Man();	
		Animal a32 = new Woman();	
		Animal a33 = new Lion();
		Animal a34 = new Tiger();
		Animal a35 = new Cat();
		Animal a36 = new Dog();
		Animal a37 = new DogChild();
		
		Animal[] arr = new Animal[] {a30, a31,a32,a33,a34,a35,a36,a37 };
		
		for(int i = 0; i<arr.length; i++) {
			Animal aa = arr[i];
			aa.run();
		}
		
		System.out.println("==================");
		
		for (Animal k : arr) {
			k.run();
		}
		
		

	}

}
