package javaexp.a03_calculator;

import java.util.Scanner;

public class A03_EquCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 비교 연산자 1. 비교를 통해서 논리값 boolean(true/false)을 저장하거나 출력하는 연산자 ... =가 무조건 뒤 > ,
		 * < , >= , <=, ==, != 
		 	25 > 3 : true 
		 	25 < 3 : false 
		 	25 >= 3 : true 
		 	25 <= 3 false 
		 	25 == 3 : false 같을때 
		 	25 != 3 : true 같지 않을 때
		 * 
		 * ex) 20세 이상일시 성년 여부를 처리 할때 int age = 17; 성년 여부 : age>=20 ...false age = 20; 성년
		 * 여부 : age>=20 ...true
		 * 
		 */
		// 비교연산자 예시
		int age = 25;
		System.out.println(age + "세 성년여부 : " + (age >= 20));
		age = 18;
		System.out.println(age + "세 성년여부 : " + (age >= 20));
		System.out.println("---------------------");

		int corNum = 3;
		int inputNum = 3;
		boolean isHit = corNum == inputNum;
		System.out.println("정답여부:" + isHit);
		System.out.println("----------------------");
//
//		System.out.println("# 놀이공원 입장 #");
//		System.out.print("나이를 입력하세요:");
//		Scanner sc = new Scanner(System.in);
//		//import 단축키 : ctrl+shift+o, strl+s
//		int inAge = Integer.parseInt(sc.nextLine());
//		boolean isFree = inAge>=65 || inAge>=65 || inAge<3;
//		// 논리합으로 둘중에 하나이상이면 true이면 처리
////		System.out.println("무료여부:"+isFree);
		
		
		//ex) Scanner를 통해서 국어/영어/수학 점수를 입력 받고
		//논리합(or)로 하나라도 80점이상이면 상금여부가 true가 처리되게 하시오
		
		//1. Scanner 객체 생성
		//2. 국어 입력 변수로 할당
		//3. 영어 입력 변수로 할당
		//4. 수학 입력 변수로 할당
		//5. 상금 여부 isDadPrize로 선언하여
//			국어>=80 || 영어>=80 || 수학>=80
		//6. 상금 여부 출력
		
		System.out.println("# 하나라도 80점 이상이면 합격 # ");
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수:"); 
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수:");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수:");
		int math = Integer.parseInt(sc.nextLine());
		
		boolean isPass = kor>=80 || eng>=80 || eng>=80;
		System.out.println("상금여부:"+ isPass);
		
		
		
		/*
		 # 논리 연산자 
		 1. 위 비교 연산자에 의한 결과를 2개 이상으로 연결한 것 
		 	1) 논리합(or) : || 사용 비교연산식을 2개 이상 처리할 떄, 
		 		두 조건 비교연삭식에서 하나이상 true이면 true 
		 		
		 		ex) 놀이동산에서 나이가 3세 미만, 65세 이상은 무료입장일 때 무료여부를 check 할 때 
		 			age<=3 || age>=65 
		 		
		 		ex) 과목의 점수가 하나라도 80점 이상이면 true 
		 			kor>=80 || end>=80 || math >= 80 
		 		
		 	
		 	2) 논리곱(and) : && 사용 두 조건 비교 연삭식에서 
		 					모두 다 true이어야지 true이고 그외엔 false인 경우
		 	 			ex) 로그인시 id와 pw 모두 일치해야 로그인 된다. 
		 	 				==> 모두 true이여야함 
		 	 			ex) 청소년 요금제는 14세 이상 19세이하일때 적용된다. 
		 	 				==> age>=14 && age<=19 
		 	3) 부정연산자 : ! 사용 위 논리연삭식을 포함해서 
		 				비교연산자가 true이면 false 또는 위 논리연삭식을 포함해서 
		 				비교연산자가 false이면 true로 처리되는 연산자 조건식 
		 				
		 				ex) 청소년 요금제(14세 이상 19세 이하)에 해당하지 않을때 true 
		 				!(age=>14 && age<=19) 
		 				
		 				ex) point 70점 이상 합격 그 미만은 불합격하는
		 				!(point>=70)


		 */

	}

}
