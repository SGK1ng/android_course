package com.example.guitar30days.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val LightColors = lightColorScheme(
    primary = Color(0xFF795548), onPrimary = Color.White,
    primaryContainer = Color(0xFFFFDBCC), onPrimaryContainer = Color(0xFF321205),
    secondary = Color(0xFF795900), secondaryContainer = Color(0xFFFFDF9D),
    background = Color(0xFFFFF8F3), onBackground = Color(0xFF241A16),
    surface = Color(0xFFFFF8F3), onSurface = Color(0xFF241A16),
    surfaceVariant = Color(0xFFF2DFD5), onSurfaceVariant = Color(0xFF51443D)
)
private val DarkColors = darkColorScheme(
    primary = Color(0xFFF3B89D), onPrimary = Color(0xFF482619),
    primaryContainer = Color(0xFF633C2D), onPrimaryContainer = Color(0xFFFFDBCC),
    secondary = Color(0xFFEAC16B), secondaryContainer = Color(0xFF594300),
    background = Color(0xFF1C1512), onBackground = Color(0xFFF0DFD7),
    surface = Color(0xFF1C1512), onSurface = Color(0xFFF0DFD7),
    surfaceVariant = Color(0xFF51443D), onSurfaceVariant = Color(0xFFD8C2B8)
)
private val GuitarTypography = Typography(
    headlineSmall = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp, lineHeight = 30.sp),
    bodyLarge = TextStyle(fontSize = 16.sp, lineHeight = 24.sp),
    labelLarge = TextStyle(fontWeight = FontWeight.Medium, fontSize = 14.sp)
)
private val GuitarShapes = Shapes(medium = RoundedCornerShape(16.dp), large = RoundedCornerShape(20.dp))

@Composable
fun GuitarTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    // Палитру выбираем по режиму системы, а шрифты и формы общие для обеих тем.
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = GuitarTypography,
        shapes = GuitarShapes,
        content = content
    )
}
