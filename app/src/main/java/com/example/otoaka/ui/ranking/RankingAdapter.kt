package com.example.otoaka.ui.ranking

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.otoaka.R
import com.example.otoaka.databinding.ItemRankingLayoutBinding

class RankingAdapter(
    private val context: Context,
    private val states: List<RankingState>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = RankingItemView(context)
        return RankingItemViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        if (viewHolder is RankingItemViewHolder) {
            viewHolder.update(states[position])
        }
    }

    override fun getItemCount(): Int {
        return states.count()
    }
}