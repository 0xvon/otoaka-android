package com.example.otoaka.ui.home.snackEventList

import androidx.recyclerview.widget.RecyclerView

class SnackEventItemViewHolder(private val view: SnackEventItemView) :
    RecyclerView.ViewHolder(view) {
    fun update(state: SnackEventState) {
        view.update(state)
    }
}