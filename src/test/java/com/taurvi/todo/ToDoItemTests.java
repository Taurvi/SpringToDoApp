package com.taurvi.todo;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ToDoItemTests {
    private ToDoItem toDoItem;
    private long initialSystemTime;
    private ToDoItem getToDoItem(String description) {
        return new ToDoItem(description);
    }

    @Before
    public void setUp() throws Exception {
        initialSystemTime = System.currentTimeMillis() / 1000L;
        toDoItem = getToDoItem("Description");
    }

    @Test
    public void should_exist() {
        // Given
        // When
        Throwable error = catchThrowable(() -> Class.forName("com.taurvi.todo.ToDoItem"));
        // Then
        assertThat(error).isNull();
    }

    @Test
    public void should_throw_invalid_argument_exception_if_constructor_is_empty() {
        // Given
        // When
        Throwable error = catchThrowable(() -> getToDoItem(null));
        // Then
        assertThat(error).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void should_construct_with_description_string() {
        // Given
        // When
        // Then
        assertThat(toDoItem.getDescription()).contains("Description");
    }

    @Test
    public void should_have_a_timestamp_field() {
        // Given
        // When
        // Then
        assertThat(toDoItem.getTimestamp()).isNotNull();
    }

    @Test
    public void should_have_a_unix_timestamp() {
        // Given
        // When
        // Then
        assertThat(toDoItem.getTimestamp()).isEqualTo(initialSystemTime);
    }

    @Test
    public void should_have_a_done_field() {
        // Given
        // When
        // Then
        assertThat(toDoItem.isDone()).isNotNull();
    }

    @Test
    public void should_have_done_default_to_false() {
        // Given
        // When
        // Then
        assertFalse(toDoItem.isDone());
    }

    @Test
    public void should_have_a_toggleDone_method() {
        // Given
        // When
        Throwable error = catchThrowable(() -> ToDoItem.class.getMethod("toggleDone"));
        // Then
        assertThat(error).isNull();
    }

    @Test
    public void should_toggle_done_between_boolean_states() {
        // Given
        // When
        toDoItem.toggleDone();
        // Then
        assertTrue(toDoItem.isDone());
    }
}