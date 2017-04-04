package com.taurvi.todo;

import com.sun.xml.internal.bind.v2.TODO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ToDoList {
    private List<ToDoItem> list;

    public ToDoList() {
        this.list = new ArrayList<ToDoItem>();
    }

    public void add(ToDoItem toDoItem) {
        list.add(toDoItem);
    }

    public void markDone(int index) {
        list.get(index).toggleDone();
    }
}
