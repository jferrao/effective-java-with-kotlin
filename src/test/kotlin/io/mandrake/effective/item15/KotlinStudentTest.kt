package io.mandrake.effective.item15

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KotlinStudentTest {

    @Test
    fun `immutable class`() {
        val student = KotlinStudent(14, "Ricardo")
        assertThat(student.age).isEqualTo(14)

        val anotherStudent = KotlinStudent(14, "Ricardo")
        assertThat(student).isNotEqualTo(anotherStudent)

        val studentSet = setOf(student, anotherStudent)
        assertThat(studentSet).hasSize(2)
    }

    @Test
    fun `immutable data class`() {
        val student = KotlinStudentDto(14, "Ricardo")
        assertThat(student.age).isEqualTo(14)

        val anotherStudent = KotlinStudentDto(14, "Ricardo")
        assertThat(student).isEqualTo(anotherStudent)

        val studentSet = setOf(student, anotherStudent)
        assertThat(studentSet).hasSize(1)
    }

}
