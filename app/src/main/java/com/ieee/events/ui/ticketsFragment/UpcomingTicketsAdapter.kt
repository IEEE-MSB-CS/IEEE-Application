package com.ieee.events.ui.ticketsFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.models.Events
import com.ieee.events.databinding.UpcomingEventLayoutBinding
import com.ieee.events.ui.exploreFragment.ExploreEventsAdapter

class UpcomingTicketsAdapter constructor(val events: List<Events>) : RecyclerView.Adapter<UpcomingTicketsAdapter.ViewHolder> () {

    inner class ViewHolder(val binding: UpcomingEventLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            UpcomingEventLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.upcomingEventTitle.text = events[position].eventName
        holder.binding.upcomingEventDateAndTime.text = events[position].dateOfEvent
        holder.binding.upcomingEventLocation.text = events[position].locationOfEvent
        holder.binding.upcomingEventImage.setBackgroundResource(events[position].imageOfEvent)


    }

    override fun getItemCount(): Int {
        return events.size
    }

}