package io.mandrake.effective.item02

fun main(args: Array<String>) {

    val cocaCola = KotlinNutritionFacts(servingSize = 240, servings = 8, calories = 100, sodium = 35, carbohydrate = 27)
    println(cocaCola.toString())

    val cocaColaGetters = KotlinNutritionFactsWithGetters(servingSize = 240, servings = 8, calories = 100, sodium = 35, carbohydrate = 27)
    val calories = cocaColaGetters.calories
    println(calories)

}
