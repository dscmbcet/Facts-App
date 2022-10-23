package com.example.factsapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = surf,
    primaryVariant = psybeam,
    secondary = spark,
    surface = manga,
    background = voidColor
)

private val LightColorPalette = lightColors(
    primary = surf,
    primaryVariant = psybeam,
    secondary = spark,
    surface = manga,
    background = voidColor
)

@Composable
fun FactsAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}