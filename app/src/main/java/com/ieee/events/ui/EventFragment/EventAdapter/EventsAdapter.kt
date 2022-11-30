package com.ieee.events.ui.EventFragment.EventAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.models.Events
import com.ieee.events.databinding.EventsLiBinding

class EventsAdapter constructor(val event: List<Events>):RecyclerView.Adapter<EventsAdapter.ViewHolder>() {
    inner class  ViewHolder(val binding: EventsLiBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            EventsLiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.eventName.text = event[position].eventName
        holder.binding.locationEventRv.text = event[position].locationOfEvent
        holder.binding.dateEventRv.text = event[position].dateOfEvent
        holder.binding.eventImageRv.setBackgroundResource(event[position].imageOfEvent)

    }

    override fun getItemCount(): Int {

        return event.size
    }

}