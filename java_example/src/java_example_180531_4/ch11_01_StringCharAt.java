package java_example_180531_4;

public class ch11_01_StringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ssn="180531-456789";
		char gender=ssn.charAt(7); //인덱스 번호라고 생각.. left 7이랑 같음
		switch (gender) {
		case '1':
			System.out.println("남자입니다.");
			break;
		case '2':
			System.out.println("여자입니다.");
			break;
		case '3':
			System.out.println("남자입니다.");
			break;
		case '4':
			System.out.println("여자입니다.");		
			break;
		}

	}

}
