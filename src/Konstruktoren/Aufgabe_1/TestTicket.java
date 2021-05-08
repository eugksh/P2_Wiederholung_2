package Konstruktoren.Aufgabe_1;

abstract class Ticket {
	
	int price;
	
	String eventname;
	
	String ort;
	
	String datum;
	
	public Ticket() {
		
		
	}
	
	public Ticket(int price) {
	
		this.price=price;
		
	}
	
	public Ticket(int price, String eventname) {
		
		this.price=price;
		this.eventname=eventname;

	}
	
	public Ticket(int price, String eventname, String date, String place) {
		
		this.price=price;
		this.eventname=eventname;
		datum=date;
		ort=place;

	}

	public float calcTicketPrice(int price) {
		
		return price ;
		
	};
	
}

public class TestTicket extends Ticket  {
	
	public TestTicket (int price){
		
	super(price);
		
	}
	
	public TestTicket (int price, String eventname){
		
	super(price, eventname);
		
	}
	
	public TestTicket (int price, String eventname, String date, String place){
		
	super(price,eventname,date, place);
		
	}
	

	public static void main (String [] args) {		
    	
    TestTicket ticket1= new TestTicket(60);
    
    TestTicket ticket2= new TestTicket(70, "party1");
    
    TestTicket ticket3= new TestTicket(80, "party2", "01.05.2021", "hamburg");
    	
    System.out.println(ticket1.price);
    System.out.println(ticket2.price+" "+ticket2.eventname);
    System.out.println(ticket3.price+" "+ticket3.eventname+" "+ticket3.datum+" "+ticket3.ort);
    
    
    }
	
	
}
