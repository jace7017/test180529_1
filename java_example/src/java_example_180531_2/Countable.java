package java_example_180531_2;

public abstract class Countable {
	//필드
	/*protected */String name;
	/*protected */int num;
	
	//생성자
	Countable(String name, int num){
		this.name=name;
		this.num=num;		
	}
	//추상 메소드
	abstract void count();
	

}
