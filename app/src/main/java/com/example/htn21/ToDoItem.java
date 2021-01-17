package com.example.htn21;

public class ToDoItem extends Event {

    private String courseCode;
    private double allocatedTime;


    public ToDoItem(String date, String comments) {
        super(date, "assignemnt", comments);
        // TODO Auto-generated constructor stub
    }

    // Overload
    public ToDoItem(Event event, String courseCode, double allocatedTime) {
        super(event.getDate(), "assignemnt", event.getComments());
        this.courseCode = courseCode;
        this.allocatedTime = allocatedTime;
    }

    @Override
    public String toString() {
        return ("date: " + super.getDate() + " type: " + super.getType() + " comments: "
                + super.getComments() + " COURSE CODE: " + courseCode);
    }

}
