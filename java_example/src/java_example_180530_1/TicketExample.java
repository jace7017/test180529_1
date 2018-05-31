package java_example_180530_1;

public class TicketExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사전예약 티켓 객체 생성(티켓번호, 예약일수를 매개변수로)
		AdvancedTicket adticket = new AdvancedTicket(100, 20);
		adticket.setTicketPrice(100000);
		
		System.out.println("당신의 사전예약 티켓 번호는 " +adticket.getTicketNumber()+"이고 구매가격은 " +adticket.getTicketPrice());
		
/*		Ticket TicketExample=new Ticket(7000, 1111); // 사전예약
		Ticket TicketExample2=new Ticket(32131, 9999); // 일반예약
		AdvancedTicket AdvancedTicket=new AdvancedTicket(10000, 20);
		System.out.println(AdvancedTicket.TicketDay);
		
		*/
		
	/*	
		System.out.println("사전 예약 티켓 번호 : " + TicketExample.TicketNumber + "구매 가격 : "+TicketExample.TicketPrice);
		System.out.println("일반 예약 티켓 번호 : " + TicketExample2.TicketNumber + "구매 가격 : "+TicketExample2.TicketPrice);
		
		
		
		*/
		

	}

}
