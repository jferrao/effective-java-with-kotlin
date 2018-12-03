package io.mandrake.effective.item02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NutritionFactsTest {

    @Test
    void testWithPrivateProperties() {
        final NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();
    }

    @Test
    void testWithGetters() {
        final NutritionFactsWithGetters cocaCola = new NutritionFactsWithGetters.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();
        assertThat(cocaCola.getCalories()).isEqualTo(100);
    }

}
