package com.example.composenavigation

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
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
        composeTestRule.onNodeWithTag("test_tag_home_screen").assertIsDisplayed()
    }

    @Test
    fun appNavHost_verifyGoToSongsButton() {
        composeTestRule.onNodeWithTag("test_tag_go_to_songs").performClick()
        val route = navController.currentDestination?.route
        Assert.assertEquals(route, Screen.Songs.route)
    }
}