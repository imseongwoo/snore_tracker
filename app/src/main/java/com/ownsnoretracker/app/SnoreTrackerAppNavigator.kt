package com.ownsnoretracker.app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ownsnoretracker.feature_main.presentation.MainHomeScreen
import com.ownsnoretracker.feature_navigation.Route

@Composable
fun SnoreTrackerAppNavigator(
    navHostController: NavHostController,
    uiRoute: State<String>,
    onNavigate: (String) -> Unit
) {

    NavHost(navController = navHostController, startDestination = Route.HOME) {
        composable(Route.HOME) {
            onNavigate(Route.HOME)
            MainHomeScreen(navHostController)
        }
    }
}