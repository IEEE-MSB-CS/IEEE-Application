package com.ieee.events.ui.ticketsFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.models.Events
import com.ieee.events.databinding.CompletedEventLayoutBinding
import com.ieee.events.databinding.EventSmallLayoutBinding
import com.ieee.events.ui.exploreFragment.ExploreEventsAdapter

class CompletedTicketsAdapter constructor(val events: List<Events>) : RecyclerView.Adapter<CompletedTicketsAdapter.ViewHolder> () {

    inner class ViewHolder(val binding: CompletedEventLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            CompletedEventLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.completedEventTitle.text = events[position].eventName
        holder.binding.completedEventDateAndTime.text = events[position].dateOfEvent
        holder.binding.completedEventLocation.text = events[position].locationOfEvent
        holder.binding.completedEventImage.setBackgroundResource(events[position].imageOfEvent)


    }

    override fun getItemCount(): Int {
        return events.size
    }
}