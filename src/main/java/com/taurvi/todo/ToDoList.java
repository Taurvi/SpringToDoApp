package com.taurvi.todo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ToDoList {
    private List<ToDoItem> list;

    public ToDoList() {
        this.list = new ArrayList<>();
    }

    public void add(ToDoItem toDoItem) {
        list.add(toDoItem);
    }

    public void markDone(int index) {
        list.get(index).toggleDone();
    }
}
