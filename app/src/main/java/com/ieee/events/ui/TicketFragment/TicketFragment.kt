package com.ieee.events.ui.TicketFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ieee.events.R
import com.ieee.events.data.Models.Particepent
import com.ieee.events.databinding.FragmentTicketBinding
import com.ieee.events.ui.BookEvent.adapter.ParticipantAdapter

class TicketFragment : Fragment() {
    private var _binding:FragmentTicketBinding?=null
    private val binding get() =  _binding!!
    private lateinit var particeList : ArrayList<Particepent>
    private lateinit var parAdapter: ParticipantAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTicketBinding.inflate(layoutInflater,container,false)
        particeList = ArrayList()
        parAdapter = ParticipantAdapter(particeList)
        binding.particepentRv.layoutManager = LinearLayoutManager(requireContext())
        binding.particepentRv.adapter = parAdapter

        return binding.root
    }


}