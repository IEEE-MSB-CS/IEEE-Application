package com.ieee.events.ui.HomeFragment


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ieee.events.data.Models.UpcomingEvent
import com.ieee.events.databinding.EventItemBinding

class UpcomingEventsAdapter constructor(val events: List<UpcomingEvent>) :
    RecyclerView.Adapter<UpcomingEventsAdapter.Viewholder>() {

    inner class Viewholder(val binding: EventItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<UpcomingEvent>() {
        override fun areItemsTheSame(oldItem: UpcomingEvent, newItem: UpcomingEvent): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: UpcomingEvent, newItem: UpcomingEvent): Boolean {
            return oldItem == newItem
        }
    }

    var differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UpcomingEventsAdapter.Viewholder {
        val view =
            EventItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Viewholder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: UpcomingEventsAdapter.Viewholder, position: Int) {

        //val currentItem = differ.currentList[position]

        holder.binding.eventNameTextView.text = events[position].eventName
        holder.binding.eventImageView.setImageResource(events[position].imageOfEvent)

    }

    override fun getItemCount(): Int {
        return events.size
    }


}