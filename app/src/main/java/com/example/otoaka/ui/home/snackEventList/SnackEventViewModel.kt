package com.example.otoaka.ui.home.snackEventList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class SnackEventViewModel {
    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

}