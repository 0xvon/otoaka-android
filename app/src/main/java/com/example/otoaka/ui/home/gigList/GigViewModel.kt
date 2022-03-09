package com.example.otoaka.ui.home.gigList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class GigViewModel {
    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

}