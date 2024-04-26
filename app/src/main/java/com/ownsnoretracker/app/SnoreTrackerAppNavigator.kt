package com.ownsnoretracker.app

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ownsnoretracker.feature_graph.presentation.GraphScreen
import com.ownsnoretracker.feature_main.presentation.MainHomeScreen
import com.ownsnoretracker.feature_navigation.Route
import com.ownsnoretracker.feature_setting.presentation.SettingScreen

@Composable
fun SnoreTrackerAppNavigator(
    navHostController: NavHostController,
    uiRoute: State<String>,
    onNavigate: (String) -> Unit
) {

    NavHost(
        navController = navHostController,
        startDestination = Route.HOME,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None },
    ) {
        composable(Route.HOME) {
            onNavigate(Route.HOME)
            MainHomeScreen(navHostController)
        }

        composable(Route.GRAPH) {
            onNavigate(Route.GRAPH)
            GraphScreen(navHostController = navHostController)
        }

        composable(Route.SETTINGS) {
            onNavigate(Route.SETTINGS)
            SettingScreen(navHostController = navHostController)
        }
    }
}