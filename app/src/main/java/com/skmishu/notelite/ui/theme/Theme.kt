package com.skmishu.notelite.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    background = DarkGray,
    onBackground = Color.White,
    surface = LightBlue,
    onSurface = DarkGray
)

private val LiteColorPalette = darkColors(
    primary = DarkGray,
    background = Color.White,
    onBackground = DarkGray,
    surface = LightBlue,
    onSurface = Color.White
)

@Composable
fun CleanArchitectureNoteAppTheme(darkTheme: Boolean = true, content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LiteColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}