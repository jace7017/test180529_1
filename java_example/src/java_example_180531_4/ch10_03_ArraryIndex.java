package java_example_180531_4;

public class ch10_03_ArraryIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num=new int[3];
		try {
			for(int i=0; i<=num.length;i++) {
				num[i]=1;
				System.out.println(num[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했으니 코드를 확인해 볼 것");
		}finally {
			System.out.println("finally는 무조건 실행됩니다.");
		}
		

	}

}
