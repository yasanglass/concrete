package glass.yasan.kepko.foundation.dimension

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp

public data class Dimensions(
    val borderStrokeWidth: Dp,
)

internal val LocalDimensions: ProvidableCompositionLocal<Dimensions> =
    compositionLocalOf {
        dimensions()
    }
