package com.taurvi.todo;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;

public class ApplicationTests {
    @Test
    public void should_exist() {
        Throwable error = catchThrowable(() -> Class.forName("com.taurvi.todo.Application"));
        assertThat(error).isNull();
    }

}
