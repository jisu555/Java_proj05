package chapter16.ex04;

import java.util.ArrayList;

//car 객체를 3개정도 생성해서 ArrayList에 저장 후 객체를 출력 시 필드의 값을 출력하도록 함.
// for, Enhanced For, 컬렉션 객체 자체를 출력 

class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	Car(String company, String carModel, String color, int maxSpeed){
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Car> a1 = new ArrayList();
		
		Car c1 = new Car("삼성","SM7","black",100);
		Car c2 = new Car("현대","그랜저","white",200);
		Car c3 = new Car("아우디","Q8","silver",300);
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		
		System.out.println("=====For문======");
		for(int i = 0; i < a1.size(); i++) {
			Car cc1 = a1.get(i);
			System.out.println(cc1);
		}
		
		System.out.println("=====Enhanced For문=====");
		for (Car k : a1) {
			System.out.println(k);
		}
		
		System.out.println("=====컬렉션 객체 자체======");
		System.out.println(a1);
		
	}

}
