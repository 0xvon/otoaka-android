package com.example.otoaka.ui.home.gigList

import androidx.recyclerview.widget.RecyclerView
import com.example.otoaka.ui.home.snackEventList.SnackEventItemView
import com.example.otoaka.ui.home.snackEventList.SnackEventState

class GigItemViewHolder(private val view: GigItemView) :
    RecyclerView.ViewHolder(view) {
    fun update(state: GigState) {
        view.update(state)
    }
}