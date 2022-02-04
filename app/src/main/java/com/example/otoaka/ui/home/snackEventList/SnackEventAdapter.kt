package com.example.otoaka.ui.home.snackEventList

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SnackEventAdapter(
    private val context: Context,
    private val states: List<SnackEventState>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = SnackEventItemView(context)
        return SnackEventItemViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        if (viewHolder is SnackEventItemViewHolder) {
            viewHolder.update(states[position])
        }
    }

    override fun getItemCount(): Int {
        return states.count()
    }
}