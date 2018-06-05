package java_example_ID;

import java.util.Scanner;

public class ch6_22_memberServiceExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ch6_22_memberService memberService = new ch6_22_memberService();
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("수행할 서비스를 선택해주세요.");
			System.out.println("1.로그인 || 2.로그아웃");
			System.out.println("-------------------");
			System.out.print(">>");
			int choice = scn.nextInt();
			switch(choice) {
				case 1:
					System.out.println("계정 생성하기 " );
					System.out.println("ID 입력 ");
					memberService.ID=scn.next();
					System.out.println("PW 입력 ");
					memberService.Password=scn.next();
					
					
			
			
				case 2: 
					System.out.print("아이디를 입력하세요 : ");
					memberService.ID = scn.next();
					System.out.print("비밀번호를 입력하세요 : ");
					memberService.Password = scn.next();
					boolean result = memberService.login(memberService.ID, memberService.Password);
					if(result)
						System.out.println(memberService.ID + "님 로그인 되었습니다.");
					else
							System.out.println("id 또는 password가 올바르지 않습니다.");
					break;
				case 3:{
					memberService.logout();
				}
			}
		}
	}
}