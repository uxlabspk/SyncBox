package io.github.uxlabspk.syncbox.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.github.uxlabspk.syncbox.R
import io.github.uxlabspk.syncbox.View.Components.InputField
import io.github.uxlabspk.syncbox.View.Components.PrimaryButton
import io.github.uxlabspk.syncbox.View.Components.TextFieldType
import io.github.uxlabspk.syncbox.View.Components.TopBar
import io.github.uxlabspk.syncbox.ui.theme.SF_Font_Family


@Composable
fun LoginScreen(navController: NavController) {

    var emailState by remember { mutableStateOf("") }
    var passwordState by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        TopBar(text = "Login", modifier = Modifier) {
            navController.navigateUp()
        }
        Column(
            modifier = Modifier.padding(horizontal = 20.dp).fillMaxHeight(), verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.img_signin_screen), contentDescription = "sign in screen illustration", modifier = Modifier.align(Alignment.CenterHorizontally))

            InputField(
                inputState = emailState,
                onValueChange = { emailState = it},
                textFieldType = TextFieldType.Email,
                modifier = Modifier.padding(vertical = 5.dp)
            )

            InputField(
                inputState = passwordState,
                onValueChange = { passwordState = it},
                textFieldType = TextFieldType.Password,
                modifier = Modifier.padding(vertical = 5.dp)
            )

            Text(
                text = "Forget Password?",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp)
                    .clickable {
                        /* Forget Password Logic Goes here */
                    },
                textAlign = TextAlign.End,
                color = Color(0xFF0080FF),
                fontFamily = SF_Font_Family,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )

            PrimaryButton(text = "Login", modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)) {
                /* Perform Login Here */

                navController.navigate("DashboardScreen")
            }

            Text(
                text = "Don't have an account? Create new",
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("SignUpScreen")
                    },
                textAlign = TextAlign.Center,
                color = Color(0xFF0080FF),
                fontFamily = SF_Font_Family,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}
