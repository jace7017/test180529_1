package java_example;

import java.util.Random;

public class java_teamProject_Monster_Info{
	
	
//	----------------------------------------------------------
	
	boolean Attack = true;
	int charactorAttack=40;
	
	
	
//	int hpTmp; //받은 피해량
	
	//슬라임
	String slime = "슬라임";
	int slimeHp;			//체력
	int slimeAttack;		//공격력
	int slimeShild;			//방어력
	int slimeAvoidance;		//회피율
	int slimeExp;			//경험치
	
	//골렘
	String golem = "골렘";
	int golemHp;			//체력
	int golemAttack;		//공격력
	int golemShild;			//방어력
	double golemAvoidance;	//회피율
	int golemExp;			//경험치
	
	//달팽이
	String snail = "달팽이";
	int snailHp;			//체력
	int snailAttack;		//공격력
	int snailShild;			//방어력
	double snailAvoidance;	//회피율
	int snailExp;			//경험치
	
	
	
	
			
	java_teamProject_Monster_Info(){
		
		slimeHp = 80;
		slimeAttack = 15;
		slimeShild = 27;
		slimeAvoidance = 30;
		slimeExp=16;
		
		golemHp = 41;
		golemAttack = 28;
		golemShild = 30;
		golemAvoidance = 15;
		golemExp=28;
		
		snailHp = 21;
		snailAttack = 7;
		snailShild = 7;
		snailAvoidance = 20;
		snailExp=7;
	}
	
	
	//////////메소드 연습창
	
	public void fightSlime() {
		Random randomSlimeAvoidance = new Random();
		
		System.out.println(slime + " 정보"+"");
		System.out.println("체력 : " + slimeHp+ "\t" + "공격력 : " + slimeAttack + "\t"
							+ "방어력 : " + slimeShild + "\t" + "회피율 : " + slimeAvoidance + "%"+"\n");
		
		//캐릭터 공격 메소드 [[[넣어주기]]]------------------------------------------------------------------------------------------------
		
		

		
		System.out.println(slimeHp);
		while(Attack) {
			if(slimeHp>0) {
				
			}
			
		}
	}
	/*		if(slimeHp>0)
			

			if(randomSlimeAvoidance.nextInt(10) < 3){			
				System.out.println(slime+"이 30% 확률로 회피하였습니다.");
				System.out.println(slime+" 체력 : " + slimeHp);		
			}else if(slimeHp<1||slimeHp==0)
				break;		
			else {			
				System.out.println(slime+"이 공격받았습니다.");			
				slimeHp=slimeHp-(int) (charactorAttack-(0.1*slimeShild));
				System.out.println(slime+"의 남은 체력 : " +slimeHp);
			}
			}
		}*/
	}
			

//
//
//		if(randomSlimeAvoidance.nextInt(10) < 3){			
//			System.out.println(slime+"이 30% 확률로 회피하였습니다.");
//			System.out.println(slime+" 체력 : " + slimeHp);		
//		}else if(slimeHp<1||slimeHp==0)
//			break;		
//		else {			
//			System.out.println(slime+"이 공격받았습니다.");			
//			slimeHp=slimeHp-(int) (charactorAttack-(0.1*slimeShild));
//			System.out.println(slime+"의 남은 체력 : " +slimeHp);
//		}
//		}
//	}
//}
////		
		

		

//		
//
//		
//		System.out.println(slimeHp);
//		while(Attack) { 
//
//		if(randomSlimeAvoidance.nextInt(10) < 3){			
//			System.out.println(slime+"이 30% 확률로 회피하였습니다.");
//			System.out.println(slime+" 체력 : " + slimeHp);		
//		}else if(slimeHp<1||slimeHp==0)
//			break;		
//		else {			
//			System.out.println(slime+"이 공격받았습니다.");			
//			slimeHp=slimeHp-(int) (charactorAttack-(0.1*slimeShild));
//			System.out.println(slime+"의 남은 체력 : " +slimeHp);
//		}
//		}
//	}
//}
//		


//	----------------------------------------------------------
	

	

	


