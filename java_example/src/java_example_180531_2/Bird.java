package java_example_180531_2;

public class Bird extends Countable {
	
/*	public Bird(String name, int num) {
		// TODO Auto-generated constructor stub
		super(name, num);
		this.name=name;
		this.num=num;

	}*/

	Bird(String name, int num) {
		// TODO Auto-generated constructor stub
		super(name, num);
/*		this.name=name;
		this.num=num;	*/		
	}

	void fly() {
		System.out.println(name+"가 "+num+"마리 있다");
	};
	
	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println(num+"마리의 "+name+"가 있다");
		
	}

}
