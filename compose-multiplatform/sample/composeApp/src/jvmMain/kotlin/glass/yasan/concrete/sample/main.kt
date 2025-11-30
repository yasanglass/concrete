package glass.yasan.concrete.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import glass.yasan.concrete.composeapp.generated.resources.Res
import glass.yasan.concrete.composeapp.generated.resources.app_title
import org.jetbrains.compose.resources.stringResource

fun main() {
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = stringResource(Res.string.app_title),
        ) {
            SampleApp()
        }
    }
}
