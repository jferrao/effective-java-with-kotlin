package io.mandrake.effective.item14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BookTest {

    @Test
    void testAccessorMethods() {
        final Book book = new Book("Effective Java");
        assertThat(book.getTitle()).isEqualTo("Effective Java using Kotlin");
    }

}
