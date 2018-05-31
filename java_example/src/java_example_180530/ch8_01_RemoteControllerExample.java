package java_example_180530;

public class ch8_01_RemoteControllerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 타입의 변수 선언
		ch8_01_RemoteControl rc;
		//각각의 객체를 인터페이스 타입 변수에 대입
		rc= new ch8_01_Television();
		rc.turnOn();
		rc.turnOff();
		//Television 객체를 rc에 대입
		//rc는 Television 객체가 된다		
		rc.setMute(true);
		ch8_01_RemoteControl.changeBattery();
		
		rc= new ch8_01_Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);

	}

}
