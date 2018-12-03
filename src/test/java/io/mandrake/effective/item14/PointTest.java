package io.mandrake.effective.item14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PointTest {

    @Test
    void testAccessorMethods() {
        final Point point = new Point(1.2, 3.1);
        assertThat(point.getX()).isEqualTo(1.2);
        assertThat(point.getY()).isEqualTo(3.1);

        point.setX(2.3);
        point.setY(6.4);
        assertThat(point.getX()).isEqualTo(2.3);
        assertThat(point.getY()).isEqualTo(6.4);
    }

}
