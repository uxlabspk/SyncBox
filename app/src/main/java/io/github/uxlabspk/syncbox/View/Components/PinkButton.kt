package io.github.uxlabspk.syncbox.View.Components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.syncbox.ui.theme.PinkColor
import io.github.uxlabspk.syncbox.ui.theme.SF_Font_Family
import io.github.uxlabspk.syncbox.ui.theme.WhiteColor

@Composable
fun PinkButton(text: String, modifier: Modifier, onClick: () -> Unit) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(24.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = PinkColor,
            contentColor = WhiteColor
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 2.dp
        )
    ) {
        Text(text, fontFamily = SF_Font_Family, fontWeight = FontWeight.Medium, fontSize = 14.sp)
    }
}