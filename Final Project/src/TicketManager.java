import java.util.ArrayList;

public class TicketManager {

    private ArrayList<Ticket> tickets;

    public TicketManager() {
        tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void displayAllTickets() {
        for (Ticket ticket : tickets) {
            System.out.println("Ticket Details:");
            System.out.println("Passenger Name: " + ticket.getPassengerName());
            System.out.println("Seat Number: " + ticket.getSeatNumber());

            if (ticket instanceof RegularTicket) {
                RegularTicket regularTicket = (RegularTicket) ticket;
                System.out.println("Boarding Location: " + regularTicket.getBoardingLocation());
                System.out.println("Destination: " + regularTicket.getDestination());
            } else if (ticket instanceof VIPticket) {
                VIPticket vipTicket = (VIPticket) ticket;
                System.out.println("Meal Preference: " + vipTicket.getMealPreference());
            }

            System.out.println();
        }
    }

    public void cancelTicket(Ticket ticket) throws TicketCancellationException {
        if (tickets.contains(ticket)) {
            tickets.remove(ticket);
            System.out.println("Ticket canceled successfully!");
        } else {
            throw new TicketCancellationException("Ticket not found in the system.");
        }
    }
}