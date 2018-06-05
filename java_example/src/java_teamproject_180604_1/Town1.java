package java_teamproject_180604_1;

import java.util.*;

public class Town1 extends Map1{
	
	Scanner scan = new Scanner(System.in);
	Character_Create charic = new Character_Create();
	HuntingGround hun = new HuntingGround();
	Account account = new Account();
	
	@Override
	public void Town(){
		while(true) {
			System.out.println("===================");
			System.out.println("1. 캐릭터 정보 보기");
			System.out.println("2. 사냥터 가기");
			System.out.println("3. 로그아웃");
			System.out.println("===================");
			System.out.print("선택 > ");
			int select = scan.nextInt();
			switch(select) {
				case 1: charic.status();
						break;
				case 2: hun.huntingGround();
						break;
				case 3: account.logout();
						break;
			}

		}

	}
	
}
