package com.ieee.events.ui.EventFragment.EventAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.Models.EventDeatils
import com.ieee.events.databinding.EventDetailsLiBinding
import com.ieee.events.databinding.EventItemBinding

class EventDetailsAdapter constructor(val eventDetails: List<EventDeatils>) : RecyclerView.Adapter<EventDetailsAdapter.ViewHolder>() {
    inner class ViewHolder(val binding:EventDetailsLiBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view =
           EventDetailsLiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textEventDetailsTxt.text  = eventDetails[position].eventDetailsText
        holder.binding.moreDetailsTextEventDetailsTxt.text = eventDetails[position].moreDetails
        holder.binding.eventDetailsImg.setBackgroundResource(eventDetails[position].imageEventDetails)
    }

    override fun getItemCount(): Int {
       return eventDetails.size
    }
}