package com.example.databindingapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val VALUE = "Your data"
    val _data: MutableLiveData<String> = MutableLiveData(VALUE)
    val data: LiveData<String> = _data

    fun updateText(data: String) {
        if (data.isEmpty()) {
            _data.value = VALUE
            return
        }
        _data.value = data
    }
}