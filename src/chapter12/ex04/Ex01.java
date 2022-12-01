package chapter12.ex04;

interface Animal {}

interface Animal1 extends Animal {
	void cry();
}
interface Animal2 extends Animal {
	void run();
}
interface Animal3 extends Animal {
	void eat();
}

//Cat, Tiger <== cry(), run() 구현
//Dog, Lion  <== run(), eat() 구현
//Eagle 	 <== cry(), run(), eat()

class Cat implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	@Override
	public void run() {
		System.out.println("고양이는 달립니다.");
	}
}

class Tiger implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");
	}
}

class Dog implements Animal2, Animal3 {
	@Override
	public void run() {
		System.out.println("개는 달립니다.");
	}
	@Override
	public void eat() {
		System.out.println("개는 먹습니다.");
	}
}

class Lion implements Animal2, Animal3 {
	@Override
	public void run() {
		System.out.println("사자는 달립니다.");
	}
	@Override
	public void eat() {
		System.out.println("사자는 먹습니다.");
	}
}

class Eagle implements Animal1, Animal2, Animal3 {
	@Override
	public void cry() {
		System.out.println("끼이오");
	}
	@Override
	public void run() {
		System.out.println("독수리는 날아다닙니다.");
	}
	@Override
	public void eat() {
		System.out.println("독수리는 먹습니다.");
	}
}


// 배열에 넣어서 오버라이딩된 메소드 출력
   //instanceof 를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(), run()
   //instanceof 를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면  eat(), run()
   //instanceof 를 사용해서 객체 내부에 Eagle 타입이 존재하면  eat(), run(), cry()
   

public class Ex01 {

	public static void main(String[] args) {
		
		Animal a1 = new Cat ();
		Animal a2 = new Tiger ();
		Animal a3 = new Dog ();
		Animal a4 = new Lion ();
		Animal a5 = new Eagle ();
		
		Animal[]arr = new Animal[] {a1,a2,a3,a4,a5};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Cat || arr[i] instanceof Tiger) {
				Animal1 aa1 = (Animal1)arr[i];
				aa1.cry();
				Animal2 aa2 = (Animal2)arr[i];
				aa2.run();
				//((Animal1)arr[i].cry();
				//((Animal2)arr[i].run();
			}
			if(arr[i] instanceof Dog || arr[i] instanceof Lion) {
				Animal2 aa1 = (Animal2)arr[i];
				aa1.run();
				Animal3 aa2 = (Animal3)arr[i];
				aa2.eat();
			}
			if(arr[i] instanceof Eagle) {
				Animal1 aa1 = (Animal1)arr[i];
				aa1.cry();
				Animal2 aa2 = (Animal2)arr[i];
				aa2.run();
				Animal3 aa3 = (Animal3)arr[i];
				aa3.eat();
			}
			System.out.println();
		}
			
		
		
	}

}
