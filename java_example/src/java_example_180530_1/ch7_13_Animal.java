package java_example_180530_1;

public abstract class ch7_13_Animal {
	
	public String kind;
	
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언
	//실행 블록이 없고 ... 단지 메소드 이름, 리턴타입 등만 선언
	public abstract void sound(); 

}
