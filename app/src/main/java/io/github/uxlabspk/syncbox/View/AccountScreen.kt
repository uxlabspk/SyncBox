package io.github.uxlabspk.syncbox.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.uxlabspk.syncbox.R
import io.github.uxlabspk.syncbox.View.Components.PinkButton
import io.github.uxlabspk.syncbox.View.Components.PrimaryButton
import io.github.uxlabspk.syncbox.View.Components.TopBar

@Composable
fun AccountScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        TopBar(text = "Account Selection", modifier = Modifier) {
            navController.navigateUp()
        }
        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.img_account_screen), contentDescription = "account image", modifier = Modifier.align(Alignment.CenterHorizontally))

            PrimaryButton(text = "Sign In", modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)) {
                navController.navigate("LoginScreen")
            }

            PrimaryButton(text = "Register", modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp, vertical = 10.dp)) {
                navController.navigate("SignUpScreen")
            }

            PinkButton(text = "Continue With Google", modifier = Modifier.fillMaxWidth().padding(horizontal = 40.dp)) {
                navController.navigate("LoginScreen")
            }

        }
    }
}