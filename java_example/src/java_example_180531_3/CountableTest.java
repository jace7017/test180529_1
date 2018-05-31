package java_example_180531_3;

public class CountableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Countable[] m = {new Bird("뻐꾸기"), new Bird("독수리"), new Tree("사과나무"), new Tree("밤나무")};
		
		for (Countable e : m)
			e.count();
	/*	m[0]=new Bird("뻐꾸기")
		m[1]=new Bird("독수리")
		m[2]=new Tree("사과나무")
		m[3]=new Tree("밤나무")*/
		
		/*
		 * 첫번째 반복문
		e=m[0] = new Bird("뻐꾸기")
		뻐꾸기를 매개변수로 하는 Bird의 객체를 생성해서 e에 대입
		e.count -> 뻐꾸기가 2마리 있다. (Bird -> count)
		
		두번째 반복문
		e=m[1] = new Bird("독수리")
		뻐꾸기를 매개변수로 하는 Bird의 객체를 생성해서 e에 대입
		e.count -> 독수리가 2마리 있다. (Bird -> count)
		
		*/
		
		for(int i=0;i<m.length;i++) {
			//타입에 따라 fly() or ripen() 호출-> instanceof 사용
			//조건문을 이용해서 배열에 저장된 각 요소가 Bird클래스 타입인지 확인
			if(m[i] instanceof Bird) {
				((Bird)m[i]).fly(); // Bird클래스 타입으로 강제 형변환해서 fly() 호출
			}else {
				((Tree)m[i]).ripen(); //Tree클래스 타입으로 강제 형변환해서 ripe() 호출
			}
		}
			
		
		
		
	/*			
		for(int i=0; i<m.length;i++) {
			//타입에 따라 fly() 또는 ripen() 메소드를 호출하는
			
			if(m.length<2) {
				
			}
			
			
			
		}

*/}

}
