package com.example.akhbar.Src.Navgraph

sealed class Route(val route:String) {
    object OnBoardScreen: Route(route = "OnBoardingScreen")
    object HomeScreen:Route(route = "HomeScreen")
    object SearchScreen:Route(route="SearchScreen")
    object  BookMarkScreen:Route(route = "BookMarkScreen")
    object DetailsScreen:Route(route = "DetailsScreen")
    object AppStartingNavigation:Route(route = "AppStartingNavigation")
    object NewsNavigation:Route(route = "NewsNavigation")
    object NewsNavigationScreen:Route(route = "NewsNavigationScreen")
}