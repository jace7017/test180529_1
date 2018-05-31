package java_example_180531_1;

public class ch8_04_smartPhone extends ch8_04_pda implements ch8_04_mobilePhone, ch8_04_mp3 {
	
	@Override
	public void massge() {
		// TODO Auto-generated method stub
		System.out.println("메세지 송신");
	}

	@Override
	public void massge1() {
		// TODO Auto-generated method stub
		System.out.println("메세지 수신");
		
	}

	@Override
	public void call1() {
		System.out.println("전화 걸기");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call2() {
		// TODO Auto-generated method stub
		System.out.println("전화 받기");
		
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악 재생");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 정지");
		
	}
	


}
