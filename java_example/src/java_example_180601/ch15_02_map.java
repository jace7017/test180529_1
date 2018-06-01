package java_example_180601;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ch15_02_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("교실", "class");
		map.put("한국", "Korea");
		map.put("일본", "Japan");
		map.put("중국", "China");
		map.put("아시아", "Asia");
		
		while(true) {
			System.out.println("단어 입력");
			String kor=scn.next();
			String eng= map.get(kor);
				
		if(eng==null) {
			System.out.println("사전에 없는 단어 ");
		}else {
			System.out.println("단어의 의미는 " + eng+"입니다.");
		}
		
		
		
		
		}
		
		
		
		
		
		
		
/*						
		String map = list.get("교실");
		for(int i=0; i<map.size()+2; i++) {
			System.out.println("번역할 한글 입력");
			String find=scn.next();
			map.get(find);
			
			System.out.println(map.get(find));			
		}
		
		*/

	}

}
