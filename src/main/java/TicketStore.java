import models.Ticket;

import java.util.PriorityQueue;

public class TicketStore {
    private PriorityQueue<Ticket> ticketQueue;
    public TicketStore() {
        ticketQueue = new PriorityQueue<>((a, b) -> {
            int priorityComparison = Integer.compare(a.getPriority().getLevel(), b.getPriority().getLevel());
            if (priorityComparison != 0) return priorityComparison;

            return a.getCreatedAt().compareTo(b.getCreatedAt());
        });
    }
    public void addTicket(Ticket ticket){
        this.ticketQueue.add(ticket);
    }
    public void removeTicket(Ticket ticket){
        ticketQueue.remove(ticket);
    }
}
