package com.ieee.events.ui.ticketsFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.models.Events
import com.ieee.events.databinding.EventSmallLayoutBinding
import com.ieee.events.ui.exploreFragment.ExploreEventsAdapter

class CanceledTicketsAdapter(val events: List<Events>) : RecyclerView.Adapter<CanceledTicketsAdapter.ViewHolder> () {

    inner class ViewHolder(val binding: EventSmallLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            EventSmallLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.eventSmallTitle.text = events[position].eventName
        holder.binding.eventSmallDateAndTime.text = events[position].dateOfEvent
        holder.binding.eventSmallLocation.text = events[position].locationOfEvent
        holder.binding.eventSmallImage.setBackgroundResource(events[position].imageOfEvent)


    }

    override fun getItemCount(): Int {
        return events.size
    }
}