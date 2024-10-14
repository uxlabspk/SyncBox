package io.github.uxlabspk.syncbox.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.Text
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
import io.github.uxlabspk.syncbox.ui.theme.SF_Font_Family

@Composable
fun MeetingsScreen(navController: NavController) {
    Column {
        AppBar(text = "All Meetings", modifier = Modifier ) {
            // Adding logic goes here.
        }

        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.img_meeting_screen), contentDescription = "No teams found illustration")
            Text(
                "No Teams Found",
                fontFamily = SF_Font_Family,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onBackground
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                PrimaryButton(text = "Create new", modifier = Modifier) {

                }
                
                Text(
                    "OR",
                    modifier = Modifier.padding(horizontal = 10.dp),
                    fontFamily = SF_Font_Family,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(
                        "Join a Link",
                        fontFamily = SF_Font_Family,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                }
            }
        }

    }
}