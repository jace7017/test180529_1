package java_example_180531;

public class ch8_02_Car {
	//Tire 인터페이스 타입의 변수 frontLeftTire 선언
	//Tire1 객체를 생성..(fontLeftTire에 대입)
	ch8_02_Tire forntLeftTrie=new ch8_02_Tire1();
	ch8_02_Tire forntRightTrie=new ch8_02_Tire1();
	ch8_02_Tire backtLeftTrie=new ch8_02_Tire1();
	ch8_02_Tire backRightTrie=new ch8_02_Tire1();
	
	void run() {
		forntLeftTrie.roll();
		forntRightTrie.roll();
		backtLeftTrie.roll();
		backRightTrie.roll();		
	}

}
