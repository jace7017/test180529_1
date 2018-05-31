package java_example_180530_1;

public class Executive extends Manager {
	

	Executive(String name, double money, double bonus) {
		super(name, money, bonus);
		// TODO Auto-generated constructor stub
	}
/*	Executive(Stirng name) {
		super(name);
		// TODO Auto-generated constructor stub
	}*/

	int stock;
	
	public void Executive(int stock){
		this.stock=stock;
		
	}
	
	@Override
	
	public void moenyUp() {
		money=money*1.3+bonus+stock;
		
		
	}

}
