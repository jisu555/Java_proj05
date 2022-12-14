package chapter13.ex09;

interface Car {
	void run();
	void stop();
	void start();
}

class CarPlay{
	void abc(Car c1) {
		c1.run();
		c1.stop();
		c1.start();
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4번째 방법으로 출력, Car클래스의 abc(), 메소드의 매개변수에 구현한 코드 만들어서
		
		//1. 메소드 호출하기 위한 객체 생성
		CarPlay cp = new CarPlay();
		
		
		//2. 메소드 호출 시 Car 인터페이스의 메소드를 구현해서 매개변수로 인풋
		//익명 클래스
		cp.abc(new Car() {
			@Override
			public void run() {
				System.out.println("달린다.");
			}
			@Override
			public void start() {
				System.out.println("출발");
			}
			@Override
			public void stop() {
				System.out.println("멈춤");
			}
		});
		
		
		
	}

}
