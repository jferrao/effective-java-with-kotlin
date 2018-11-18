package io.mandrake.effective.item02;

public class NutritionFactsCaller {

    static void call() {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();
    }

}
