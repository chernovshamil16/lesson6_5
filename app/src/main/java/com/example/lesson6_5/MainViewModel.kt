package com.example.lesson6_5

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var nCounter = MutableLiveData<Int>()

    var resultAdapter = MutableLiveData<String>()

    private var count = 0

    var history = ""


    fun onIncrement() {
        count++
        nCounter.value = count
        history="$history\n+"
        resultAdapter.value=history
    }
    fun onDecrement() {
        count--
        nCounter.value = count
        history="$history\n-"
        resultAdapter.value=history
    }

}