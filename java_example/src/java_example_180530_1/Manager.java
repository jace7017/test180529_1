package java_example_180530_1;

public class Manager extends Employee {
	protected double bonus;
	Manager(String name, double money, double bonus) {
		super(name, money);
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}
	
	public double getBonus() {
		return bonus;
	}


	@Override
	
	public void moenyUp() {
		this.money=this.money*1.2;
	}
	
	
	/*
	@Override
	
	public double moenyUp() {
		money=money*1.2+bonus;
		
		return money;
	}*/
	
	

}
