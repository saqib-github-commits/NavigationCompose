package com.example.composenavigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalLifecycleOwner
import com.example.composenavigation.extension.observeLifecycleEvents
import com.example.composenavigation.viewModels.HomeViewModel
import com.example.composenavigation.viewModels.SongsViewModel

@Composable
fun SongsScreen(viewModel: SongsViewModel = SongsViewModel()) {

    viewModel.observeLifecycleEvents(LocalLifecycleOwner.current.lifecycle)

    Column {
        Text(text = "Songs Screen")
    }
}

