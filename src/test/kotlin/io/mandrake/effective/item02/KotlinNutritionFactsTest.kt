package io.mandrake.effective.item02

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KotlinNutritionFactsTest {

    @Test
    fun `test with private properties`() {
        val cocaCola = KotlinNutritionFacts(servingSize = 240, servings = 8, calories = 100, sodium = 35, carbohydrate = 27)
    }

    @Test
    fun `test with getters`() {
        val cocaCola = KotlinNutritionFactsWithGetters(servingSize = 240, servings = 8, calories = 100, sodium = 35, carbohydrate = 27)
        assertThat(cocaCola.servingSize).isEqualTo(240)
        assertThat(cocaCola.servings).isEqualTo(8)
        assertThat(cocaCola.calories).isEqualTo(100)
        assertThat(cocaCola.fat).isEqualTo(0)
        assertThat(cocaCola.sodium).isEqualTo(35)
        assertThat(cocaCola.carbohydrate).isEqualTo(27)
    }

}
