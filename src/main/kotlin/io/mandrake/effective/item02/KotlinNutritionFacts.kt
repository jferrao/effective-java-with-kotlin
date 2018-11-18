package io.mandrake.effective.item02

class KotlinNutritionFacts(
    private val servingSize: Int,
    private val servings: Int,
    private val calories: Int = 0,
    private val fat: Int = 0,
    private val carbohydrate: Int = 0,
    private val sodium: Int = 0
)
