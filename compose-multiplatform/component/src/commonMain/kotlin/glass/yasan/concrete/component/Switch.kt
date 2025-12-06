package glass.yasan.concrete.component

import androidx.compose.runtime.Composable
import glass.yasan.concrete.foundation.theme.ConcreteTheme
import androidx.compose.material3.Switch as Material3Switch
import androidx.compose.material3.SwitchDefaults as Material3SwitchDefaults

@Composable
public fun Switch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
) {
    Material3Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        colors = Material3SwitchDefaults.colors(
            // Thumb color
            checkedThumbColor = ConcreteTheme.colors.primary,
            uncheckedThumbColor = ConcreteTheme.colors.content,
            // Track color
            checkedTrackColor = ConcreteTheme.colors.midground,
            uncheckedTrackColor = ConcreteTheme.colors.midground,
            // Border color
            checkedBorderColor = ConcreteTheme.colors.content,
            uncheckedBorderColor = ConcreteTheme.colors.content,
        ),
    )
}
