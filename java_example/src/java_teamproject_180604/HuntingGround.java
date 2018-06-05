package java_teamproject_180604;
import java.util.*;
public class HuntingGround extends Map1{
	
	//필드
		static String Slimebase;//슬라임 기지
		static String Snailbase;//달팽이 기지
		static String Golembase; //골렘 기지
	
	Scanner scan = new Scanner(System.in);

	@Override
	public void huntingGround() {
		System.out.println("---사냥터를 선택해주세요---");
		System.out.println("1 : 슬라임 기지");
		System.out.println("2 : 달팽이 기지");
		System.out.println("3 : 골렘 기지");
		System.out.println("4 : 마을로 돌아가기");
	    System.out.print("선택 > ");
	    int select = scan.nextInt();
		switch(select) {
			case 1:
				
			    break;
			case 4: 
				System.out.println("마을로 귀환하였습니다!");
				Town();
				break;
		}
	}
}