package glass.yasan.kepko.foundation.theme

public enum class ThemeStyle(
    public val id: String,
    public val isDark: Boolean = false,
) {
    LIGHT(
        id = "light",
        isDark = false,
    ),
    DARK(
        id = "dark",
        isDark = true
    ),
    DARK_AMOLED(
        id = "dark-amoled",
        isDark = true,
    ),
    ;

    public companion object {

        public fun fromDarkMode(isDark: Boolean): ThemeStyle = if (isDark) DARK else LIGHT

        public fun fromId(id: String): ThemeStyle? = entries.find { it.id == id }

    }
}
