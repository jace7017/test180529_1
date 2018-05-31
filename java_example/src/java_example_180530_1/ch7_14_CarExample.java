package java_example_180530_1;

public class ch7_14_CarExample {
	public static void main(String[] args) {
	
	ch7_14_Sedan sedan = new ch7_14_Sedan("검정색", 120);
	ch7_14_Truck truck = new ch7_14_Truck("빨간색", 80);
	
	sedan.aa();
	System.out.println(sedan.color);
	System.out.println(sedan.speed);
	
	truck.aa();
	System.out.println(truck.color);
	System.out.println(truck.speed);
	
	
	}

}
