package java_teamproject_180604_1;

public class main {

	public static void main(String[] args) {
		Account login = new Account();
		Character_Create Character_Create = new Character_Create();
		login.Account();	//계정 로그인, 로그아웃 메뉴
		Character_Create.create();	//캐릭터 생성
		Status status = new Status();
		Town1 town = new Town1();
		town.Town();
		status.status();
		Fight a = new Fight();
		a.fightSlime();
	}

}
