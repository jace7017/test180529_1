package java_example_180530;
//인터페이스 RemoteControl의 구현 클래스
public class ch8_01_Television implements ch8_01_RemoteControl {
	
	//필드 선언
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	
	//인터페이스에서 선언한 turnOn 실체 메소드 선언
	
/*	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>ch8_01_RemoteControl.MAX_VOLUME) {
			this.volume=ch8_01_RemoteControl.MAX_VOLUME;
		}else if(volume<ch8_01_RemoteControl.MIN_VOLUME) {
			this.volume=ch8_01_RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	*/
	

}
