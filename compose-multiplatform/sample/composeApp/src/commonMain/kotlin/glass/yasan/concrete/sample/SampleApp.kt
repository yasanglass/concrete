package glass.yasan.concrete.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import glass.yasan.concrete.component.TextMono
import glass.yasan.concrete.composeapp.generated.resources.Res
import glass.yasan.concrete.composeapp.generated.resources.app_title
import glass.yasan.concrete.foundation.annotation.ExperimentalConcreteApi
import glass.yasan.concrete.foundation.theme.ConcreteTheme
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalConcreteApi::class)
@Preview
@Composable
fun SampleApp() {
    ConcreteTheme {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(ConcreteTheme.layer.midground),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(ConcreteTheme.layer.foreground)
                    .padding(16.dp),
            ) {
                TextMono(
                    text = stringResource(Res.string.app_title).uppercase(),
                    prominence = SUBTLE,
                    fontSize = 32.sp,
                )
                TextMono(
                    text = stringResource(Res.string.app_title).uppercase(),
                    fontSize = 32.sp,
                )
                TextMono(
                    text = stringResource(Res.string.app_title).uppercase(),
                    prominence = SUBTLE,
                    fontSize = 32.sp,
                )
            }
        }
    }
}
