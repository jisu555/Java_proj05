package chapter05.ex09;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 국어  영어  수학  과학 			국어  영어  수학  과학     국어  영어  수학  과학			  국어  영어  수학  과학
홍길동     70   88   77  99    이순신   80   68   87  79 	  60   86  87   30		홍길순  77   56   80  99 
		 
메인 메소드 args로 아래와 같은 값이 인풋되었을 경우 <출력>과 같이 출력해 보세요.
args : 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99

<for문을 사용해서 출력하세요>

<출력>
	     국어	   영어    수학    과학		 <합계>  <평균>
=================================================
홍길동	70		88	  77	 99
이순신	80		68	  87	 79
김똘똘	60		86	  87	 30
홍길순	77		56	  80	 99
=================================================
<합계>
<평균>
		 */
		
		System.out.println("<출력>");
		System.out.println("\t국어\t영어\t수학\t과학\t<합계>\t<평균>");
		System.out.println("=======================================================");
		
		String hong;
		String lee;
		String kim;
		String hongsun;
		double sum=0;
		double avg;
		int kor;
		int eng;
		int math;
		int sience;
		String check =null;
		String kor1;
		String eng1;
		String math1;
		String sience1;
		double all_sum=0;
		double all_avg;
		
		
		for (int i=0; i<args.length; i++) {
			check = String.valueOf(args[i]);
			sum =0;
			if(check.equals("홍길동")) {
				hong=check;
				System.out.print(hong+"\t");
				for(int j=1; j<5; j++) {
					switch (j) {
					case 1 : 
						kor1=args[j];
						kor = Integer.parseInt(kor1);
						System.out.print(kor+"\t");
						sum += kor;
						break;
					case 2 : 
						eng1=args[j];
						eng = Integer.parseInt(eng1);
						System.out.print(eng+"\t");
						sum+= eng;
						break;
					case 3 : 
						math1=args[j];
						math = Integer.parseInt(math1);
						System.out.print(math+"\t");
						sum+= math;
						break;
					case 4 : 
						sience1=args[j];
						sience = Integer.parseInt(sience1);
						System.out.print(sience+"\t");
						sum+= sience;
						break;
					default :
						break;
					}
				}
				avg = sum / 4.0;
				all_sum += sum;
				System.out.print(sum + "\t");
				System.out.print(avg + "\n");
			} else if (check.equals("이순신")) {
				lee=check;
				System.out.print(lee+"\t");
				for(int j=6; j<10; j++) {
					switch (j) {
					case 6 : 
						kor1=args[j];
						kor = Integer.parseInt(kor1);
						System.out.print(kor+"\t");
						sum += kor;
						break;
					case 7 : 
						eng1=args[j];
						eng = Integer.parseInt(eng1);
						System.out.print(eng+"\t");
						sum+= eng;
						break;
					case 8 : 
						math1=args[j];
						math = Integer.parseInt(math1);
						System.out.print(math+"\t");
						sum+= math;
						break;
					case 9 : 
						sience1=args[j];
						sience = Integer.parseInt(sience1);
						System.out.print(sience+"\t");
						sum+= sience;
						break;
					default :
						break;
					}
				}
				avg = sum / 4.0;
				all_sum += sum;
				System.out.print(sum + "\t");
				System.out.print(avg + "\n");
			} else if (check.equals("김똘똘")) {
				kim=check;
				System.out.print(kim+"\t");
				for(int j=11; j<15; j++) {
					switch (j) {
					case 11 : 
						kor1=args[j];
						kor = Integer.parseInt(kor1);
						System.out.print(kor+"\t");
						sum += kor;
						break;
					case 12 : 
						eng1=args[j];
						eng = Integer.parseInt(eng1);
						System.out.print(eng+"\t");
						sum+= eng;
						break;
					case 13 : 
						math1=args[j];
						math = Integer.parseInt(math1);
						System.out.print(math+"\t");
						sum+= math;
						break;
					case 14 : 
						sience1=args[j];
						sience = Integer.parseInt(sience1);
						System.out.print(sience+"\t");
						sum+= sience;
						break;
					default :
						break;
					}
				}
				avg = sum / 4.0;
				all_sum += sum;
				System.out.print(sum + "\t");
				System.out.print(avg + "\n");
			} else if (check.equals("홍길순")) {
				hongsun=check;
				System.out.print(hongsun+"\t");
				for(int j=16; j<20; j++) {
					switch (j) {
					case 16 : 
						kor1=args[j];
						kor = Integer.parseInt(kor1);
						System.out.print(kor+"\t");
						sum += kor;
						break;
					case 17 : 
						eng1=args[j];
						eng = Integer.parseInt(eng1);
						System.out.print(eng+"\t");
						sum+= eng;
						break;
					case 18 : 
						math1=args[j];
						math = Integer.parseInt(math1);
						System.out.print(math+"\t");
						sum+= math;
						break;
					case 19 : 
						sience1=args[j];
						sience = Integer.parseInt(sience1);
						System.out.print(sience+"\t");
						sum+= sience;
						break;
					default :
						break;
					}
				}
				avg = sum / 4.0;
				all_sum += sum;
				System.out.print(sum + "\t");
				System.out.print(avg + "\n");
			} else {
				
			}
		}
		all_avg = all_sum /4.0;
		System.out.println("==========================================================");
		System.out.println("<합계>\t"+ all_sum);
		System.out.println("<평균>\t"+ all_avg);
		
		
	}

}
