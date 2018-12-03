package io.mandrake.effective.item14

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KotlinPointTest {

    @Test
    fun `accessor methods test`() {
        val point = Point(1.2, 3.1)
        assertThat(point.x).isEqualTo(1.2)
        assertThat(point.y).isEqualTo(3.1)

        point.x = 2.3
        point.y = 6.4
        assertThat(point.x).isEqualTo(2.3)
        assertThat(point.y).isEqualTo(6.4)
    }

}