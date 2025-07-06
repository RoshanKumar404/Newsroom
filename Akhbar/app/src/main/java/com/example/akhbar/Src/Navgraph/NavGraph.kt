package com.example.akhbar.Src.Navgraph

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController // Import NavHostController
import androidx.navigation.compose.NavHost // Import NavHost
import androidx.navigation.compose.composable // Import composable
import androidx.navigation.compose.rememberNavController // Import rememberNavController
import androidx.navigation.navigation // Import navigation (for nested graphs)

import com.example.akhbar.Src.PresentationScreen.Onboarding.OnBoardingScreen
import com.example.akhbar.Src.PresentationScreen.Onboarding.OnBoardingViewModal


@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {

        navigation(
            route = Route.AppStartingNavigation.route,
            startDestination = Route.OnBoardScreen.route
        ) {

            composable(
                route = Route.OnBoardScreen.route
            ) {
                val viewModel: OnBoardingViewModal = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
           //yha par other composable screens add krenge
        }

        // --- News Navigation Graph ---
        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigationScreen.route
        ) {
            composable(route = Route.NewsNavigationScreen.route) {
                Text("NewsScreen")
            }
            // Add other composables for NewsNavigation graph here if any
        }

        // You might have other top-level composable routes or navigation graphs here
    }
}