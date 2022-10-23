package com.example.factsapp.model

import androidx.annotation.DrawableRes

data class Fact(
    val info: String,
    val source: String, // If source available, pass here
    @DrawableRes val imageId: Int,
    val type: FactType,
    val submittedBy: String, // Pass your GitHub ID here
)

// Give a suitable type for your fact from the below
enum class FactType {
    FUN,
    INTERESTING,
    SCIENCE,
    NATURE,
    TECH,
    MISC,
}
