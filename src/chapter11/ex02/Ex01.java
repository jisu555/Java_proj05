package chapter11.ex02;


class Student {
	//상속, 업캐스팅, 다운캐스팅, 객체를 배열에 넣어서 배열에 저장된 값을 출력
	
	//필드
	String name;
	
	Student (){}

	public Student(String name) {
		this.name = name;
	}
	
	//합계와 평균을 출력하는 메소드
	void sum_avg (){}
}

class Student_Sub extends Student{
	//자식의 필드
	int kor ;	//국어점수
	int eng ;	//영어점수
	int math;	//수학점수
	
	
	Student_Sub (){}
	
	public Student_Sub(String name, int kor, int eng, int math) {
		super(name);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	//부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor, eng, math 의 합계와 평균을 출력하는 메소드
	
	@Override
	void sum_avg () {
		int sum =  kor + eng + math ;
		double avg = sum/3.0;
		String avg1 = String.format("%.2f", avg );
		System.out.print("학생 : " + name + " /" + " 국어점수 :" + kor + " 영어점수" + eng + " 수학점수" + math + " / 합계 : " + sum + " 평균 : " + avg);
		System.out.println();
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		// 
		//생성자를 사용해서 객체 생성시 필드의 값을 할당하고
		/*
		홍길동 70 80 77
		이순신 80 68 87
		김똘똘 60 86 87
		홍길순 77 56 80
		강감찬 55 66 77
		*/
		
		Student s1 = new Student_Sub ("홍길동", 70, 80, 77);
		Student s2 = new Student_Sub ("이순신", 80, 68, 87);
		Student s3 = new Student_Sub ("김똘똘", 60, 86, 87);
		Student s4 = new Student_Sub ("홍길순", 77, 56, 80);
		Student s5 = new Student_Sub ("강감찬", 55, 66, 77);
		
		// Student 배열변수 arr 변수에 모든 객체를 저장해서 
		Student [] arr = new Student [] {s1, s2, s3, s4, s5};
		
		int[] sum = new int [3];
				
		for(int i =0; i<arr.length; i++) {
			arr[i].sum_avg();
			
			sum[0]+= ((Student_Sub) arr[i]).kor;
			sum[1]+= ((Student_Sub) arr[i]).eng;
			sum[2]+= ((Student_Sub) arr[i]).math;
		
		if (i == arr.length-1) {
			System.out.println("=================================");
			System.out.printf("5명의 국어 점수 합 : %d, 평균 : %4.2f", sum[0], sum[0]/5.0);
			System.out.println();
			System.out.printf("5명의 영어 점수 합 : %d, 평균 : %4.2f", sum[1], sum[1]/5.0);
			System.out.println();
			System.out.printf("5명의 수학 점수 합 : %d, 평균 : %4.2f", sum[2], sum[2]/5.0);
		}
		
		}
		
		
		
		// 배열의 값을 for문으로 출력할 때 
			 //오버라이딩된 메소드 출력  < 그 학생의 국어,영어,수학의 합계,평균
			 //5명의 학생의 국어에 대한 합계, 평균
			 //5명의 학생의 영어에 대한 합계, 평균
			 //5명의 학생의 수학에 대한 합계, 평균
		
		
		
		
	}
}