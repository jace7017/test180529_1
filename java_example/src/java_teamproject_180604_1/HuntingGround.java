package java_teamproject_180604_1;
import java.util.*;
public class HuntingGround extends Map1{
	
	//필드
		static String Slimebase;//슬라임 기지
		static String Snailbase;//달팽이 기지
		static String Golembase; //골렘 기지
	Fight fight = new Fight();
	Scanner scan = new Scanner(System.in);

	@Override
	public void huntingGround() {
		System.out.println("---사냥터를 선택해주세요---");
		System.out.println("1 : 달팽이 기지");
		System.out.println("2 : 슬라임 기지");
		System.out.println("3 : 골렘 기지");
	    System.out.print("선택 > ");
	    int select = scan.nextInt();
		switch(select) {
			case 1: fight.fightSlime();	//달팽이 사냥
					break;
			case 2: fight.fightSlime();	//슬라임 사냥
					break;
			case 3: fight.fightSlime();	//골렘 사냥
					break;
		}
	}
}