package java_example_180531_4;

import java.util.Scanner;

public class ch10_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("첫 번째 값 입력");
		int num1=scn.nextInt();
		
		System.out.println("두 번째 값 입력");
		int num2=scn.nextInt();
		
		try{
			double s;
			s=num1/num2;
		}catch(ArithmeticException e) {
			System.out.println("오류발생");
		}finally {
			System.out.println("계속......실행");
		}
		

	}

}
