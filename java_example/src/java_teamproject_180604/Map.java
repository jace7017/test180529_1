package java_teamproject_180604;

import java.util.*;

public class Map {

	//필드
	static String Slimebase;//슬라임 기지
	static String Snailbase;//달팽이 기지
	static String Golembase; //골렘 기지
	
	
    Scanner sc= new Scanner(System.in);
    
    	public Map(String Slimebase, String Snailbase, String Golembase) {
		this.Slimebase = Slimebase;
		this.Snailbase = Snailbase;
		this.Golembase = Golembase;
	}
	//메소드 사냥터로 갈지 마을로 갈지 선택여부
	public void hunting() {
		System.out.println("[1] : 사냥터로 가시겠습니까?");
		System.out.println("[2] : 마을로 돌아가시겠습니까?");
        System.out.println("선택 :");
	}
	
	public void Town() {
		System.out.println("사냥터로 다시 들어가시겠습니까?");
	}
}
