package glass.yasan.concrete.foundation.color

import androidx.compose.ui.graphics.Color

public object ColorTokens {

    // Accent
    public val accentPrimary: Color = Color(0xFF006970)

    // Light
    private val foregroundLight: Color = Color(0xFFFFFFFF)
    private val midgroundLight: Color = Color(0xFFEEEEEE)
    private val backgroundLight: Color = Color(0xFFD8D8D8)
    private val contentNormalLight: Color = Color(0xFF212121)
    private val contentSubtleLight: Color = Color(0xFF666666)

    // Dark
    private val foregroundDark: Color = Color(0xFF1F1F1F)
    private val midgroundDark: Color = Color(0xFF121212)
    private val backgroundDark: Color = Color(0xFF000000)
    private val contentNormalDark: Color = Color(0xFFE0E0E0)
    private val contentSubtleDark: Color = Color(0xFFA0A0A0)

    // Content
    public val contentLight: Content = Content(
        normal = contentNormalLight,
        subtle = contentSubtleLight,
        inverseNormal = contentNormalDark,
        inverseSubtle = contentSubtleDark,
    )
    public val contentDark: Content = Content(
        normal = contentNormalDark,
        subtle = contentSubtleDark,
        inverseNormal = contentNormalLight,
        inverseSubtle = contentSubtleLight,
    )

    // Layer
    public val layerLight: Layer = Layer(
        foreground = foregroundLight,
        midground = midgroundLight,
        background = backgroundLight,
        inverseForeground = foregroundDark,
        inverseMidground = midgroundDark,
        inverseBackground = backgroundDark,
    )
    public val layerDark: Layer = Layer(
        foreground = foregroundDark,
        midground = midgroundDark,
        background = backgroundDark,
        inverseForeground = foregroundLight,
        inverseMidground = midgroundLight,
        inverseBackground = backgroundLight,
    )

}
