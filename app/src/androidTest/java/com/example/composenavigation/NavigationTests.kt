package com.example.composenavigation

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.example.composenavigation.navigation.MainNavigation
import com.example.composenavigation.navigation.Screen
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class NavigationTests {

    @get:Rule
    val composeTestRule = createComposeRule()
    private lateinit var navController: TestNavHostController

    @Before
    fun setupAppNavHost() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(ComposeNavigator())
            MainNavigation(navController = navController)
        }
    }

    @Test
    fun appNavHost_verifyStartDestination() {
        val route = navController.currentDestination?.route
        Assert.assertEquals(route, Screen.Home.route)
    }

    @Test
    fun appNavHost_verifyNavigationToSongs() {
        composeTestRule.onNodeWithTag("go_to_songs").performClick()
        val route = navController.currentDestination?.route
        Assert.assertEquals(route, Screen.Songs.route)
    }
}