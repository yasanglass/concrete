package glass.yasan.kepko.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import glass.yasan.kepko.foundation.annotation.ExperimentalKepkoApi
import glass.yasan.kepko.foundation.theme.KepkoTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalKepkoApi::class)
@Composable
public fun PreferenceRadioButton(
    title: String,
    selected: Boolean,
    onClick: () -> Unit,
    leadingIcon: Painter,
    modifier: Modifier = Modifier,
    description: String? = null,
    enabled: Boolean = true,
    annotation: PreferenceAnnotation? = null,
) {
    PreferenceRadioButton(
        title = title,
        selected = selected,
        onClick = onClick,
        modifier = modifier,
        description = description,
        enabled = enabled,
        annotation = annotation,
        leadingContent = {
            Icon(
                painter = leadingIcon,
                contentDescription = null,
            )
        },
    )
}

@OptIn(ExperimentalKepkoApi::class)
@Composable
public fun PreferenceRadioButton(
    title: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    description: String? = null,
    enabled: Boolean = true,
    leadingContent: @Composable () -> Unit = {},
    annotation: PreferenceAnnotation? = null,
) {
    PreferenceContainer(
        title = title,
        description = description,
        onClick = onClick,
        enabled = enabled,
        annotation = annotation,
        modifier = modifier,
        leadingContent = leadingContent,
        trailingContent = {
            RadioButton(
                enabled = enabled,
                selected = selected,
                onClick = onClick,
            )
        }
    )
}

@OptIn(ExperimentalKepkoApi::class)
@Preview
@Composable
private fun PreferenceRadioButtonPreview() {
    val annotations = arrayOf(PreferenceAnnotation.new, null)
    val descriptions = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        null
    )

    KepkoTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                .background(KepkoTheme.colors.midground)
                .padding(vertical = 16.dp),
        ) {
            annotations.forEach { annotation ->
                descriptions.forEach { description ->
                    PreferenceRadioButton(
                        title = "Preference RadioButton",
                        selected = true,
                        onClick = {},
                        enabled = false,
                        leadingIcon = painterResource(Res.drawable.ic_asterisk),
                        modifier = Modifier.padding(horizontal = 16.dp),
                        description = description,
                        annotation = annotation,
                    )
                }
            }
        }
    }
}
