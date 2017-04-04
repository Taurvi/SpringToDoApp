package com.taurvi.todo;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;

public class ToDoListTests {
    private ToDoList toDoList;
    private ToDoItem item;

    @Before
    public void setup() {
        toDoList = new ToDoList();
        item = new ToDoItem("Test");
        toDoList.add(item);
    }

    @Test
    public void should_exist() {
        // Given
        // When
        Throwable error = catchThrowable(() -> Class.forName("com.taurvi.todo.ToDoList"));
        // Then
        assertThat(error).isNull();
    }

    @Test
    public void should_add_items_to_list() {
        // Given
        // When
        // Then
        assertThat(toDoList.getList().get(0)).isEqualTo(item);
    }

    @Test
    public void should_mark_items_as_done() {
        // Given
        // When
        toDoList.markDone(0);
        // Then
        assertThat(toDoList.getList().get(0).isDone()).isTrue();
    }
}
