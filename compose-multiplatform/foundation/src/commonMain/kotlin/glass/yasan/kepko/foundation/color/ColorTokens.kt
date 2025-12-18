package glass.yasan.kepko.foundation.color

import androidx.compose.ui.graphics.Color
import glass.yasan.kepko.foundation.theme.ThemeStyle

public object ColorTokens {

    private val foregroundLight: Color = Color(0xFFFFFFFF)
    private val midgroundLight: Color = Color(0xFFEEEEEE)
    private val backgroundLight: Color = Color(0xFFD8D8D8)

    private val contentLight: Color = Color(0xFF212121)
    private val contentSubtleLight: Color = Color(0xFF666666)
    private val contentDisabledLight: Color = Color(0x80666666)

    private val foregroundDark: Color = Color(0xFF1F1F1F)
    private val midgroundDark: Color = Color(0xFF121212)
    private val backgroundDark: Color = Color(0xFF000000)

    private val foregroundDarkAmoled: Color = Color(0xFF000000)
    private val midgroundDarkAmoled: Color = Color(0xFF000000)
    private val backgroundDarkAmoled: Color = Color(0xFF121212)

    private val outlineLight: Color = backgroundLight
    private val outlineDark: Color = backgroundDark
    private val outlineDarkAmoled: Color = Color(0x80A0A0A0)

    private val contentDark: Color = Color(0xFFE0E0E0)
    private val contentSubtleDark: Color = Color(0xFFA0A0A0)
    private val contentDisabledDark: Color = Color(0x80A0A0A0)

    internal val success: Color = Color(0xFF04B34F)
    internal val onSuccess: Color = Color(0xFF000000)

    internal val information: Color = Color(0xFF0057B8)
    internal val onInformation: Color = Color(0xFFFFFFFF)

    internal val caution: Color = Color(0xFFFF9900)
    internal val onCaution: Color = Color(0xFF000000)

    internal val danger: Color = Color(0xFFD00036)
    internal val onDanger: Color = Color(0xFFFFFFFF)


    internal fun foreground(style: ThemeStyle): Color = when (style) {
        ThemeStyle.LIGHT -> foregroundLight
        ThemeStyle.DARK -> foregroundDark
        ThemeStyle.DARK_AMOLED -> foregroundDarkAmoled
    }

    internal fun midground(style: ThemeStyle): Color = when (style) {
        ThemeStyle.LIGHT -> midgroundLight
        ThemeStyle.DARK -> midgroundDark
        ThemeStyle.DARK_AMOLED -> midgroundDarkAmoled
    }

    internal fun background(style: ThemeStyle): Color = when (style) {
        ThemeStyle.LIGHT -> backgroundLight
        ThemeStyle.DARK -> backgroundDark
        ThemeStyle.DARK_AMOLED -> backgroundDarkAmoled
    }

    internal fun outline(style: ThemeStyle): Color = when (style) {
        ThemeStyle.LIGHT -> outlineLight
        ThemeStyle.DARK -> outlineDark
        ThemeStyle.DARK_AMOLED -> outlineDarkAmoled
    }

    internal fun content(isDark: Boolean): Color = if (isDark) contentDark else contentLight
    internal fun contentSubtle(isDark: Boolean): Color = if (isDark) contentSubtleDark else contentSubtleLight
    internal fun contentDisabled(isDark: Boolean): Color = if (isDark) contentDisabledDark else contentDisabledLight

}
