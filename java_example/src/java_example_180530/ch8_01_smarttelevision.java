package java_example_180530;

public class ch8_01_smarttelevision implements ch8_01_searchable, ch8_01_RemoteControl {
	
	
	boolean mute;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	

}
