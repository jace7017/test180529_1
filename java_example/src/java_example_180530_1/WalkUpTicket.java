package java_example_180530_1;

public class WalkUpTicket extends Ticket {
	private boolean payByCredit;
	
	public WalkUpTicket(int TicketNumber, boolean payByCredit) {
		super(TicketNumber);
		this.payByCredit=payByCredit;
	}
	
	public double getPrice() {
		if(payByCredit)
			return TicketPrice*1.05;
		else
			return TicketPrice;
	}


	/*public WalkUpTicket(int TicketPrice, int TicketNumber) {
		super(TicketPrice, TicketNumber);
		// TODO Auto-generated constructor stub
	}

	int WalkUpTicket; // 일반티켓
	int card;
	


	public void WalkUpTicket(int TicketNum, int card) {
		this.TicketNumber=TicketNum;
		this.card=card;
		
	}
	
	*/
	
}
/*	
	public void WalkUpTicketCard() {
		if(card) {
			
		}
	}*/
	
	

	
	


