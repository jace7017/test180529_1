package java_teamproject_180604_1;

import java.util.*;

public class Character_Create extends Status{

	Account account = new Account();
//	Town1 town = new Town1();
	Scanner scan = new Scanner(System.in);
	int arr[];
	//캐릭터 기본 정보 생성
	public void create() {
		Str = (int)(Math.random()*10)+1; // 1~10까지의 랜덤 값 생성
		Dex = (int)(Math.random()*10)+1; // 1~10까지의 랜덤 값 생성
		Inte = (int)(Math.random()*10)+1; // 1~10까지의 랜덤 값 생성
		Luck = (int)(Math.random()*10)+1; // 1~10까지의 랜덤 값 생성
		Attack = Str;	//공격력은 힘의 1의 배수... 무기 + STR 무기 미구현
		Defense = 0;	//방어력 아이템에 따라... 미완성
		Hp = Str * 10;	//HP는 힘의 10배수
		Mp = Inte * 10;	//MP는 지능의 10배수
		//AVOID = (double)(Math.random() * LUCK);	//회피율은 
		Avoid = 100 * ((double)Luck / 100);
		
		System.out.println("===================");
		System.out.println("캐릭터 능력치 랜덤 생성");
		System.out.println("===================");
		status();
	}
}