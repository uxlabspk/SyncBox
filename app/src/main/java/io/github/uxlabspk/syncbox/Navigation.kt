package io.github.uxlabspk.syncbox

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.uxlabspk.syncbox.View.IntroScreen
import io.github.uxlabspk.syncbox.View.LoginScreen

@Composable
fun SyncBoxNavHost (navController: NavHostController = rememberNavController()) {
    val startScreen = "IntroScreen"

    NavHost(navController = navController, startDestination = startScreen) {
        composable("IntroScreen") {
            IntroScreen(navController)
        }

        composable("LoginScreen") {
            LoginScreen(navController)
        }
    }
}