package com.ieee.events.ui.EventFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ieee.events.R
import com.ieee.events.data.Models.Particepent
import com.ieee.events.databinding.FragmentEventBinding
import com.ieee.events.databinding.FragmentHomeBinding
import com.ieee.events.ui.BookEvent.adapter.ParticipantAdapter

private var _binding:FragmentEventBinding? = null
    private val binding get() = _binding!!

class EventFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventBinding.inflate(layoutInflater, container, false)



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



}