package java_example_180531;
//구현
public class ch8_02_CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ch8_02_Car car = new ch8_02_Car();
		
		car.run();
		
		System.out.println("----------------------");
		System.out.println("변수에 다른 객체 대입");
		car.forntLeftTrie = new ch8_02_Tire2();
		
		car.run();
		

	}

}
