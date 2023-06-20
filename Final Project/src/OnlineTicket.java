public class OnlineTicket extends AbstractTicket{
    private String ticketId;

    public OnlineTicket(String ticketId) {
        this.ticketId = ticketId;
    }

    public void displayTicketDetails() {
        System.out.println("Online Ticket Details:");
        System.out.println("Ticket ID: " + ticketId);
    }
}
