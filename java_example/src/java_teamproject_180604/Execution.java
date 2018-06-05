package java_teamproject_180604;
import java.util.*;
public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
          Map map = new Map("스마일 기지","달팽이 기지","골렘 기지");
          hunting hu = new hunting("스마일 기지","달팽이 기지","골렘 기지");
          Town to = new Town("스마일 기지","달팽이 기지","골렘 기지");
          map.hunting();
          hu.hunting();
          map.Town();
          to.Town();
         
          
         
          
	}
	

	
}
