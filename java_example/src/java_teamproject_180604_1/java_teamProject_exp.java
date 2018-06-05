package java_teamproject_180604_1;

public class java_teamProject_exp /*extends Character_Create*/{
	
	//	level 1 -> level 2로 가기위해 exp 30 필요
	//	exp = level이 오를때 마다 * 1.3
	int level=1;  
	int exp = 0; //현재
	int expMax = 50; //최대치
	int monsterExp=1;

	void expUp(int monsterExp) {
		System.out.println("현재 경험치 " + exp );
		this.exp = monsterExp + exp;
		System.out.println("획득 경험치 " + monsterExp );
		System.out.println("다음 레벨까지 경험치 " +(expMax-exp)); // 캐릭터정보 2

		if(exp >= expMax) {
				level = level + 1;				
				exp = exp - expMax;
				System.out.println("레벨이 " + level + "이 되었습니다.");
				expMax = (int)(expMax * 1.5);
				
				/*
				 * 캐릭터 정보 출력
				 * System.out.println("현재 경험치 " + exp);
				 * System.out.println("다음 레벨까지 경험치 " + (expMax - exp));
				 */
				
				if(exp>expMax) {
					exp=expMax-1;					
				}
				System.out.println("현재 경험치 " + exp);
				System.out.println("다음 레벨까지 경험치 " + (expMax - exp)); // 캐릭터정보 2
			}
		}
	public void expDown() {	//경험치 하락(캐릭터 사망시)
		System.out.println("캐릭터가 사망하였습니다.");
		if(0 < exp - expMax / 10) {
			System.out.println("경험치 " + (expMax / 10) + "감소했습니다.");
			exp -= expMax / 10;
			System.out.println("현재 경험치 " + exp);
		} else {
			System.out.println("경험치 " + exp + "감소했습니다.");
			exp -= exp;
			System.out.println("현재 경험치 " + exp);
		}
	}
}