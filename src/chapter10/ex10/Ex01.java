package chapter10.ex10;

class C {
	String stuID;
	String name;
	int age;
	
	C(String stuID, String name, int age) {
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}
	
	//c1.equals(c2)  //stuID 필드를 재정의해서, stuID가 같으면 true, 다르면 false
	
	@Override
	public boolean equals(Object obj) {	  
		if (this.name == ((C)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	//생성자, 기본생성자1, 생성자2
	C(){}
	
	

	//toString메소드 재정의 : 필드의 값을 출력, 객체
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1 = new C("1111", "홍길동", 20);
		C c2 = new C("1111", "홍길동", 20);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		
		
		
		
	}

}
