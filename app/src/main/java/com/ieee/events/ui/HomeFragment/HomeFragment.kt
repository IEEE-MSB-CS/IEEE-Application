package com.ieee.events.ui.HomeFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ieee.events.R
import com.ieee.events.data.Models.UpcomingEvent
import com.ieee.events.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    lateinit var upcomingEventsAdapter: UpcomingEventsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val event1 =
            UpcomingEvent(1, "event 1", "2020/22/5", R.drawable.ic_launcher_background, "cairo")
        val event2 =
            UpcomingEvent(2, "event 2", "2020/22/5", R.drawable.ic_launcher_background, "cairo")
        val event3 =
            UpcomingEvent(3, "event 3", "2020/22/5", R.drawable.ic_launcher_background, "cairo")
        val event4 =
            UpcomingEvent(4, "event 4", "2020/22/5", R.drawable.ic_launcher_background, "cairo")


        val list: List<UpcomingEvent> = mutableListOf(event1, event2, event3, event4)

        upcomingEventsAdapter = UpcomingEventsAdapter(list)
        binding.upcomingEventsRecylcerView.adapter = upcomingEventsAdapter


    }
}