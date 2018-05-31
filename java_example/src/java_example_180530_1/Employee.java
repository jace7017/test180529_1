package java_example_180530_1;

public class Employee {
	
	protected String name;
	protected double money;
	
	public Employee(String name, double money){
		this.name=name;
		this.money=money;
	}
	
	
	
	//employee의 이름, 급여 정보를 가져오기 위한 메소드
	/*
	*/
	
	public String getName() {
		return name;
	}
	
	public double getmoney() {
		return money;
	}
	public void moenyUp() {
		money=money*1.1;
		
	}
	

}
