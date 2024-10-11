package io.github.uxlabspk.syncbox.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController


@Composable
fun LoginScreen(navController: NavController) {
    Column(modifier = Modifier
        .background(MaterialTheme.colorScheme.background)
        .fillMaxSize()) {
        Text(text = "Login Screen")
    }
}