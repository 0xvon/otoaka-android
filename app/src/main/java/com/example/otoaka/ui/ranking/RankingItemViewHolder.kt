package com.example.otoaka.ui.ranking

import androidx.recyclerview.widget.RecyclerView

class RankingItemViewHolder(private val view: RankingItemView) : RecyclerView.ViewHolder(view) {
    fun update(state: RankingState) {
        view.update(state)
    }
}