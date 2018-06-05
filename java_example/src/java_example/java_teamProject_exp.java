package java_example;

public class java_teamProject_exp{
	
	//	level 1 -> level 2로 가기위해 exp 30 필요
	//	exp = level이 오를때 마다 * 1.3
	int level=1;  
	int exp=0; //현재
	int expMax; //최대치
	int monsterExp=14; //
	int monsterExp1=20;
	
	
	java_teamProject_exp(int level, int expMax) {
		this.expMax=expMax;
		this.level=level;
	}
	

	public void expStorge() {
		
			
		System.out.println("현재 경험치 " + exp );
		this.exp=monsterExp+exp;
		this.exp=monsterExp1+exp;
		System.out.println("획득 경험치 " + monsterExp );

		
		
		
		if(exp>=expMax) {
				level=level+1;				
				exp=exp-expMax;
				System.out.println("레벨이 "+level+"이 되었습니다.");
				expMax=(int) (expMax*1.3);
				
				/*
				 * 캐릭터 정보 출력
				 *
				 * 
				 * System.out.println("현재 경험치 " +exp);
				 * System.out.println("다음 레벨까지 경험치 " +(expMax-exp));
				 * 
				 */
				
				
				
				System.out.println("현재 경험치 " +exp); // 캐릭터정보 1 
				
	
				if(exp>expMax) {
					exp=expMax-1;					
				}
				/*System.out.println("현재 경험치 " +exp);*/

				System.out.println("다음 레벨까지 경험치 " +(expMax-exp)); // 캐릭터정보 2
				

				
			}

			
		}


}
	


