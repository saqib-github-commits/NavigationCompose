package com.example.composenavigation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier.testTag("test_tag_home_screen"),
    onNavigateToSongs: () -> Unit,
    onNavigateToFavourites: () -> Unit,
    onNavigateToSearch: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            modifier = Modifier.testTag("test_tag_go_to_songs"),
            onClick = { onNavigateToSongs() },
        ) {
            Text(text = "Go to Songs")
        }
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = { onNavigateToFavourites() }) {
            Text(text = "Go to Favourites")
        }
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = { onNavigateToSearch() }) {
            Text(text = "Search Song")
        }

    }

}