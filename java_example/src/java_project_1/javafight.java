package java_project_1;

import java.util.Random;

public interface javafight extends javamonsterinfo{
	
	
	java_exp charic = java_exp();
	int exp = 0;
	
	
	
	boolean Attack = true;
	public void fightSlime() {
		Random randomSlimeAvoidance = new Random();
		System.out.println("===================");
		System.out.println(slime + " 정보");
		System.out.println("체력 : " + slimeHp);
		System.out.println("공격력 : " + slimeAttack);
		System.out.println("방어력 : " + slimeShild);
		System.out.println("회피율 : " + slimeAvoidance);
		System.out.println("===================");
		
		//캐릭터 공격 메소드 [[[넣어주기]]]------------------------------------------------------------------------------------------------

		while(true) { 
			System.out.println(slime+" 체력 : " + slimeHp);		
			if(0 < slimeHp) { //slimeHp가 0이상일 때 
				if(randomSlimeAvoidance.nextInt(10) < 3){			
					System.out.println(slime+"이 공격을 회피하였습니다.");
					System.out.println("===================");
				}
				slimeHp = slimeHp - (int)(charactorAttack-(0.1 * slimeShild));
				System.out.println(slime + "이" + (int)(charactorAttack-(0.1 * slimeShild)) + "공격받았습니다.");
				if(0 < slimeHp) {
					System.out.println(slime+"의 남은 체력 : " +slimeHp);
					System.out.println("===================");

				} else {
					charic.expUp(slimeExp); 
					System.out.println(slime+"이 죽었습니다.");
					System.out.println("===================");
					break;
					}
			}
		}
	}
	private java_teamProject_exp java_teamProject_exp() {
		// TODO Auto-generated method stub
		return null;
	}

}
