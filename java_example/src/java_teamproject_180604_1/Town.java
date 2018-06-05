/*package java_teamproject_180604;
import java.util.*;
public class Town extends Map{ //Map 상속

	public Town(String Slimebase, String Snailbase, String Golembase) {
		super(Slimebase, Snailbase, Golembase);
	}

	Scanner sc=new Scanner(System.in);
	
	@Override
	public void Town() {
		System.out.println("1. yes  |   2.  no");
		int iw=sc.nextInt();
		switch(iw) {
		case 1:
			System.out.println("---사냥터에 들어왔습니다!---");
			System.out.println("---사냥터를 선택해주세요---");
			System.out.println("1: "+Slimebase);
			System.out.println("2: "+Snailbase);
			System.out.println("3: "+Golembase);
		    System.out.println("선택 :");
		    break;
		case 2: 
			System.out.println("마을로 다시 귀환하였습니다!");
		break;
		}
	}
}*/