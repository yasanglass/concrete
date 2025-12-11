package glass.yasan.kepko.foundation.font

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import glass.yasan.kepko.foundation.Res
import glass.yasan.kepko.foundation.rubik_mono
import org.jetbrains.compose.resources.Font

@Composable
public fun rubikMonoFontFamily(): FontFamily = FontFamily(
    Font(Res.font.rubik_mono),
)
