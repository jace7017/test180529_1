package java_example_ID;

public class java_teamproject_level {
	
		
		int level=1;
		int levelMax=100;
		int exp; //현재
		int expMax; //최대치
		
		java_teamproject_level (int level, int exp) {
			this.level=level;			
			this.exp=exp;
		}		
		

		public void levelStorge() {
			if(exp>=expMax&&level<=levelMax) {
				for(int i=0; i<=level+1; i++) {					
					this.level=i;
					System.out.println("레벨이 "+i+" ");
				}
				expMax=(int) ((int)exp*1.4);
			}
		}
		



}
