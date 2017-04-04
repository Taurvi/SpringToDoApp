package com.taurvi.todo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;

public class ApplicationTests {
    @Test
    public void should_exist() {
        // Given
        // When
        Throwable error = catchThrowable(() -> Class.forName("com.taurvi.todo.Application"));
        // Then
        assertThat(error).isNull();
    }

}
