package chapter15.ex10;

//제너릭 클래스 / 제너릭 메소드를  사용해서 두 점의 좌표 값으로 넓이를 구하는 프로그램 작성

//점의 좌표를 처리하는 클래스 생성. <제너릭 클래스>
class Point<X,Y>{
	X x;
	Y y;
	
	//생성자를 통해서 t, v의 값을 입력   (private이 아니라서 setter사용 안해도 됨 setter로 해도되기도함)
	Point(){}		//기본 생성자
	Point(X x, Y y){	//x : x좌표 , y : y좌표
		this.x = x;
		this.y = y;
	}
	
	//getter만 생성
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
}

//제너릭 메소드 : 일반 클래스 내부에 제너릭 메소드
class GenericMethod {
	
	//makeRectangle() 메소드를 호출 시 
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		// 두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌.
		
		double w = (double)p2.getX() - (double)p1.getX();
		double h = (double)p2.getY() - (double)p1.getY();
		
		/*
		double a = ((Number)p1.getX()).doubleValue();
		double b = ((Number)p2.getX()).doubleValue();
		double c = ((Number)p1.getY()).doubleValue();
		double d = ((Number)p2.getY()).doubleValue();
		
		double w = b - a ;
		double h = d - c ;
		*/
		return w * h;
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 두 점의 좌표를 저장하는 p1 , p2 객체 생성
		Point <Double,Double>p1 = new Point<>(5.0,5.0);
		Point <Double,Double>p2 = new Point<>(10.0,10.0);
		
		
		//makeRectangle(p1,p2) <== 두 점의 값을 받아서 넓이를 처리해서 리턴으로 받아옴
		double a = GenericMethod.makeRectangle(p1,p2);
		System.out.println(a);
		
		
		
		 
		
		
		
		
		
		
	}

}
