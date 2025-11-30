package glass.yasan.concrete.foundation.typography

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import glass.yasan.concrete.foundation.font.rubikFontFamily

@Composable
public fun rubikTypography(): Typography = typography(
    fontFamily = rubikFontFamily(),
)
