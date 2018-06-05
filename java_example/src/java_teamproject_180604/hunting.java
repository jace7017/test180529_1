package java_teamproject_180604;
import java.util.*;
public class hunting extends Map{ //Map 상속

	//필드 사냥터


	//생성자
	public hunting(String Slimebase, String snailbase, String Golembase) {
		super(Slimebase,Snailbase,Golembase);
	}
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void hunting() {		
		  int ic = sc.nextInt();
	        System.out.println(ic);
		switch(ic) {
		case 1:
			System.out.println("사냥터에 들어왔습니다");
			System.out.println("사냥터를 선택해주세요");
			System.out.println("1: "+Slimebase);
			System.out.println("2: "+Snailbase);
			System.out.println("3: "+Golembase);
			System.out.print("선택: ");
			break;
		case 2:
			System.out.println("마을로 귀환하였습니다!");
			
		break;
		}}
	
}