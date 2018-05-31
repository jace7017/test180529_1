package java_example_180530_1;

public class ch7_13_Dog extends ch7_13_Animal {
	
	public ch7_13_Dog() {
		this.kind="포유류";
	}
	
	
	// 부모 클래스에서 정의된 추상메소드를 구 체 화          ㅇ
	@Override
	
	public void sound() {
		System.out.println("멍멍");
	}

}
