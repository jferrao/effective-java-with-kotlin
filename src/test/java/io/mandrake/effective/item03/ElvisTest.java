package io.mandrake.effective.item03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ElvisTest {

    @Test
    void testThreadSafeSingleton() {
        final Elvis elvis = Elvis.getInstance();
        final Elvis theKing = Elvis.getInstance();

        assertThat(elvis).isEqualTo(theKing);
    }

    @Test
    void testThreadSafeInitializationOnDemandHolderIdiomSingleton() {
        final ElvisOnDemand elvis = ElvisOnDemand.getInstance();
        final ElvisOnDemand theKing = ElvisOnDemand.getInstance();

        assertThat(elvis).isEqualTo(theKing);
    }

    @Test
    void testEnumSingleton() {
        final ElvisEnum elvis = ElvisEnum.INSTANCE;
        final ElvisEnum theKing = ElvisEnum.INSTANCE;

        assertThat(elvis).isEqualTo(theKing);
    }

}
