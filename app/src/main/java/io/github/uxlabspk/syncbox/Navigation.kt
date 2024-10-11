package io.github.uxlabspk.syncbox

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun SyncBoxNavHost (navController: NavHostController = rememberNavController()) {
    val startScreen = ""

    NavHost(navController = navController, startDestination = startScreen) {

    }
}