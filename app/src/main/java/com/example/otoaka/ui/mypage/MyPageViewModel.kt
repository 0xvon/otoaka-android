package com.example.otoaka.ui.mypage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyPageViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "marika terao"
    }
    val text: LiveData<String> = _text
}