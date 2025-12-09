package glass.yasan.concrete.foundation.color

import androidx.compose.ui.graphics.Color
import glass.yasan.toolkit.compose.color.darken
import glass.yasan.toolkit.compose.color.lighten

public fun Color.heighten(isDark: Boolean): Color = if (isDark) lighten() else darken()

public fun Color.lower(isDark: Boolean): Color = if (isDark) darken() else lighten()
