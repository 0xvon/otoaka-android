package com.example.otoaka.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.otoaka.databinding.FragmentHomeBinding
import com.example.otoaka.ui.home.gigList.GigAdapter
import com.example.otoaka.ui.home.gigList.GigState
import com.example.otoaka.ui.home.snackEventList.SnackEventAdapter
import com.example.otoaka.ui.home.snackEventList.SnackEventState

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val root: View = binding.root
        val states = arrayListOf<SnackEventState>()
        for (i in 0..10) {
            val state = SnackEventState(10000)
            states.add(state)
        }
        val adapter = SnackEventAdapter(requireContext(), states)

        binding.snackEventList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.snackEventList.adapter = adapter

        val gigStates = arrayListOf<GigState>()
        for (i in 0..10) {
            val gigState = GigState(10000)
            gigStates.add(gigState)
        }
        val gigAdapter = GigAdapter(requireContext(), gigStates)

        val gigRecycler = binding.gigList
        gigRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        gigRecycler.adapter = gigAdapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}