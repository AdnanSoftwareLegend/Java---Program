public interface Cancellable {
    void cancelTicket() throws TicketCancellationException;
}
