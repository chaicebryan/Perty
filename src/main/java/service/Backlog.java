package service;

import dto.Ticket;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Backlog {

    private final List<Ticket> tickets;

    public Backlog(){
        this.tickets = new ArrayList();
    }

    public List<Ticket> findBlockers(Ticket ticket){
        return ticket.getBlockedBy();
    }

    public List<Ticket> findBlocking(final Ticket ticket){
        return tickets.stream()
                .filter((t) -> t.getBlockedBy().contains(ticket))
                .collect(Collectors.toList());
    }
    
    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket){
        tickets.remove(ticket);
    }
}
