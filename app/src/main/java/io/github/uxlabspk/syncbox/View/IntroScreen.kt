package io.github.uxlabspk.syncbox.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.drawable.DrawableCompat
import androidx.navigation.NavController
import com.google.firebase.annotations.concurrent.Background
import io.github.uxlabspk.syncbox.R
import io.github.uxlabspk.syncbox.View.Components.PrimaryButton
import io.github.uxlabspk.syncbox.ui.theme.SF_Font_Family

@Composable
fun IntroScreen(navController: NavController) {
    Column (
        Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_logo), contentDescription = "Logo")
        Text("SyncBox",
            Modifier.padding(vertical = 10.dp),
            fontFamily = SF_Font_Family,
            fontWeight = FontWeight.Medium,
            fontSize = 32.sp)
        Text(text = "An all in one app to manage your todo's and meets in one place.", Modifier.padding(vertical = 10.dp), fontFamily = SF_Font_Family, fontWeight = FontWeight.Medium ,fontSize = 16.sp, textAlign = TextAlign.Center)
        PrimaryButton(text = "Get Started", modifier = Modifier.padding(top = 30.dp)) {
            navController.navigate("LoginScreen")
        }
    }
}