package com.example.movieui.core.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.movieui.module.detail.presentation.DetailScreen
import com.example.movieui.module.home.model.upcomingMovie
import com.example.movieui.module.home.presentation.HomeScreen
import com.example.movieui.module.seat_selector.presentation.SeatSelectorScreen
import com.example.movieui.module.login.presentation.LoginScreen
import com.example.movieui.module.splash.presentation.SplashScreen

object AppRoute {

    @Composable
    fun GenerateRoute(navController: NavHostController) {
        NavHost(
            navController = navController,
            startDestination = AppRouteName.Splash,
        ) {
            composable(AppRouteName.Splash) {
                SplashScreen(navController = navController)
            }

            composable(AppRouteName.Login) {
                LoginScreen(navController = navController)
            }

            composable(AppRouteName.Home) {
               HomeScreen(navController = navController)
            }
            composable("${AppRouteName.Detail}/{id}") { backStackEntry ->
                val id = backStackEntry.arguments?.getString("id")
                val movie = upcomingMovie.first{ it.id == id }

                DetailScreen(navController = navController, movie)
            }
            composable(AppRouteName.SeatSelector) {
                SeatSelectorScreen(navController = navController)
            }
        }
    }
}