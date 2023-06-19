package com.example.composenavigation.viewModels

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel

class SongsViewModel : ViewModel(), DefaultLifecycleObserver {

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)

        Log.d("lifecycle-", "SongsViewModel onStart")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)

        Log.d("lifecycle-", "SongsViewModel onPause")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)

        Log.d("lifecycle-", "SongsViewModel onResume")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)

        Log.d("lifecycle-", "SongsViewModel onStop")
    }

}