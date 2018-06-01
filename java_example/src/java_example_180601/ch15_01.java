package java_example_180601;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ch15_01 {
	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
							            
		Scanner scn=new Scanner(System.in);
		
		//리스트에 5명 사람 이름 입력
		for(int i=0;i<5;i++) {
			System.out.println("이름을 입력해 주세요 : ");
			String name=scn.next();
			list.add(name);			
		}
		
		//입력된 사람들 이름 출력
		for(int i=0;i<list.size();i++) {
			String name=list.get(i);
			System.out.println(name);
		}
		
		//입력된 이름중에 가장 긴 이름 출력
		int longname=0;
		for(int i=1;i<list.size();i++) {
			if(list.get(longname).length()<list.get(i).length()) {
				longname=i;
			}
		}
		
		System.out.println("가장 긴 이름은 "+list.get(longname));
		
		
		
		
		
		
		
		/*
		System.out.println("첫번째 이름 입력");
		name=scn.next();
		
		list.add("afds");
		list.add("gdfs");
		list.add("5342gfds");
		list.add("afsdfd");
		list.add("fsdaf");
				
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {			
			String str=list.get(i);
			name=list.get(i);
			System.out.println(i+" "+str);
			System.out.println(name);
			System.out.println("--------");
			list.get(i).length()
			for(int  m : list.get(i).length())
			
			
			if(list.get(i).length()>list.get(i+1).length()) {
				
				
			}
		}
		
		
		System.out.println("--------");
		
		
				
		System.out.println("--------");
		
		
		
		
		
		
		for(String name : list) {
			System.out.println(str);
		}
		
		for(int i=0;i<list.size())
		
		
		
		
		
		
*/		
		
		
	}
	
}
