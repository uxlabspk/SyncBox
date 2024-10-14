package io.github.uxlabspk.syncbox.View.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.syncbox.ui.theme.SF_Font_Family

@Composable
fun AppBar(text: String, modifier: Modifier, onClick: () -> Unit) {
    Surface(
        Modifier.fillMaxWidth().height(55.dp),
        shadowElevation = 3.dp
    ) {
        Row(
            modifier
                .background(MaterialTheme.colorScheme.background)
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text,
                fontFamily = SF_Font_Family,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Start,
                modifier = Modifier
            )
            IconButton(onClick = onClick) {
                Icon(Icons.Default.Add, contentDescription = null, tint = Color(0xff0080ff))
//                Text(
//                    "Add",
//                    fontFamily = SF_Font_Family,
//                    fontSize = 16.sp,
//                    fontWeight = FontWeight.Medium,
//                    textAlign = TextAlign.Start,
//                    modifier = Modifier, color = Color(0xff0080ff)
//                )
            }
        }
    }
}