package com.example.koin

import androidx.lifecycle.ViewModel

class MainViewModel(val school: School,val friend: Friend):ViewModel() {

    fun performance():String
    {
        return "performance"
    }
}