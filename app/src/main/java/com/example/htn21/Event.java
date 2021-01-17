package com.example.htn21;

public class Event {

    // must be in the format "dd-MM-yyyy HH:mm:ss"
    private String date;

    private String type;

    private String comments;

    public Event(String date, String type, String comments) {
        this.date = date;
        this.type = type;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return ("date: " + date + " type: " + type + " comments: " + comments);
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
