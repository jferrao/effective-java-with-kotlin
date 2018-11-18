package io.mandrake.effective.item02;

public class NutritionFactsCaller {

    public static void main(String[] args) {

        final NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola.toString());

        final NutritionFactsWithGetters cocaColaGetter = new NutritionFactsWithGetters.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();
        final int calories = cocaColaGetter.getCalories();
        System.out.println(calories);

    }

}
