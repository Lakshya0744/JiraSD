package models;

import java.util.Date;

public class Ticket {
    String title;
    String createdBy;
    Date createdAt;
    String asignee;
    Status status;
    Priority priority;

    public Date getCreatedAt() {
        return createdAt;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Ticket(String title, String createdBy, Priority priority){
        this.title = title;
        this.createdBy =  createdBy;
        this.asignee = null;
        this.priority = priority;
        status = Status.OPEN;
        this.createdAt = new Date();
    }
    public void changeStatus(Status status){
        this.status = status;
    }
    public void assign(String username){
        this.asignee = username;
    }
    public void setPriority(int value){
        if (value==1){
            this.priority = Priority.HIGH;
        }
        else if (value==2){
            this.priority = Priority.MEDIUM;
        }
        else {
            this.priority = Priority.LOW;
        }
    }

}
