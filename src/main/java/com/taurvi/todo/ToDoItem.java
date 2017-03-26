package com.taurvi.todo;

public class ToDoItem {
    private String description;
    private long timestamp;
    private boolean done;

    public ToDoItem(String description) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description is required.");
        }
        this.description = description;
        this.done = false;
        this.timestamp = System.currentTimeMillis() / 1000L;
    }

    public void toggleDone() {
        done = !done;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }
}
