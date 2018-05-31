package java_example_180530;

public class ch8_01_Audio implements ch8_01_RemoteControl{

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>ch8_01_RemoteControl.MAX_VOLUME) {
			this.volume=ch8_01_RemoteControl.MAX_VOLUME;
		}else if(volume<ch8_01_RemoteControl.MIN_VOLUME) {
			this.volume=ch8_01_RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 오디오 볼륨 : " + volume);
	}
	
	//인터페이스에서 정의한 디폴트 메소드를 재정의할때
	//접근제한자를 default에서 public로 변경해 주어야 한다
	@Override
	public void setMute(boolean mute) {
		
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	

}
