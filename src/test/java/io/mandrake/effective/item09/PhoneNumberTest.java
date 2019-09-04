package io.mandrake.effective.item09;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PhoneNumberTest {

    @Test
    void testObjects() {
        final PhoneNumber natNumber = new PhoneNumber("01865", "123456");
        final PhoneNumber intNumber = new PhoneNumber("+44", "01865", "123456");

        assertThat(natNumber).isEqualTo(intNumber);
        assertThat(natNumber.hashCode()).isEqualTo(intNumber.hashCode());
        assertThat(natNumber.toString())
                .isEqualTo("PhoneNumber(internationalCode=+44, areaCode=01865, lineNumber=123456)");
    }

}
