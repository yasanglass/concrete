package glass.yasan.kepko.foundation.font

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import glass.yasan.kepko.foundation.Res
import glass.yasan.kepko.foundation.rubik_black
import glass.yasan.kepko.foundation.rubik_blackitalic
import glass.yasan.kepko.foundation.rubik_bold
import glass.yasan.kepko.foundation.rubik_bolditalic
import glass.yasan.kepko.foundation.rubik_italic
import glass.yasan.kepko.foundation.rubik_light
import glass.yasan.kepko.foundation.rubik_lightitalic
import glass.yasan.kepko.foundation.rubik_medium
import glass.yasan.kepko.foundation.rubik_mediumitalic
import glass.yasan.kepko.foundation.rubik_regular
import org.jetbrains.compose.resources.Font

@Composable
public fun rubikFontFamily(): FontFamily = FontFamily(
    Font(Res.font.rubik_black, FontWeight.Black, FontStyle.Normal),
    Font(Res.font.rubik_blackitalic, FontWeight.Black, FontStyle.Italic),

    Font(Res.font.rubik_bold, FontWeight.Bold, FontStyle.Normal),
    Font(Res.font.rubik_bolditalic, FontWeight.Bold, FontStyle.Italic),

    Font(Res.font.rubik_light, FontWeight.Light, FontStyle.Normal),
    Font(Res.font.rubik_lightitalic, FontWeight.Light, FontStyle.Italic),

    Font(Res.font.rubik_medium, FontWeight.Medium, FontStyle.Normal),
    Font(Res.font.rubik_mediumitalic, FontWeight.Medium, FontStyle.Italic),

    Font(Res.font.rubik_regular, FontWeight.Normal, FontStyle.Normal),
    Font(Res.font.rubik_italic, FontWeight.Normal, FontStyle.Italic),
)
