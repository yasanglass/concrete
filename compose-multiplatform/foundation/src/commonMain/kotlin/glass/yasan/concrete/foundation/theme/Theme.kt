package glass.yasan.concrete.foundation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import glass.yasan.concrete.foundation.color.ColorTokens
import glass.yasan.concrete.foundation.color.Colors
import glass.yasan.concrete.foundation.color.LocalColors
import glass.yasan.concrete.foundation.color.contentColor
import glass.yasan.concrete.foundation.color.rememberAccent
import glass.yasan.concrete.foundation.dimension.Dimensions
import glass.yasan.concrete.foundation.dimension.LocalDimensions
import glass.yasan.concrete.foundation.typography.rubikTypography

@Composable
public fun ConcreteTheme(
    primary: Color = ColorTokens.accentPrimary,
    secondary: Color = primary,
    tertiary: Color = primary,
    isDark: Boolean = isSystemInDarkTheme(),
    dimensions: Dimensions = ConcreteTheme.dimensions,
    typography: Typography = rubikTypography(),
    content: @Composable () -> Unit,
) {
    val accent = rememberAccent(isDark, primary, secondary, tertiary)
    val contentColors = if (isDark) ColorTokens.contentDark else ColorTokens.contentLight
    val layer = if (isDark) ColorTokens.layerDark else ColorTokens.layerLight
    val colors = Colors(accent = accent, content = contentColors, layer = layer)

    MaterialTheme(
        colorScheme = createMaterial3ColorScheme(accent, contentColors, layer),
        typography = typography,
    ) {
        CompositionLocalProvider(
            LocalColors provides colors,
            LocalDimensions provides dimensions,
            content = content
        )
    }
}

public object ConcreteTheme {

    public val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    public val dimensions: Dimensions
        @Composable
        @ReadOnlyComposable
        get() = LocalDimensions.current

}

@Composable
private fun createMaterial3ColorScheme(
    accent: Colors.Accent,
    content: Colors.Content,
    layer: Colors.Layer,
): ColorScheme = colorScheme.copy(
    background = layer.midground,
    inverseOnSurface = layer.foreground,
    inversePrimary = contentColor(accent.primary),
    inverseSurface = layer.inverseForeground,
    onBackground = content.normal,
    onError = Color.Unspecified,
    onErrorContainer = Color.Unspecified,
    onPrimary = contentColor(accent.primary),
    onPrimaryContainer = contentColor(accent.primary),
    onSecondary = contentColor(accent.secondary),
    onSecondaryContainer = contentColor(accent.secondary),
    onSurface = content.normal,
    onSurfaceVariant = content.normal,
    onTertiary = contentColor(accent.tertiary),
    onTertiaryContainer = contentColor(accent.tertiary),
    outline = content.normal,
    outlineVariant = content.normal,
    primary = accent.primary,
    primaryContainer = accent.primary,
    scrim = layer.foreground,
    secondary = accent.secondary,
    secondaryContainer = accent.secondary,
    surface = layer.foreground,
    surfaceBright = layer.foreground,
    surfaceContainer = layer.foreground,
    surfaceContainerHigh = layer.foreground,
    surfaceContainerHighest = layer.foreground,
    surfaceContainerLow = layer.foreground,
    surfaceContainerLowest = layer.foreground,
    surfaceDim = layer.foreground,
    surfaceTint = layer.foreground,
    surfaceVariant = layer.foreground,
    tertiary = accent.tertiary,
    tertiaryContainer = accent.tertiary,
)
