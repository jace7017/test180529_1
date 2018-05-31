package java_example_180530_1;

public class AdvancedTicket extends Ticket{
	

/*	public AdvancedTicket(int TicketPrice, int TicketNumber, int TicketDay, int AdvancedTicket) {
		super(TicketPrice, TicketNumber);
		this.TicketDay=TicketDay;
		this.AdvancedTicket=AdvancedTicket;
		// TODO Auto-generated constructor stub
	}*/
	
	private int TicketDay; // 사전예약 일수
	/*int a; //사전예약티켓
*/	
	
	
	public AdvancedTicket(int TicketNumber, int TicketDay) {
		super(TicketNumber);
		this.TicketDay=TicketDay;
	}
	
/*	public void AdvancedTicket(int AdvancedTicket, int TicketDay) {
		
		this.AdvancedTicket=AdvancedTicket;
	}*/
	
	//사전예약 티켓 / 티켓 번호와 사전예약 일수 정보
	
	
		/*super(TicketNumber);*/
		
		
	
	public double getPrice() {
		if(TicketDay>=30) {
			TicketPrice=TicketPrice*0.5;
		}else if(TicketDay>=10) {
			TicketPrice=TicketPrice*0.8;
		}else
			TicketPrice=TicketPrice*0.9;
		return TicketPrice;
		}
}
	


