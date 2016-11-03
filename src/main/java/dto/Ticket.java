package dto;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;
import java.util.List;

public class Ticket {

    private int ticketNumber;
    private String name;
    private String description;
    private List<Ticket> blockedBy;
    private List<String> comments;
    private Date creation_date;

    public Ticket(int ticketNumber,
                  String name,
                  String description,
                  List<Ticket> blockedBy,
                  List<String> comments,
                  Date creation_date
    ){
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.description = description;
        this.blockedBy = blockedBy;
        this.comments = comments;
        this.creation_date = creation_date;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public Ticket setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ticket setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Ticket setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Ticket> getBlockedBy() {
        return blockedBy;
    }

    public Ticket setBlockedBy(List<Ticket> blockedBy) {
        this.blockedBy = blockedBy;
        return this;
    }

    public List<String> getComments() {
        return comments;
    }

    public Ticket setComments(List<String> comments) {
        this.comments = comments;
        return this;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public Ticket setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
        return this;
    }
}


