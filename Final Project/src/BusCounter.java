import java.util.Scanner;

public class BusCounter {  public static void main(String[] args) {
    // Encapsulation
    Ticket ticket = new Ticket();

    ticket.setPassengerName("Ashik - E - Elahe ");
    ticket.setSeatNumber(10);

    // Inheritance
    RegularTicket regularTicket = new RegularTicket();
    regularTicket.setPassengerName("Adnan - E - Elahe ");
    regularTicket.setSeatNumber(20);
    regularTicket.setBoardingLocation("City Rangpur ");
    regularTicket.setDestination("City Dhaka ");

    // Polymorphism
    Counter counter = new Counter();
    counter.issueTicket(ticket);
    counter.issueTicket(regularTicket);

    // Abstraction
    AbstractTicket onlineTicket = new OnlineTicket("1234");
    onlineTicket.displayTicketDetails();

    // Interface
    TicketManager ticketManager = new TicketManager();
    ticketManager.addTicket(ticket);
    ticketManager.addTicket(regularTicket);

    // ArrayList
    ticketManager.displayAllTickets();

    // Exception Handling
    try {
        ticketManager.cancelTicket(ticket);
    } catch (TicketCancellationException e) {
        System.out.println(e.getMessage());
    }

    // Multithreading
    TicketBookingThread bookingThread1 = new TicketBookingThread(ticket, ticketManager);
    TicketBookingThread bookingThread2 = new TicketBookingThread(regularTicket, ticketManager);
    bookingThread1.start();
    bookingThread2.start();



}
}
