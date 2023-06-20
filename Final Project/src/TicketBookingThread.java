public class TicketBookingThread extends  Thread{
    private Ticket ticket;
    private TicketManager ticketManager;

    public TicketBookingThread(Ticket ticket, TicketManager ticketManager) {
        this.ticket = ticket;
        this.ticketManager = ticketManager;
    }

    public void run() {
        try {
            ticketManager.addTicket(ticket);
            System.out.println("Ticket booked successfully!");
        } catch (Exception e) {
            System.out.println("Ticket booking failed: " + e.getMessage());
        }
    }
}


