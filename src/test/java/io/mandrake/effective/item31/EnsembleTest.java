package io.mandrake.effective.item31;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EnsembleTest {

    @Test
    void testEnsembleEnum() {
        assertThat(Ensemble.TRIO.getSize()).isEqualTo(3);
        assertThat(Ensemble.SOLO.name()).isEqualTo("SOLO");
        assertThat(Ensemble.DUET.ordinal()).isEqualTo(1);
    }

}
