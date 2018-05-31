package java_example_180530_1;

public class EmployExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//각 직급별 직원에 대한 객체를 만들기
		//급여 책정
		//각 직원의 이름, 급여, 보너스, 스톡옵션을 각각 출력
		
		Employee employee= new Employee("가나다",1000000);
		Manager manager=new Manager("라마바",1000000,300);
		/*System.out.println(e.moenyUp());
		System.out.println(e.money);*/
		
		System.out.println("이름 : "+ employee.name+" 급여 : "+employee.money);
		System.out.println("이름 : "+ manager.name+" 급여 : "+manager.money+" 보너스 : "+manager.bonus);
		
		
	}
}
