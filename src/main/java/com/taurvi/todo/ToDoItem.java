package com.taurvi.todo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class ToDoItem {
    private final String description;
    private final long timestamp;
    @Setter(AccessLevel.NONE)
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
}
