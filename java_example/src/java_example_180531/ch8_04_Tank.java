package java_example_180531;

public class ch8_04_Tank implements ch8_04_Car, ch8_04_Cannon{

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 대포를 발사합니다.");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 앞으로 전진합니다"
				+ ".");		
	}

}
