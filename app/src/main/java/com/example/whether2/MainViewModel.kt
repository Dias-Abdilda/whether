package com.example.whether2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData <String>()
}