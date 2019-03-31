package io.mandrake.effective.item02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NutritionFactsTest {

    @Test
    void testWithPrivateProperties() {
        final NutritionFacts cocaCola = new NutritionFacts.Builder(240,8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }

    @Test
    void testWithGetters() {
        final NutritionFactsWithGetters cocaCola = new NutritionFactsWithGetters.Builder(240,8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        assertThat(cocaCola.getServingSize()).isEqualTo(240);
        assertThat(cocaCola.getServings()).isEqualTo(8);
        assertThat(cocaCola.getCalories()).isEqualTo(100);
        assertThat(cocaCola.getFat()).isEqualTo(0);
        assertThat(cocaCola.getSodium()).isEqualTo(35);
        assertThat(cocaCola.getCarbohydrate()).isEqualTo(27);
    }

    @Test
    void testTelescoping() {
        final NutritionFactsTelescoping cocaCola = new NutritionFactsTelescoping(240,8);

        assertThat(cocaCola.getServingSize()).isEqualTo(240);
        assertThat(cocaCola.getServings()).isEqualTo(8);
        assertThat(cocaCola.getCalories()).isEqualTo(0);
        assertThat(cocaCola.getFat()).isEqualTo(0);
        assertThat(cocaCola.getSodium()).isEqualTo(0);
        assertThat(cocaCola.getCarbohydrate()).isEqualTo(0);
    }

}
