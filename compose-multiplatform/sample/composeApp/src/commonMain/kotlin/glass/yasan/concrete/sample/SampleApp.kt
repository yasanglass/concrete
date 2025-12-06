package glass.yasan.concrete.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import glass.yasan.concrete.component.TextMono
import glass.yasan.concrete.component.border
import glass.yasan.concrete.composeapp.generated.resources.Res
import glass.yasan.concrete.composeapp.generated.resources.app_title
import glass.yasan.concrete.foundation.theme.ConcreteTheme
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SampleApp() {
    ConcreteTheme {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .background(ConcreteTheme.colors.midground)
                .safeContentPadding()
                .fillMaxSize(),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(ConcreteTheme.colors.foreground)
                    .padding(16.dp),
            ) {
                TextMono(
                    text = stringResource(Res.string.app_title).uppercase(),
                    fontSize = 32.sp,
                )
                Spacer(Modifier.height(12.dp))
                ColorsRow(
                    arrayOf(
                        ConcreteTheme.colors.primaryDark,
                        ConcreteTheme.colors.primary,
                        ConcreteTheme.colors.primaryLight
                    )
                )
                ColorsRow(
                    arrayOf(
                        ConcreteTheme.colors.secondaryDark,
                        ConcreteTheme.colors.secondary,
                        ConcreteTheme.colors.secondaryLight
                    )
                )
                ColorsRow(
                    arrayOf(
                        ConcreteTheme.colors.tertiaryDark,
                        ConcreteTheme.colors.tertiary,
                        ConcreteTheme.colors.tertiaryLight
                    )
                )
                ColorsRow(
                    arrayOf(
                        ConcreteTheme.colors.content,
                        ConcreteTheme.colors.contentSubtle,
                    )
                )
                ColorsRow(
                    arrayOf(
                        ConcreteTheme.colors.foreground,
                        ConcreteTheme.colors.midground,
                        ConcreteTheme.colors.background,
                    )
                )
            }
        }
    }
}

@Composable
private fun ColumnScope.ColorsRow(colors: Array<Color>) {
    Row(
        modifier = Modifier
            .weight(1f),
    ) {
        colors.forEach { color ->
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color)
                    .border(color = ConcreteTheme.colors.background),
            )
        }
    }
}

