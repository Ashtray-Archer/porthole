package com.stevenfoerster.porthole.ui.theme

import android.os.Build
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme =
    darkColorScheme(
        primary = Color(0xFFF4F4F4),
        secondary = Color(0xFFB4B4B4),
        tertiary = Color(0xFFB4B4B4),
        error = Color(0xFFFFB4AB),
        background = Color(0xFF212121),
        surface = Color(0xFF2F2F2F),
        onPrimary = Color(0xFF212121),
        onSecondary = Color(0xFF212121),
        onBackground = Color(0xFFF4F4F4),
        onSurface = Color(0xFFF4F4F4),
        primaryContainer = Color(0xFF383838),
        onPrimaryContainer = Color(0xFFF4F4F4),
        secondaryContainer = Color(0xFF383838),
        onSecondaryContainer = Color(0xFFF4F4F4),
        surfaceVariant = Color(0xFF383838),
        onSurfaceVariant = Color(0xFFB4B4B4),
        outline = Color(0xFF454545),
        outlineVariant = Color(0xFF454545),
        surfaceTint = Color(0xFF2F2F2F),
    )

private val LightColorScheme =
    lightColorScheme(
        primary = Color(0xFF1565C0),
        secondary = Color(0xFF00897B),
        tertiary = Color(0xFF7B1FA2),
        error = Color(0xFFD32F2F),
        background = Color(0xFFFAFAFA),
        surface = Color(0xFFFFFFFF),
        onPrimary = Color.White,
        onSecondary = Color.White,
        onBackground = Color(0xFF212121),
        onSurface = Color(0xFF212121),
    )

/** Charcoal by default; explicit legacy light/dynamic overrides remain available. */
@Composable
fun PortholeTheme(
    darkTheme: Boolean = true,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit,
) {
    val colorScheme =
        when {
            dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
                val context = LocalContext.current
                if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
            }
            darkTheme -> DarkColorScheme
            else -> LightColorScheme
        }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
    )
}
