package io.github.uxlabspk.syncbox.View

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import io.github.uxlabspk.syncbox.ui.theme.SF_Font_Family

@Composable
fun DashboardScreen(navController: NavController) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomAppBar(
                backgroundColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.primary,
                modifier = Modifier.height(70.dp),

            ) {
                listOf(
                    "Todos" to Icons.Filled.CheckCircle,
                    "Meetings" to Icons.Default.Send,
                    "Profile" to Icons.Filled.Person
                ).forEachIndexed { index, (route, icon) ->
                    BottomNavigationItem(
                        icon = { Icon(icon, contentDescription = route) },
                        label = { Text(
                            route,
                            fontFamily = SF_Font_Family,
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp
                        ) },
                        selected = navController.currentBackStackEntry?.destination?.route == route,
                        onClick = { navController.navigate(route) }
                    )
                }
            }
        }
    ) { ip ->
        NavHost(navController = navController, startDestination = "Todos", modifier = Modifier.padding(ip)) {
            composable("Todos") {
                TodoScreen(navController)
            }
            composable("Meetings") {
                MeetingsScreen(navController)
            }
            composable("Profile") {
                ProfileScreen(navController)
            }
        }
    }
}
