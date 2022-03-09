package com.example.otoaka.ui.home.gigList

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.otoaka.ui.home.snackEventList.SnackEventItemView
import com.example.otoaka.ui.home.snackEventList.SnackEventItemViewHolder
import com.example.otoaka.ui.home.snackEventList.SnackEventState

class GigAdapter(
    private val context: Context,
    private val states: List<GigState>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = GigItemView(context)
        return GigItemViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        if (viewHolder is GigItemViewHolder) {
            viewHolder.update(states[position])
        }
    }

    override fun getItemCount(): Int {
        return states.count()
    }
}