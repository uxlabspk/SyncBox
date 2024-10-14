package io.github.uxlabspk.syncbox.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.uxlabspk.syncbox.View.Components.AppBar
import io.github.uxlabspk.syncbox.View.Components.TodoContainer
import io.github.uxlabspk.syncbox.View.Components.TopBar

@Composable
fun TodoScreen(navController: NavController) {
    Column {
        AppBar(text = "All Todo's", modifier = Modifier ) {
            // Adding logic goes here.
        }

        LazyColumn(
            modifier = Modifier
                .padding(horizontal = 10.dp)
        ) {
            items(18) {
                TodoContainer("TITLE", "SHORT DESCRIPTION", {}, {})
            }
        }
    }
}