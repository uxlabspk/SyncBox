package io.github.uxlabspk.syncbox

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.uxlabspk.syncbox.View.AccountScreen
import io.github.uxlabspk.syncbox.View.IntroScreen
import io.github.uxlabspk.syncbox.View.LoginScreen
import io.github.uxlabspk.syncbox.View.SignUpScreen

@Composable
fun SyncBoxNavHost (navController: NavHostController = rememberNavController()) {
    val startScreen = "IntroScreen"

    NavHost(navController = navController, startDestination = startScreen) {
        composable("IntroScreen") {
            IntroScreen(navController)
        }

        composable("AccountScreen") {
            AccountScreen(navController)
        }

        composable("LoginScreen") {
            LoginScreen(navController)
        }

        composable("SignUpScreen") {
            SignUpScreen(navController)
        }
    }
}