import models.Priority;
import models.Status;
import models.Ticket;

public class jiraDashboard {
    private TicketStore ticketStore;
    jiraDashboard(){
        ticketStore = new TicketStore();
    }
    public void createTicket(String creator, String title){
        Ticket ticket = new Ticket(title, creator, Priority.MEDIUM);
    }
    public void changeTicketPriority(int value, Ticket ticket){
        ticket.setPriority(value);
    }
    public void changeTicketStatus(Ticket ticket, Status status){
        ticket.setStatus(status);
    }
    public void deleteTciket(Ticket ticket){
        ticketStore.removeTicket(ticket);
    }
}