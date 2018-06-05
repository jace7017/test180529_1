package java_teamproject_180604;

import java.util.Scanner;

public class Account{
	String ID, Password;
	boolean result;
		

	public boolean login(String ID, String Password){
		this.ID = ID;
		this.Password = Password;
		if(ID.equals("a") &&  Password.equals("a"))
			return true;
		else
			return false;
	}
	
	public void logout(){
		System.out.println("로그아웃 되었습니다.");
		System.exit(0);
	}
	
	public void Account() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("수행할 서비스를 선택해주세요.");
		System.out.println("1. 로그인 || 2. 로그아웃");
		System.out.println("-------------------");
		System.out.print(">>");
		int choice = scan.nextInt();
		if(choice == 1){
				while(result != true) {
					System.out.print("아이디를 입력하세요 : ");
					ID = scan.next();
					System.out.print("비밀번호를 입력하세요 : ");
					Password = scan.next();
					result = login(ID, Password);
					if(result)
						System.out.println(ID + "님 로그인 되었습니다.");
					else
						System.out.println("ID 또는 Password가 올바르지 않습니다.");
				}
			}	
			else if(choice == 2)
				logout();
	}
}