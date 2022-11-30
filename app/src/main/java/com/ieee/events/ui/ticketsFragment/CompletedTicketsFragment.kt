package com.ieee.events.ui.ticketsFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ieee.events.R
import com.ieee.events.data.models.Events
import com.ieee.events.databinding.FragmentExploreBinding
import com.ieee.events.ui.exploreFragment.ExploreEventsAdapter
import com.ieee.events.ui.exploreFragment.ExploreTagAdapter


class CompletedFragment : Fragment() {


    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    private  lateinit var completedTicketsAdapter: CompletedTicketsAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExploreBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val event1 =
            Events(1, "event 1", "Android", "20/11/2022", R.drawable.event_thumbnail,"Cairo")
        val event2 =
            Events(2, "event 1", "Ios", "20/11/2022", R.drawable.event_thumbnail,"Cairo")
        val event3 =
            Events(3, "event 1", "Web", "20/11/2022", R.drawable.event_thumbnail,"Cairo")
        val event4 =
            Events(4, "event 1", "PR", "20/11/2022", R.drawable.event_thumbnail,"Cairo")


        val list: List<Events> = mutableListOf(event1, event2, event3, event4)

        completedTicketsAdapter = CompletedTicketsAdapter(list)

    }

}