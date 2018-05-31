package java_example_180531_2;

public class Tree extends Countable {

	

	public Tree(String name, int num) {
		super(name, num);
		this.name=name;
		this.num=num;
		
		// TODO Auto-generated constructor stub
	}

	void ripen() {
		System.out.println(name+"가 "+num+"그루 있다.");
	}
	
	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println(num+"개의 "+name+"가 있다");
		
	}

}
