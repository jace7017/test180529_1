package java_teamproject_180604_1;

public class Status{
	//캐릭터 정보
	public static int Str;	//힘
	public static int Dex;	//민첩
	public static int Inte;	//지능
	public static int Luck;//행운
	public static int Attack;	//공격력
	public static int Defense;	//방어력
	public static int Hp;	//체력
	public static int Mp;	//마나
	public static double Avoid; //회피
	
	public int getStr() {
		return Str;
	}
	public void setStr(int str) {
		Str = str;
	}
	public int getDex() {
		return Dex;
	}
	public void setDex(int dex) {
		Dex = dex;
	}
	public int getInte() {
		return Inte;
	}
	public void setInte(int inte) {
		Inte = inte;
	}
	public int getLuck() {
		return Luck;
	}
	public void setLuck(int luck) {
		Luck = luck;
	}
	
	public void status() {
		System.out.println("HP : " + Hp);
		System.out.println("MP : " + Mp);
		System.out.println("STR : " + Str);
		System.out.println("DEX : " + Dex);
		System.out.println("Int : " + Inte);
		System.out.println("LUCK : " + Luck);
		System.out.println("ATT : " + Attack);
		System.out.println("DEF : " + Defense);
		System.out.println("Avoid : " + Avoid);
	}
	
	
	

}
