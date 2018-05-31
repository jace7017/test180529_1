package java_example_180531_4;

import java.util.Arrays;
import java.util.Collections;

public class ch11_04_ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] score= {100,80,90};*/
		String[] score= {"가나다","하하하","거너너"};
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		System.out.println("");
		Arrays.sort(score, Collections.reverseOrder());
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		

	}

}
