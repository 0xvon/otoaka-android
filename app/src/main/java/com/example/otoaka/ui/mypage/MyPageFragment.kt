package com.example.otoaka.ui.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.otoaka.R
import com.example.otoaka.databinding.FragmentNotificationsBinding
import com.example.otoaka.ui.home.MyPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MyPageFragment : Fragment() {

    private lateinit var demoCollectionAdapter: MyPagerAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var myPageViewModel: MyPageViewModel
    private var _binding: FragmentNotificationsBinding? = null


    private val items: MutableList<String> = mutableListOf(
        "Page 1",
        "Page 2",
        "Page 3"
    )


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myPageViewModel =
            ViewModelProvider(this).get(MyPageViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.name
        myPageViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        demoCollectionAdapter = MyPagerAdapter(this)
        viewPager = view.findViewById(R.id.pager)
        viewPager.adapter = demoCollectionAdapter

        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val tabLayout = binding.tabLayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = " ${(position + 1)}"
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}