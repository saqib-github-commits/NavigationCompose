package com.example.composenavigation.viewModels

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel(), DefaultLifecycleObserver {

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("lifecycle-", "HomeViewModel onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("lifecycle-", "HomeViewModel onPause")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d("lifecycle-", "HomeViewModel onStart")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)

        Log.d("lifecycle-", "HomeViewModel onStop")
    }

}