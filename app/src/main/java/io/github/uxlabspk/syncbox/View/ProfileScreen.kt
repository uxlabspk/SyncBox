package io.github.uxlabspk.syncbox.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.github.uxlabspk.syncbox.R
import io.github.uxlabspk.syncbox.View.Components.AppBar
import io.github.uxlabspk.syncbox.View.Components.PrimaryButton
import io.github.uxlabspk.syncbox.View.Components.ProfileActionsButton
import io.github.uxlabspk.syncbox.ui.theme.SF_Font_Family

@Composable
fun ProfileScreen(navController: NavController) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppBar(text = "Profile", modifier = Modifier ) {
            // Adding logic goes here.
        }

        Column(
            modifier = Modifier

                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_logo), contentDescription = "User profile pic", modifier = Modifier.padding(vertical = 20.dp))
            Text(
                "Muhammad Naveed",
                fontFamily = SF_Font_Family,
                fontWeight = FontWeight.Medium,
                fontSize = 22.sp
            )
            Text(
                "naveed@codehuntspk.com",
                fontFamily = SF_Font_Family,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 60.dp)
        ) {
            ProfileActionsButton("sdf",Modifier, Icons.Default.Person, {})
            ProfileActionsButton("sdf", Modifier, Icons.Default.Person, {})
            ProfileActionsButton("sdf", Modifier, Icons.Default.Person, {})
        }

    }

}