package io.mandrake.effective.item14

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KotlinBookTest {

    @Test
    fun `accessor methods test`() {
        val book = KotlinBook("Effective Java")
        assertThat(book.title).isEqualTo("Effective Java using Kotlin")
    }

}
