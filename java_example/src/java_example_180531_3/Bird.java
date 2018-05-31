package java_example_180531_3;

public class Bird implements Countable {
	
	public String name;
	
	Bird(String name){
		this.name=name;
	};
	void fly() {
		System.out.println(name+" 2마리 가 날아간다");
	};
	
	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println("2마리 "+name+" 가 있다");
		
	}

}
