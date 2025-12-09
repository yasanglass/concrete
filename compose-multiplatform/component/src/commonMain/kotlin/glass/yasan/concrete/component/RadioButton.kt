package glass.yasan.concrete.component

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import glass.yasan.concrete.foundation.theme.ConcreteTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.material3.RadioButton as Material3RadioButton
import androidx.compose.material3.RadioButtonDefaults as Material3RadioButtonDefaults

@Composable
public fun RadioButton(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
) {
    Material3RadioButton(
        selected = selected,
        enabled = enabled,
        colors = Material3RadioButtonDefaults.colors(
            disabledSelectedColor = ConcreteTheme.colors.contentDisabled,
            disabledUnselectedColor = ConcreteTheme.colors.contentDisabled,
            selectedColor = ConcreteTheme.colors.content,
            unselectedColor = ConcreteTheme.colors.content,
        ),
        interactionSource = interactionSource,
        onClick = onClick,
        modifier = modifier,
    )
}

@Preview
@Composable
private fun RadioButtonPreview() {
    val selected = arrayOf(true, false)
    val enabled = arrayOf(true, false)

    Column {
        ConcreteTheme {
            Column(
                modifier = Modifier.background(ConcreteTheme.colors.foreground)
            ) {
                selected.forEach { isSelected ->
                    enabled.forEach { isEnabled ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 16.dp),
                        ) {
                            val checkedStatus = if (isSelected) "Selected" else "Unselected"
                            val enabledStatus = if (isEnabled) "Enabled" else "Disabled"

                            Text(
                                text = "Checkbox: $checkedStatus + $enabledStatus",
                                modifier = Modifier.weight(1f),
                            )
                            RadioButton(
                                selected = isSelected,
                                enabled = isEnabled,
                                onClick = {},
                                modifier = Modifier.padding(8.dp),
                            )
                        }
                        HorizontalDivider()
                    }
                }
            }
        }
    }
}
