package java_example_180531_4;

public class ch11_01_StringIndexOf {

	public static void main(String[] args) {
		
		//indexOf() 메소드
		String subject="자바 프로그래밍";
		
		int location=subject.indexOf("프로그래밍"); //앞에서부터 시작 인덱스 번호까지
		System.out.println("location의 값 : " + location);
		
		//length()메소드 : 글자 수 최대값
		int length=subject.length();
		System.out.println("length의 값 : " + length);
		
		/*replace()메소드*/
		String newStr=subject.replace("자바", "JAVA"); // 앞에를 뒤에로 바꾸어라 Ctrl+H
		System.out.println("newStr의 값 : " +newStr);
		
		//toLowerCase(), toUpperCase(),
		String str3="abCdEFGhijKLmn";
		String str3Lower=str3.toLowerCase();
		String str3Upper=str3.toUpperCase();
		System.out.println("str3Lower의 값 : " +str3Lower);
		System.out.println("str3Upper의 값 : " +str3Upper);
		
		//trim() 메소드
		String tell1="         02";
		String tell2= "1234          ";
		String tell3 = "       5555   ";
		String tel=tell1.trim()+tell2.trim()+tell3.trim();
		System.out.println(tel);
		
		
		
		
		//substring() 메소드
		String ssn="180531-3456789";
		String firstNum=ssn.substring(0, 6); // mid 와 같음 0번째부터 6번째까지 
		String secondNum=ssn.substring(7); // 7번 인덱스부터 표출
		System.out.println("firstNum의 값 : " + firstNum);
		System.out.println("secondNum의 값 : " + secondNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(subject.indexOf("자바") != -1) {//"자바"문자열이 없을 경우 -1로
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}
		
		
		
	}

}
