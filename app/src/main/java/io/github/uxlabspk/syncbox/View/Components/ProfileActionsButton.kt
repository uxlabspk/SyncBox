package io.github.uxlabspk.syncbox.View.Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.uxlabspk.syncbox.ui.theme.GrayColor
import io.github.uxlabspk.syncbox.ui.theme.OffWhiteColor
import io.github.uxlabspk.syncbox.ui.theme.SF_Font_Family

@Composable
fun ProfileActionsButton(text: String, modifier: Modifier, icon: ImageVector, onClick: () -> Unit) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
            .clickable { onClick },
        shape = RoundedCornerShape(5.dp),
    ) {
        Row(
            modifier = Modifier.padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text, fontFamily = SF_Font_Family, fontWeight = FontWeight.Medium)
            Icon(icon, contentDescription = null)
        }
    }
}