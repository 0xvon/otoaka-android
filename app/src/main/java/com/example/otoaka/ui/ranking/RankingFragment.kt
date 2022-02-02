package com.example.otoaka.ui.ranking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.otoaka.databinding.FragmentRankingBinding


class RankingFragment : Fragment() {

    private lateinit var rankingViewModel: RankingViewModel
    private var _binding: FragmentRankingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rankingViewModel =
            ViewModelProvider(this).get(RankingViewModel::class.java)

        _binding = FragmentRankingBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val states = arrayListOf<RankingState>()
        for (i in 0..10) {
            val state = RankingState(10000)
            states.add(state)
        }
        val adapter = RankingAdapter(requireContext(), states)

        val recycler = binding.rankingList
        recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}