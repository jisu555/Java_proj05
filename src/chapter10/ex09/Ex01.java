package chapter10.ex09;

class Car {
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;
	
	//생성자
	Car() {}
	public Car(String carName, String carColor, int maxSpeed, String carModel) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}
	
	//getter setter
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	//객체 자체를 프린트할 때 필드의 값 전체를 출력할 수 있도록 toString() : Object의 메소드
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 1. 기본생성자, 인풋을 받는 생성자
		// 2. getter, Setter 생성
		// 3. toString () 재정의 : 전체 메모리 내용 출력
		
		//4. 생성자를 통해서 값을 할당 후 메모리의 전체 내용 출력.
		//5. setter를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력.
				//getter를 사용해서 각 필드의 내용을 출력
		
			
		Car c1 = new Car("붕붕이","black",300,"K7");
			
		System.out.println(c1);		
		
		Car c2 = new Car();
		
		c2.setCarName("방방이");
		c2.setCarColor("white");
		c2.setMaxSpeed(200);
		c2.setCarModel("SM5");
		
		System.out.println(c2);

	}

}
