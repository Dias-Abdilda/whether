package com.example.whether2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.whether2.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData <WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}