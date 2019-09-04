package io.mandrake.effective.item09

data class KotlinPhoneNumber(
    val internationalCode: String = "+44",
    val areaCode: String,
    val lineNumber: String
)
