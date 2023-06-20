public class Counter {
    public void issueTicket(Ticket ticket) {
        System.out.println("Ticket Issued:");
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
