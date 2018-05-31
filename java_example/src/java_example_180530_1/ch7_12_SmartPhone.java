package java_example_180530_1;
//추상클래스를 상속받는 자식 클래스
public class ch7_12_SmartPhone extends ch7_12_Phone{
	
	//생성자 선언
	public ch7_12_SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드 선언
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
