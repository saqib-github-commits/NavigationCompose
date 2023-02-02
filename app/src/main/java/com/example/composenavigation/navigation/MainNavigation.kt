package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.screens.FavouritesScreen
import com.example.composenavigation.screens.HomeScreen
import com.example.composenavigation.screens.SearchScreen
import com.example.composenavigation.screens.SongsScreen

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Songs: Screen("songs")
    object Favourites: Screen("favourites")
    object Search: Screen("search")
}


@Composable
fun MainNavigation(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) { HomeScreen(
            onNavigateToSongs = { navController.navigate(Screen.Songs.route) {
                launchSingleTop = true
            } },
            onNavigateToFavourites = { navController.navigate(Screen.Favourites.route) },
            onNavigateToSearch = { navController.navigate(Screen.Search.route) }
        )}
        composable(Screen.Songs.route) { SongsScreen() }
        composable(Screen.Favourites.route) { FavouritesScreen() }
        composable(Screen.Search.route) { SearchScreen(
            onNavigateToSongs = { navController.navigate(Screen.Songs.route) {
                // pop up everything to the "home" destination before navigating
                // to "songs" destination
                popUpTo(Screen.Home.route)
            }}
        )}
    }
}