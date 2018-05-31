package java_example_180530_1;

public class ch7_12_PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자식 클래스 객채ㅔ 생성
		
		ch7_12_SmartPhone smartphone = new ch7_12_SmartPhone("소유자");
		
		//추상 클래스의 객체 생성
		//ch7_12_Phone phone = new ch7_12_Phone("소유자"); //추상클래스
		
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetSearch();
		
		


	}

}
