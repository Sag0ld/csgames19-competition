package com.csgames.mixparadise.api.dto

import com.csgames.mixparadise.model.ServeIngredient

object ServeIngredientAssembler {

    fun from(ingredientsIdToOunces: HashMap<String, Int>) : List<ServeIngredient> {
        val servedIngredients = arrayListOf<ServeIngredient>()
        for ((id, ounce) in ingredientsIdToOunces) {
            servedIngredients.add(ServeIngredient(id, ounce))
        }
        return servedIngredients
    }
}