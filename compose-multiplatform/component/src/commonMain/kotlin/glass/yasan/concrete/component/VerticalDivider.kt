package glass.yasan.concrete.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import glass.yasan.concrete.foundation.theme.ConcreteTheme
import androidx.compose.material3.VerticalDivider as Material3VerticalDivider

@Composable
public fun VerticalDivider(
    modifier: Modifier = Modifier,
    color: Color = ConcreteTheme.colors.background,
    thickness: Dp = ConcreteTheme.dimensions.borderStrokeWidth,
) {
    Material3VerticalDivider(
        modifier = modifier,
        thickness = thickness,
        color = color,
    )
}
