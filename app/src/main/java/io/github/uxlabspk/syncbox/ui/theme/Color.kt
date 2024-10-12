package io.github.uxlabspk.syncbox.ui.theme

import androidx.compose.ui.graphics.Color

val OffWhiteColor = Color(0xFFF7F7F7)
val GrayColor = Color(0xFF4E4E4E)
val LightTextColor = Color(0xFF444444)
val WhiteColor = Color(0xFFFFFFFF)
val BlackColor = Color(0xFF000000)
val PinkColor = Color(0xFFF53649)
val bg_Dark = LightTextColor
val bg_Light = WhiteColor

sealed class ThemeColors(
    val bgColor: Color,
    val bgCard: Color,
    val text: Color
)  {
    data object Night: ThemeColors(
        bgColor = bg_Dark,
        bgCard = GrayColor,
        text = WhiteColor
    )
    data object Day: ThemeColors(
        bgColor = bg_Light,
        bgCard = OffWhiteColor,
        text = LightTextColor
    )
}