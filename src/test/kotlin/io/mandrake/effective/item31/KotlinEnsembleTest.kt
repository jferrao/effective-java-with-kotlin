package io.mandrake.effective.item31

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KotlinEnsembleTest {

    @Test
    fun `test enum values`() {
        assertThat(KotlinEnsemble.TRIO.size).isEqualTo(3)
        assertThat(KotlinEnsemble.SOLO.name).isEqualTo("SOLO")
        assertThat(KotlinEnsemble.DUET.ordinal).isEqualTo(1)
    }

}
