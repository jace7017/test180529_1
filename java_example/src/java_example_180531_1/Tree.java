package java_example_180531_1;

import java_example_180531_3.Countable;

public class Tree implements Countable {

	
	public String name;
	Tree(String name){
		this.name=name;
	}
	void ripen() {
		System.out.println(name+" 에 열매가 잘 익었다 있다.");
	}
	
	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println(name+" 가 있다.");
		
	}

}
