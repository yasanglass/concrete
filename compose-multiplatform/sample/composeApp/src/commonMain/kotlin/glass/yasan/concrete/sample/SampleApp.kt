package glass.yasan.concrete.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import glass.yasan.concrete.composeapp.generated.resources.Res
import glass.yasan.concrete.composeapp.generated.resources.app_title
import glass.yasan.concrete.foundation.font.rubikMonoFontFamily
import glass.yasan.concrete.sample.theme.AppTheme
import org.jetbrains.compose.resources.stringResource

@Composable
fun SampleApp() {
    AppTheme {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize(),
        ) {
            Text(
                text = stringResource(Res.string.app_title).uppercase(),
                fontFamily = rubikMonoFontFamily(),
                fontSize = 32.sp,
            )
        }
    }
}
