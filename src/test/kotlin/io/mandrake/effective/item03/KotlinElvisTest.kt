package io.mandrake.effective.item03

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KotlinElvisTest {

    @Test
    fun `singleton object test`() {
        val elvis = KotlinElvis
        val theKing = KotlinElvis

        assertThat(elvis).isEqualTo(theKing)
    }

}