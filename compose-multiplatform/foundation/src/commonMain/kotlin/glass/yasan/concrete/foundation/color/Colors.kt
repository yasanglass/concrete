package glass.yasan.concrete.foundation.color

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

public data class Colors(
    val accent: Accent,
    val content: Content,
    val layer: Layer,
) {

    public companion object {
        private const val CONTAINER_ALPHA = 0.5f

        public fun Color.container(): Color = this.copy(alpha = CONTAINER_ALPHA)

    }

    public data class Accent(
        val primary: Color,
        val secondary: Color = primary,
        val tertiary: Color = secondary,
    )

    public data class Content(
        val normal: Color,
        val subtle: Color,
        val inverseNormal: Color,
        val inverseSubtle: Color,
    )

    public data class Layer(
        val foreground: Color,
        val midground: Color,
        val background: Color,
        val inverseForeground: Color,
        val inverseMidground: Color,
        val inverseBackground: Color,
    )

}

internal val LocalColors: ProvidableCompositionLocal<Colors> =
    compositionLocalOf {
        Colors(
            accent = Colors.Accent(primary = ColorTokens.accentPrimary),
            content = ColorTokens.contentLight,
            layer = ColorTokens.layerLight,
        )
    }

@Composable
internal expect fun rememberDynamicAccent(isDark: Boolean): Colors.Accent?

@Composable
internal fun rememberAccent(
    isDark: Boolean,
    primary: Color,
    secondary: Color,
    tertiary: Color,
): Colors.Accent = rememberDynamicAccent(isDark) ?: remember(primary, secondary, tertiary) {
    Colors.Accent(
        primary = primary,
        secondary = secondary,
        tertiary = tertiary,
    )
}
