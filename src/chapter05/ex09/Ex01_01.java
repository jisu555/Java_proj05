package chapter05.ex09;

public class Ex01_01 {

	public static void main(String[] args) {
		
		System.out.println("===== Step1. args배열로 들어오는 모든 내용 출력=====");
		for (int i =0; i <args.length; i++) {
			System.out.print(args[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("=====Step2. 기본출력======");
		System.out.println();
		
		System.out.println("\t국어"+"\t영어"+"\t수학"+"\t과학"+"\t<합계>"+"\t<평균>");
		System.out.println("=======================================================");
		for (int i=0; i<args.length; i++) {
			if(i%5==0) {
				if(i!=0) {
					System.out.println();   
				}
			}
			System.out.print(args[i]+"\t");
			//System.out.println(sum1 + "\t");
			
		}
		
		System.out.println();
		System.out.println("==========================================================");
		System.out.println("<합계> :");
		System.out.println("<평균> :");
		System.out.println();
		System.out.println();
		
		
		System.out.println("======step3. 합계/평균 계산 후 출력==========");
		System.out.println();
		
		int sum1 =0;
		double avg1 =1.0;
		
		//아랫라인의 합계 및 평균 변수 선언
		int korsum=0;
		int engsum=0;
		int mathsum=0;
		int siencesum=0;
		double koravg ;
		double engavg =1.0;
		double mathavg=1.0;
		double sienceavg =1.0;
		
		//allSUm, allAvg
		int allSum=0;
		double allAvg;
		
		
		System.out.println("\t국어"+"\t영어"+"\t수학"+"\t과학"+"\t<합계>"+"\t<평균>");
		System.out.println("=======================================================");
		for (int i=0; i<args.length; i++) {
			if(i%5==0) {
				if(i!=0) {
					System.out.println();
				}
			}
			
			//sum1,avg1
			if(i%5==0) {
				sum1=0;
			}
			if(i%5 != 0) {
				sum1+=Integer.parseInt(args[i]);
			}
			if(i==4|| i==9 || i==14 || i==19) {
				avg1 = sum1/4.0;
			}
			
			//출력
			System.out.print(args[i]+"\t");
			if(i==4|| i==9 || i==14 || i==19) {
				System.out.print(sum1 + "\t"+ avg1);
			}
			
			//마지막라인에 라인삽입
			if(i==args.length -1) {
				System.out.println();
				System.out.println("=========================================================");
			}
			
			
			//아랫라인 합계/평균 구하기
			
			if (i==1 || i==6 || i==11 || i==16) {
				korsum += Integer.parseInt(args[i]);
			}
			if (i==2 || i==7 || i==12 || i==17) {
				engsum += Integer.parseInt(args[i]);
			}
			if (i==3 || i==8 || i==13 || i==18) {
				mathsum += Integer.parseInt(args[i]);
			}
			if (i==4 || i==7 || i==14 || i==19) {
				siencesum += Integer.parseInt(args[i]);
			}
			
			//전체합계 (allSum)
			if (i !=0 && i%5 !=0) {
				allSum += Integer.parseInt(args[i]);
			}
		}
			//아랫라인 합계 및 평균 출력
			koravg = korsum /4.0;
			engavg = engsum /4.0;
			mathavg = mathsum /4.0;
			sienceavg = siencesum /4.0;
			
			allAvg=allSum /16.0;
			
			System.out.print("<합계> :");
			System.out.print(korsum +"\t" + engsum + "\t" + mathsum + "\t"+ siencesum + "\t" + allSum + "\t"+ allAvg+"\n");
			System.out.print("<평균> :");
			System.out.println(koravg + "\t" + engavg +"\t" + mathavg+ "\t" + sienceavg + "\n");
			
			System.out.println();
			System.out.println();
			
			
			
		}
		
		
		
	}

