package io.mandrake.effective.item09

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KotlinPhoneNumberTest {

    @Test
    fun `object test for hashCode, equals and toString`() {
        val natNumber = KotlinPhoneNumber(areaCode="01865", lineNumber="123456")
        val intNumber = KotlinPhoneNumber(internationalCode = "+44", areaCode="01865", lineNumber="123456")

        Assertions.assertThat(natNumber).isEqualTo(intNumber)
        Assertions.assertThat(natNumber.hashCode()).isEqualTo(intNumber.hashCode())
        Assertions.assertThat(natNumber.toString())
            .isEqualTo("KotlinPhoneNumber(internationalCode=+44, areaCode=01865, lineNumber=123456)");
    }

}
